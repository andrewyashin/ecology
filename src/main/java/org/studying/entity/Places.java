package org.studying.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "places")
public class Places {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

}
