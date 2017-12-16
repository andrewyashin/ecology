package org.studying.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.studying.dto.PlacesWithEmissionsData;
import org.studying.entity.Places;
import org.studying.service.PlacesService;

import java.util.List;

@Controller
public class MapController {

    @Autowired
    private PlacesService placesService;

    @RequestMapping(value = "/map")
    public String map(Model model){
        List<PlacesWithEmissionsData> places = placesService.getAllPlaces();
        model.addAttribute("list", places);
        return "map";
    }
}
