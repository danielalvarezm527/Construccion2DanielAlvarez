package app.domain.models;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VeterinaryClinic {
	private List<Person> people;
    private List<Pet> pets;
    private List<Order> orders;
    private List<Invoice> invoices;

    public void registerPerson(Person person) { 
    
    }
    
    public void registerPet(Pet pet) {

    }
    
    public MedicalRecord viewMedicalRecord(String petId) {
		return null;
    }
    
    public List<Order> viewOrders() {
		return orders;
    }
    
    public void registerInvoice(Invoice invoice) {

    }
}
