package company.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    private Long id;
    private String model;
    private String make;
    private String color;
}
