package com.talentpath.DiversityReport.services;

import com.talentpath.DiversityReport.daos.AppDao;
import com.talentpath.DiversityReport.models.Governor;
import com.talentpath.DiversityReport.models.Mayor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    AppDao dao;

    public List<Mayor> getFakeMayorData() {
        return dao.getFakeMayorData();
    }

    public List<Governor> getFakeGovernorData() {
        return dao.getFakeGovernorData();
    }
}
