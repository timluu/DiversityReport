package com.talentpath.DiversityReport.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World Index!";
    }

    @GetMapping("")
    public String homePage() {
        return "index";
    }
}
