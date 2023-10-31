package demo.empverification.models.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = Employee)
//@NamedQuery(name = "Employee.findAll", query = "SELECT emp FROM Employee emp")
public class Employee  implements Serializable
{
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = employeeId, columnDefinition = "serial", unique = true, nullable = false)
    private String employeeId;

    @Column(name = "firstname", nullable = false, unique = true)
    private String employeeFirstName;

    @Column(name = "lastname", nullable = false)
    private String employeeLastName;

}
