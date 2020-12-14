package com.talentpath.DiversityReport.daos;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"production"})
public class AppDao {

    public String getTest() {
        return "testing testing testing";
    }
}
