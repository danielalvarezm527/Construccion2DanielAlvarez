package app.ports;

import app.domain.models.Order;

public interface OrderPort {
	public Order findById(long id);
}
