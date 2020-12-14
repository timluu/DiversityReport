package com.talentpath.DiversityReport.services;

import com.talentpath.DiversityReport.daos.AppDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Autowired
    AppDao dao;

    public String getTest() {
        return dao.getTest();
    }
}
