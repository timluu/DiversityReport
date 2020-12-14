package com.talentpath.DiversityReport.controllers;

import com.talentpath.DiversityReport.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    AppService service;

    @GetMapping("test")
    public String getTest() {
        return service.getTest();
    }
}
