package app.ports;

import app.domain.models.MedicalHistory;

public interface MedicalHistoryPort {
	public void save(MedicalHistory medicalHistory);
}
