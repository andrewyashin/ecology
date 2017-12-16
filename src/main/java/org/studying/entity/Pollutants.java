package org.studying.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "pollutants")
public class Pollutants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "VMV")
    private Double vmv;

    @Column(name = "GDV")
    private Double gdv;

    @Column(name = "class")
    private String classOfPollutant;

    @Column(name = "tax")
    private Double tax;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "pollutants")
    public List<Pollutants> pollutants;
}
