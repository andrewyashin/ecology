package org.studying.dto;

import lombok.Data;

@Data
public class EmissionsData {
    private Long idOfPlaces;
    private String nameOfPlace;
    private String nameOfPollutant;
    private Double emissionVolume;
    private Double vmv;
    private Double gdv;
    private Double percent;
    private String classOfPollutant;
    private Double taxes;
    private Double totalTax;
}
