package app.domain.models;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Order {
	private long orderId;
	private Pet pet;
	private Person owner;
	private User veterinarian;
	private String medecine;
	private String dose;
	private Timestamp date;
	
	public Order(long orderId, Pet pet, Person owner, User veterinarian, String medecine, String dose, Timestamp date) {
		super();
		this.orderId = orderId;
		this.pet = pet;
		this.owner = owner;
		this.veterinarian = veterinarian;
		this.medecine = medecine;
		this.dose = dose;
		this.date = date;
	}
	
	
}
