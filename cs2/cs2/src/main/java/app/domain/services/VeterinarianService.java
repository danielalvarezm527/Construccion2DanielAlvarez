package app.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.models.MedicalHistory;
import app.domain.models.Person;
import app.domain.models.Pet;
import app.domain.models.User;
import app.domain.models.Order;
import app.ports.PersonPort;
import app.ports.PetPort;
import app.ports.UserPort;
import app.ports.MedicalHistoryPort;
import app.ports.OrderPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Service
@NoArgsConstructor
public class VeterinarianService {
	@Autowired
	private PersonPort personPort;
	@Autowired
	private PetPort petPort;
	@Autowired
	private UserPort userPort;
	@Autowired
	private OrderPort orderPort;
	@Autowired
	private MedicalHistoryPort medicalHistoryPort;
	
	public void registerPetOwner(Person petOwner) throws Exception {
		Person person = personPort.findByDocumentNumber(petOwner.getDocument());
		if(person != null) {
			throw new Exception("Ya existe un usuario con ese documento");
		}
		if(!person.getRole().equals("PetOwner")) {
			throw new Exception("Este usuario no es de tipo PetOwner");
		}
		
		personPort.savePerson(petOwner);
	}
	
	public void registerPet(Pet pet) throws Exception {
		Pet db_pet = petPort.findById(pet.getId());
		if(db_pet != null) {
			throw new Exception("Esta mascota ya fue creada");
		}
		
		Person person = personPort.findByDocumentNumber(pet.getOwner().getDocument());
		if(person != null) {
			throw new Exception("Ya existe un usuario con ese documento");
		}
		if(!person.getRole().equals("PetOwner")) {
			throw new Exception("Este usuario no es de tipo PetOwner");
		}
		
		petPort.savePet(pet);
	}
	
	public void createMedicalHistory(MedicalHistory medicalHistory) throws Exception {
		User veterinarian = userPort.findByUserDocumentNumber(medicalHistory.getVeterinarian().getDocument());
		if(veterinarian != null) {
			throw new Exception("Ya existe un veterinario con ese documento");
		}
		if(!veterinarian.getRole().equals("Veterinarian")) {
			throw new Exception("Este usuario no es de tipo Veterinario");
		}
		
		Order order = orderPort.findByOrderId(medicalHistory.getOrder().getOrderId());
		if(order == null) {
			throw new Exception("Estas historia medica no tiene asociada una orden");
		}
		
		Pet pet = petPort.findById(medicalHistory.getPet().getId());
		if(pet == null) {
			throw new Exception("No existe una mascota con el id: " + pet.getId());
		}
		if(pet.getId() == order.getPet().getId()) {
			throw new Exception("El id de la mascosa no coincide con el id de la mascota en la orden");
		}
		
		medicalHistory.setVeterinarian(veterinarian);
		medicalHistory.setOrder(order);
		medicalHistory.setPet(pet);
		medicalHistoryPort.save(medicalHistory);
	}
}
