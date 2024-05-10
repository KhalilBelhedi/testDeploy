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
public class RedCrescent implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int redCID;
    private String area;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Donation> donations;
}
