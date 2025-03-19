package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User extends Person{
	private String user;
    private String password;
    
	public User(String personName, int personAge, long documentNumber, String role, String user, String password) {
		super(personName, personAge, documentNumber, role);
		this.user = user;
		this.password = password;
	}
}
