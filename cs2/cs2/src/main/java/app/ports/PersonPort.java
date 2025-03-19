package app.ports;

import app.domain.models.Person;

public interface PersonPort {
	public boolean existPerson(long documentNumber);
	public void savePerson(Person person);
	public Person findByDocumentNumber(long documentNumber);
}
