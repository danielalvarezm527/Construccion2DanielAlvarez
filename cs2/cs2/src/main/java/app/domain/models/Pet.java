package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pet {
	private String petId;
	private String petName;
	private PetOwner petOwner;
	private int age;
	private String species;
	private String breed;
    private String characteristics;
    private float weight;
    
	public Pet(String petId, String petName, PetOwner petOwner, int age, String species, String breed,
			String characteristics, float weight) {
		this.petId = petId;
		this.petName = petName;
		this.petOwner = petOwner;
		this.age = age;
		this.species = species;
		this.breed = breed;
		this.characteristics = characteristics;
		this.weight = weight;
	}
    
}
