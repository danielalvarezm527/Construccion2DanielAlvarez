package app.domain.models;

import java.sql.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RecordEntry { //Registro historia clinica
	private Date date;
    private Veterinarian veterinarian;
    private String reasonForVisit;
    private String symptoms;
    private String diagnosis;
    private String procedure;
    private String prescribedMedication;
    private String dosage;
    private String orderId;
    private List<String> vaccinationHistory;
    private List<String> allergies;
    private String procedureDetails;
}
