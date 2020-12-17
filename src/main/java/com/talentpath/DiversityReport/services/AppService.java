package com.talentpath.DiversityReport.services;

import com.talentpath.DiversityReport.daos.AppDao;
import com.talentpath.DiversityReport.models.CongressDiversity;
import com.talentpath.DiversityReport.models.CongressPerson;
import com.talentpath.DiversityReport.models.Governor;
import com.talentpath.DiversityReport.models.Mayor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    AppDao dao;

    public List<Mayor> getMayorData() {
        return dao.getMayorData();
    }

    public List<Governor> getGovernorData() {
        return dao.getGovernorData();
    }

    public List<CongressPerson> getSenatorData() {
        return dao.getSenatorData();
    }

    public List<CongressPerson> getRepresentativeData() {
        return dao.getRepresentativeData();
    }

    public List<CongressDiversity> getSenateDiversityData() { return dao.getSenatorDiversityData(); }

    public List<CongressDiversity> getRepresentativesDiversityData() { return dao.getRepresentativeDiversityData(); }

}
