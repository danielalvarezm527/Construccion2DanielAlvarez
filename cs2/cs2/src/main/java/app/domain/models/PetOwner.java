package app.domain.models;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PetOwner extends Person {
	private List<Pet> pets;

	public PetOwner(long personId, String personName, int personAge, String personRole) {
		super(personId, personName, personAge, personRole);
	}

	private List<Pet> getPets() {
		return pets;
	}

	private void setPets(Pet pet) {
		pets.add(pet);
	}
	
	
}
