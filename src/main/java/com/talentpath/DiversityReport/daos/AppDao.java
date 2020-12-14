package com.talentpath.DiversityReport.daos;

import com.talentpath.DiversityReport.models.CongressPerson;
import com.talentpath.DiversityReport.models.Governor;
import com.talentpath.DiversityReport.models.Mayor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Profile({"production"})
public class AppDao {

    public List<Mayor> getFakeMayorData() {
        List<Mayor> fakeMayorData = new ArrayList<>();
        Mayor fakeMayor1 = new Mayor();
        fakeMayor1.setId(1);
        fakeMayor1.setFullName("John Smith");
        fakeMayor1.setCity("Greenville");
        fakeMayor1.setState("South Carolina");
        fakeMayor1.setYearBegan(2000);
        fakeMayor1.setYearEnded(2002);
        fakeMayor1.setEthnicity("White");
        fakeMayor1.setGender("Male");
        fakeMayor1.setBirthYear(1990);
        fakeMayor1.setAppointmentAge(10);
        fakeMayor1.setIsAlive(1);

        Mayor fakeMayor2 = new Mayor();
        fakeMayor2.setId(2);
        fakeMayor2.setFullName("Robert Bobert");
        fakeMayor2.setCity("New York City");
        fakeMayor2.setState("New York");
        fakeMayor2.setYearBegan(2002);
        fakeMayor2.setYearEnded(2004);
        fakeMayor2.setEthnicity("African American");
        fakeMayor2.setGender("Male");
        fakeMayor2.setBirthYear(1990);
        fakeMayor2.setAppointmentAge(12);
        fakeMayor2.setIsAlive(0);

        Mayor fakeMayor3 = new Mayor();
        fakeMayor3.setId(3);
        fakeMayor3.setFullName("Angela Lee");
        fakeMayor3.setCity("San Francisco");
        fakeMayor3.setState("California");
        fakeMayor3.setYearBegan(2004);
        fakeMayor3.setYearEnded(2010);
        fakeMayor3.setEthnicity("Asian");
        fakeMayor3.setGender("Female");
        fakeMayor3.setBirthYear(2000);
        fakeMayor3.setAppointmentAge(4);
        fakeMayor3.setIsAlive(1);

        fakeMayorData.add(fakeMayor1);
        fakeMayorData.add(fakeMayor2);
        fakeMayorData.add(fakeMayor3);
        return fakeMayorData;
    }

    public Governor[] getFakeGovernorData() {
        return null;
    }

    public CongressPerson[] getFakeCongressData() {
        return null;
    }


}
