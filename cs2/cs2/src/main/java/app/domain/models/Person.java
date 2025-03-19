package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Person {
    private String personName;
    private int personAge;
    private long document;
    private String role;

    public Person(String personName, int personAge, long documentNumber, String role) {
        this.personName = personName;
        this.personAge = personAge;
        this.document = documentNumber;
        this.role = role;
    }
}
