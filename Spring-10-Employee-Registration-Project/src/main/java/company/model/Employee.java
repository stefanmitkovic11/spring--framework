package company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
//    @NotBlank            Except null, antthing can be acceted
//    @NotEmpty            Except null and empty String anything can be accepted
//    @NotBlank            Except null, empty String and only space anything can be accepted

    @NotBlank(message = "First Name cannot be blank")
    @Size(max = 12, min = 2, message = "Size need to be more than 2 and less than 12")
    private String firstName;
    @NotBlank
    @Size(max = 20, min = 2)
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    @Email
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
