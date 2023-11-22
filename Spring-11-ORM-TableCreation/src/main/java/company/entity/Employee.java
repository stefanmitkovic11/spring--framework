package company.entity;

import company.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    @Column(length = 50)
    private String firstName;
    @Column(length = 50)
    private String lastName;
    @Column(length = 50)
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    @Column(length = 17)
    private String department;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    private int salary;
    private int regionId;


    public Employee(String firstName, String lastName, String email, LocalDate hireDate, String department, Gender gender, int salary, int regionId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
        this.regionId = regionId;
    }
}
