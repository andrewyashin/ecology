package org.studying.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studying.dto.EmissionsData;
import org.studying.entity.Emissions;
import org.studying.repository.EmissionsRepository;
import org.studying.service.EmissionsService;

import java.util.ArrayList;
import java.util.List;

@Service("emissionsService")
public class EmissionsServiceImpl implements EmissionsService {
    @Autowired
    private EmissionsRepository repository;

    @Override
    public List<EmissionsData> getOnlyDangerous() {
        List<Emissions> emissionsList = new ArrayList<>();
        repository.findAll().forEach(emissionsList::add);

        List<EmissionsData> resultList = new ArrayList<>();
        for (Emissions emissions : emissionsList) {
            if (emissions.pollutants.getVmv() <= emissions.getEmissionVolume()) {
                EmissionsData data = new EmissionsData();
                data.setIdOfPlaces(emissions.places.getId());
                data.setNameOfPlace(emissions.places.getName());
                data.setNameOfPollutant(emissions.pollutants.getName());
                data.setClassOfPollutant(emissions.pollutants.getClassOfPollutant());
                data.setEmissionVolume(emissions.getEmissionVolume());
                data.setGdv(emissions.pollutants.getGdv());
                data.setVmv(emissions.pollutants.getVmv());
                data.setPercent(getPercentFromEmission(emissions));
                data.setTaxes(emissions.pollutants.getTax());
                data.setTotalTax(getTaxesInUahPerTon(emissions));
                resultList.add(data);
            }
        }

        return resultList;
    }

    private double getPercentFromEmission(Emissions emissions) {
        return (int) (emissions.getEmissionVolume() / emissions.pollutants.getVmv() * 100);
    }

    private double getTaxesInUahPerTon(Emissions emissions) {
        double ton = 0.008760 * emissions.getEmissionVolume();
        return ton * emissions.getPollutants().getTax();
    }
}
