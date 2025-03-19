package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pet {
	private long petId;
    private String name;
    private int age;
    private String species;
    private String breed; //Raza
    private float weight;
    private Person owner;
    private MedicalHistory medicalHistory;

    public Pet(long petId, String name, int age, String species, String breed, float weight, Person owner, MedicalHistory medicalHistory) {
        this.petId = petId;
    	this.name = name;
        this.age = age;
        this.species = species;
        this.breed = breed;
        this.weight = weight;
        this.owner = owner;
        this.medicalHistory = medicalHistory;
    }
}
