package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User extends Person {
	private String user;
	private String password;
	
	public User(long personId, String personName, int personAge, String personRole, String user, String password) {
		super(personId, personName, personAge, personRole);
		this.user = user;
		this.password = password;
	}	
}
