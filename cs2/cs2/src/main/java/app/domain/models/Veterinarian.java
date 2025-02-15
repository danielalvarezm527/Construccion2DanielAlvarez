package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Veterinarian extends User {
	
	public Veterinarian(long personId, String personName, int personAge, String personRole, String user,
			String password) {
		super(personId, personName, personAge, personRole, user, password);
	}

	protected void registerMedicalRecord() {
		
	}
	
	protected void generateOrder() {
		
	}
	
	protected void cancelOrder() {
		
	}
}
