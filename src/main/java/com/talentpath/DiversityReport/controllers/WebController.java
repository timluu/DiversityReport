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

    @RequestMapping("/indexTest")
    public String indexTest() {
        return "indexTables.html";
    }

    @RequestMapping("/mayors")
    public String mayors() {
        return "mayors.html";
    }

    @RequestMapping("/governors")
    public String governors() {
        return "governors.html";
    }

    @RequestMapping("/representatives")
    public String representatives() {
        return "representatives.html";
    }

    @RequestMapping("/senators")
    public String senators() {
        return "senators.html";
    }






    @GetMapping("")
    public String homePage() {
        return "index";
    }
}
