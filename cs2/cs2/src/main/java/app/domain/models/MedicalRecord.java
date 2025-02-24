package app.domain.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MedicalRecord { //Historias clinicas
	private Pet pet;
	private List<RecordEntry> records;

	public MedicalRecord() {
		this.records = new ArrayList<>();
	}
	
}
