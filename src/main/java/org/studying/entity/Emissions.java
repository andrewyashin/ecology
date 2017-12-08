package org.studying.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "emissions")
public class Emissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "emissionVolume")
    private Double emissionVolume;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Places places;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Pollutants pollutants;
}
