package company.entity;


import company.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "studentChangeTableName")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "studentFirstName", length = 100)
    private String firstName; // first_name
    @Column(name = "studentLastName", length = 50)
    private String lastName;  // last_name
    @Column(name = "studentEmail", length = 40)
    private String email;

    @Transient  // This is annotation if you don't want some fields to be visible in table
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthday;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;
}
