package org.studying.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studying.dto.EmissionsData;
import org.studying.dto.PlacesWithEmissionsData;
import org.studying.entity.Emissions;
import org.studying.entity.Places;
import org.studying.repository.PlacesRepository;
import org.studying.service.EmissionsService;
import org.studying.service.PlacesService;

import java.util.ArrayList;
import java.util.List;

@Service("placesService")
public class PlacesServiceImpl implements PlacesService {
    @Autowired
    private PlacesRepository placesRepository;

    @Autowired
    private EmissionsService emissionsService;

    @Override
    public List<PlacesWithEmissionsData> getAllPlaces() {
        List<PlacesWithEmissionsData> result = new ArrayList<>();

        List<Places> placesList = new ArrayList<>();
        placesRepository.findAll().forEach(placesList::add);

        List<Long> emissionsOnlyDangerous = new ArrayList<>();
        emissionsService.getOnlyDangerous().forEach(item -> emissionsOnlyDangerous.add(item.getIdOfPlaces()));

        for (Places places: placesList) {
            PlacesWithEmissionsData data = new PlacesWithEmissionsData();
            data.setId(places.getId());
            data.setName(places.getName());
            data.setLatitude(places.getLatitude());
            data.setLongitude(places.getLongitude());
            if (emissionsOnlyDangerous.contains(places.getId())) {
                data.setIsDangerous(true);
            } else {
                data.setIsDangerous(false);
            }

            result.add(data);
        }
        return result;
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
