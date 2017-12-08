package org.studying.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.studying.service.EmissionsService;

@Controller
public class EmissionsController {
    @Autowired
    private EmissionsService emissionsService;

    @RequestMapping(value = "/emissions")
    public String homePage(Model model) {
        model.addAttribute("list", emissionsService.getOnlyDangerous());
        return "emissions";
    }
}
