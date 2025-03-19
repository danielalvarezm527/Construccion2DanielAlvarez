package app.ports;

import app.domain.models.User;

public interface UserPort {
	public User findByUserDocumentNumber(long DocumentNumber);
}
