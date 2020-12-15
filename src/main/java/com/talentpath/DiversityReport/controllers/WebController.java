package com.talentpath.DiversityReport.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @RequestMapping("/")
    public String home() {
        return "index.html";
    }

    @GetMapping("")
    public String homePage() {
        return "index";
    }
}
