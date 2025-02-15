package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Person {
	private long personId;
	private String personName;
	private int personAge;
	private String personRole;
	
	public Person(long personId, String personName, int personAge, String personRole) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.personRole = personRole;
	}
}
