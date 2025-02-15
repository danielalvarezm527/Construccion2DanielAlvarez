package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Admin extends User{

	public Admin(long personId, String personName, int personAge, String personRole, String user, String password) {
		super(personId, personName, personAge, personRole, user, password);
	}
	
	protected void registerSeller() {
		
	}
	
	protected void registerVeterinarian() {
		
	}
}
