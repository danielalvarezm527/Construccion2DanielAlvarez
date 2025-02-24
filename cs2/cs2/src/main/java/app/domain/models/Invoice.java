package app.domain.models;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Invoice {
	private String invoiceId;
    private Pet pet;
    private PetOwner owner;
    private Order order;  // Puede ser null si no es venta de medicamento
    private String productName;
    private float price;
    private int quantity;
    private Date date;

}
