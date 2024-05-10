package org.testspring.examenrev.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Donation implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int donId;
    private float amount;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private DonationType type;
    @JsonIgnore
    @ManyToOne
    Employee employee;
}
