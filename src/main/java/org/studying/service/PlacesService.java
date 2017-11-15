package org.studying.service;

import org.studying.entity.Places;

import java.util.List;

public interface PlacesService {
    List<Places> getAllPlaces();
    Places getById(Long id);

    Places save(Places place);
    Places save(String name, Double latitude, Double longitude);
    Places save(Long id, String name, Double latitude, Double longitude);
    void delete(Places place);
}
