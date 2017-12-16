package org.studying.dto;

import lombok.Data;

@Data
public class PlacesWithEmissionsData {
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
    private Boolean isDangerous;
}
