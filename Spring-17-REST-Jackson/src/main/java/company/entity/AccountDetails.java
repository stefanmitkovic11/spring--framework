package company.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import company.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"state","postalCode"}, ignoreUnknown = true)
@JsonIgnoreProperties(value = "{hibernateLazyInitializer}", ignoreUnknown = true)
public class AccountDetails extends BaseEntity{

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private Integer age;
    private String postalCode;
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "accountDetails", fetch = FetchType.LAZY)
    @JsonBackReference // is the back part of reference - the one that gets  normally
    private User userAccount;
}
