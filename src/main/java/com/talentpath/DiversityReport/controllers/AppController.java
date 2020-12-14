package com.talentpath.DiversityReport.controllers;

import com.talentpath.DiversityReport.models.Mayor;
import com.talentpath.DiversityReport.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    AppService service;

    @GetMapping("/mayors")
    public List<Mayor> getMayors() {
        return service.getFakeMayorData();
    }

    @GetMapping("/governors")
    public void getGovernors() { }

    @GetMapping("/congress")
    public void getCongressPeople() { }
}
