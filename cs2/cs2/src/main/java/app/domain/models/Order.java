package app.domain.models;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Order {
	private String orderId;
    private Pet pet;
    private PetOwner owner;
    private Veterinarian veterinarian;
    private String medicationName;
    private String dosage;
    private Date generationDate;
    private String status;
}
