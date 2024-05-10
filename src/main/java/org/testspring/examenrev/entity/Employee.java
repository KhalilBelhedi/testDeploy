package org.testspring.examenrev.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int empoyeeid;
    private String lastName;
    private String firstName;
    private String position;
    @JsonIgnore
    @ManyToOne
    Company company;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="employee")
    private Set<Donation> donations;


}
