package org.studying.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.studying.service.PlacesService;

@Controller
public class TableController {

    @Autowired
    private PlacesService placesService;

    @RequestMapping(value = "/table")
    public String table(Model model){
        model.addAttribute("list", placesService.getAllPlaces());
        return "table";
    }

    @RequestMapping(value = "/deleteMarker", method = RequestMethod.POST)
    public String deleteMarker(@RequestParam("delete") Long id, Model model){
        placesService.delete(placesService.getById(id));
        model.addAttribute("list", placesService.getAllPlaces());
        return "table";
    }

    @RequestMapping(value = "/createMarker", method = RequestMethod.POST)
    public String createMarker(
            @RequestParam("name") String name,
            @RequestParam("longitude") Double longitude,
            @RequestParam("latitude") Double latitude,
            Model model){
        placesService.save(name, latitude, longitude);
        model.addAttribute("list", placesService.getAllPlaces());
        return "table";
    }

    @RequestMapping(value = "/updateMarker", method = RequestMethod.POST)
    public String createMarker(
            @RequestParam("id") Long id,
            @RequestParam("name") String name,
            @RequestParam("longitude") Double longitude,
            @RequestParam("latitude") Double latitude,
            Model model){
        placesService.save(id, name, latitude, longitude);
        model.addAttribute("list", placesService.getAllPlaces());
        return "table";
    }


}
