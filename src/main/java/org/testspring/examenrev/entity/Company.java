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
public class Company implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int companyid;
    private String companyname;
    private String adress;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="company")
    private Set<Employee> employees;
}
