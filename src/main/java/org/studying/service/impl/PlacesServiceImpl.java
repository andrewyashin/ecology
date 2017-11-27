package org.studying.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studying.entity.Places;
import org.studying.repository.PlacesRepository;
import org.studying.service.PlacesService;

import java.util.ArrayList;
import java.util.List;

@Service("placesService")
public class PlacesServiceImpl implements PlacesService {
    @Autowired
    private PlacesRepository placesRepository;

    @Override
    public List<Places> getAllPlaces() {
        List<Places> placesList = new ArrayList<>();
        placesRepository.findAll().forEach(placesList::add);
        return placesList;
    }

    @Override
    public Places getById(Long id) {
        return placesRepository.findOne(id);
    }

    @Override
    public Places save(Places place) {
        return placesRepository.save(place);
    }

    @Override
    public Places save(String name, Double latitude, Double longitude) {
        Places place = new Places();
        place.setName(name);
        place.setLatitude(latitude);
        place.setLongitude(longitude);
        return save(place);
    }

    public Places save(Long id, String name, Double latitude, Double longitude) {
        Places place = new Places();
        place.setId(id);
        place.setName(name);
        place.setLatitude(latitude);
        place.setLongitude(longitude);

        return save(place);
    }

    @Override
    public void delete(Places place) {
        placesRepository.delete(place);
    }
}
