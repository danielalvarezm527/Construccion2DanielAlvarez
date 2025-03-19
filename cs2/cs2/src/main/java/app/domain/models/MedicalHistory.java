package app.domain.models;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MedicalHistory {
	private Timestamp date;
	private User veterinarian;
	private String reason;
	private String Symptomatology;
	private String diagnostic;
	private String procedure;
	private String meds;
	private String dose;
	private Order order;
	private String vaccination;
	private String allergyMedication;
	private String procedureDetails;
	private Pet pet;
	
	public MedicalHistory(Timestamp date, User veterinarian, String reason, String symptomatology, String diagnostic,
			String procedure, String meds, String dose, Order order, String vaccination, String allergyMedication,
			String procedureDetails, Pet pet) {
		this.date = date;
		this.veterinarian = veterinarian;
		this.reason = reason;
		Symptomatology = symptomatology;
		this.diagnostic = diagnostic;
		this.procedure = procedure;
		this.meds = meds;
		this.dose = dose;
		this.order = order;
		this.vaccination = vaccination;
		this.allergyMedication = allergyMedication;
		this.procedureDetails = procedureDetails;
		this.pet = pet;
	}
	
	
}
