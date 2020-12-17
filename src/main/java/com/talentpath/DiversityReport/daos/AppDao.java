package com.talentpath.DiversityReport.daos;

import com.talentpath.DiversityReport.models.CongressDiversity;
import com.talentpath.DiversityReport.models.CongressPerson;
import com.talentpath.DiversityReport.models.Governor;
import com.talentpath.DiversityReport.models.Mayor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
@Profile({"production"})
public class AppDao {

    @Autowired
    JdbcTemplate template;

    public List<Mayor> getMayorData() {
        List<Mayor> mayors = template.query("select * from \"Mayors\";", new MayorMapper());
        return mayors;
    }

    public List<Governor> getGovernorData() {
        List<Governor> governors = template.query("select * from \"Governors\";", new GovernorMapper());
        return governors;
    }

    public List<CongressPerson> getSenatorData() {
        List<CongressPerson> senators = template.query("select * from \"Senators\";", new CongressMapper());
        return senators;
    }

    public List<CongressPerson> getRepresentativeData() {
        List<CongressPerson> representatives = template.query("select * from \"Representatives\";", new CongressMapper());
        return representatives;
    }

    public List<CongressDiversity> getSenatorDiversityData() {
        List<CongressDiversity> representatitivesDiv = template.query("SELECT id, \"Category\", \"1971\", \"1973\", \"1975\", \"1977\", \"1979\", \"1981\", \"1983\", \"1985\", \"1987\", \"1989\", \"1991\", \"1993\", \"1995\", \"1997\", \"1999\", \"2001\", \"2003\", \"2005\", \"2007\", \"2009\", \"2011\", \"2013\", \"2015\", \"2017\", \"Type\"\n" +
                "\tFROM public.\"HouseDiversity\";", new CongressDiversityMapper());
        return representatitivesDiv;
    }

    public List<CongressDiversity> getRepresentativeDiversityData() {
        List<CongressDiversity> senatorsDiv = template.query("SELECT id, \"Category\", \"1971\", \"1973\", \"1975\", \"1977\", \"1979\", \"1981\", \"1983\", \"1985\", \"1987\", \"1989\", \"1991\", \"1993\", \"1995\", \"1997\", \"1999\", \"2001\", \"2003\", \"2005\", \"2007\", \"2009\", \"2011\", \"2013\", \"2015\", \"2017\", \"Type\"\n" +
                "\tFROM public.\"SenateDiversity\";", new CongressDiversityMapper());
        return senatorsDiv;
    }

    class CongressDiversityMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            Integer id = resultSet.getInt("id");
            String category = resultSet.getString("Category");
            Integer year1971 = resultSet.getInt("1971");
            Integer year1973 = resultSet.getInt("1973");
            Integer year1975 = resultSet.getInt("1975");
            Integer year1977 = resultSet.getInt("1977");
            Integer year1979 = resultSet.getInt("1979");
            Integer year1981 = resultSet.getInt("1981");
            Integer year1983 = resultSet.getInt("1983");
            Integer year1985 = resultSet.getInt("1985");
            Integer year1987 = resultSet.getInt("1987");
            Integer year1989 = resultSet.getInt("1989");
            Integer year1991 = resultSet.getInt("1991");
            Integer year1993 = resultSet.getInt("1993");
            Integer year1995 = resultSet.getInt("1995");
            Integer year1997 = resultSet.getInt("1997");
            Integer year1999 = resultSet.getInt("1999");
            Integer year2001 = resultSet.getInt("2001");
            Integer year2003 = resultSet.getInt("2003");
            Integer year2005 = resultSet.getInt("2005");
            Integer year2007 = resultSet.getInt("2007");
            Integer year2009 = resultSet.getInt("2009");
            Integer year2011 = resultSet.getInt("2011");
            Integer year2013 = resultSet.getInt("2013");
            Integer year2015 = resultSet.getInt("2015");
            Integer year2017 = resultSet.getInt("2017");
            String type = resultSet.getString("Type");
            CongressDiversity leader = new CongressDiversity();
            leader.setId(id);
            leader.setCategory(category);
            leader.setYear1971(year1971);
            leader.setYear1973(year1973);
            leader.setYear1975(year1975);
            leader.setYear1977(year1977);
            leader.setYear1979(year1979);
            leader.setYear1981(year1981);
            leader.setYear1983(year1983);
            leader.setYear1985(year1985);
            leader.setYear1987(year1987);
            leader.setYear1999(year1999);
            leader.setYear2001(year2001);
            leader.setYear2003(year2003);
            leader.setYear2005(year2005);
            leader.setYear2007(year2007);
            leader.setYear2009(year2009);
            leader.setYear2011(year2011);
            leader.setYear2013(year2013);
            leader.setYear2015(year2015);
            leader.setYear2017(year2017);
            leader.setType(type);
            return leader;

        }
    }

    class MayorMapper implements RowMapper {

        @Override
        public Mayor mapRow(ResultSet resultSet, int i) throws SQLException {
            Integer id = resultSet.getInt("id");
            String fullName = resultSet.getString("fullName");
            String city = resultSet.getString("city");
            String state = resultSet.getString("state");
            Integer yearBegan = resultSet.getInt("yearBegan");
            Integer yearEnded = resultSet.getInt("yearEnded");
            String ethnicity = resultSet.getString("ethnicity");
            Integer birthYear = resultSet.getInt("birthYear");
            String gender = resultSet.getString("gender");
            Integer appointmentAge = resultSet.getInt("appointmentAge");
            Integer isAlive = resultSet.getInt("isAlive");
            Integer income = resultSet.getInt("income");
            String religion = resultSet.getString("religion");
            String previousOccupation = resultSet.getString("previousOccupation");
            String photoUrl = resultSet.getString("photoUrl");

            Mayor mayor = new Mayor();
            mayor.setId(id);
            mayor.setFullName(fullName);
            mayor.setCity(city);
            mayor.setState(state);
            mayor.setYearBegan(yearBegan);
            mayor.setYearEnded(yearEnded);
            mayor.setEthnicity(ethnicity);
            mayor.setBirthYear(birthYear);
            mayor.setGender(gender);
            mayor.setAppointmentAge(appointmentAge);
            mayor.setIsAlive(isAlive);
            mayor.setIncome(income);
            mayor.setReligion(religion);
            mayor.setPreviousOccupation(previousOccupation);
            mayor.setPhotoUrl(photoUrl);

            return mayor;
        }
    }

    class GovernorMapper implements RowMapper {

        @Override
        public Governor mapRow(ResultSet resultSet, int i) throws SQLException {
            Integer id = resultSet.getInt("id");
            String fullName = resultSet.getString("fullName");
            String state = resultSet.getString("state");
            Integer yearBegan = resultSet.getInt("yearBegan");
            Integer yearEnded = resultSet.getInt("yearEnded");
            String ethnicity = resultSet.getString("ethnicity");
            Integer birthYear = resultSet.getInt("birthYear");
            String gender = resultSet.getString("gender");
            Integer appointmentAge = resultSet.getInt("appointmentAge");
            Integer isAlive = resultSet.getInt("isAlive");
            Integer income = resultSet.getInt("income");
            String religion = resultSet.getString("religion");
            String previousOccupation = resultSet.getString("previousOccupation");
            String photoUrl = resultSet.getString("photoUrl");

            Governor governor = new Governor();
            governor.setId(id);
            governor.setFullName(fullName);
            governor.setState(state);
            governor.setYearBegan(yearBegan);
            governor.setYearEnded(yearEnded);
            governor.setEthnicity(ethnicity);
            governor.setBirthYear(birthYear);
            governor.setGender(gender);
            governor.setAppointmentAge(appointmentAge);
            governor.setIsAlive(isAlive);
            governor.setIncome(income);
            governor.setReligion(religion);
            governor.setPreviousOccupation(previousOccupation);
            governor.setPhotoUrl(photoUrl);

            return governor;
        }
    }

    class CongressMapper implements RowMapper {

        @Override
        public CongressPerson mapRow(ResultSet resultSet, int i) throws SQLException {
            Integer id = resultSet.getInt("id");
            String fullName = resultSet.getString("fullName");
            String state = resultSet.getString("state");
            Integer totalTerms = resultSet.getInt("totalTerms");
            Integer yearBegan = resultSet.getInt("yearBegan");
            Integer yearEnded = resultSet.getInt("yearEnded");
            String ethnicity = resultSet.getString("ethnicity");
            Integer birthYear = resultSet.getInt("birthYear");
            String gender = resultSet.getString("gender");
            Integer appointmentAge = resultSet.getInt("appointmentAge");
            String religion = resultSet.getString("religion");
            String photoUrl = resultSet.getString("photoUrl");

            CongressPerson congressPerson = new CongressPerson();
            congressPerson.setId(id);
            congressPerson.setFullName(fullName);
            congressPerson.setState(state);
            congressPerson.setTotalTerms(totalTerms);
            congressPerson.setYearBegan(yearBegan);
            congressPerson.setYearEnded(yearEnded);
            congressPerson.setEthnicity(ethnicity);
            congressPerson.setBirthYear(birthYear);
            congressPerson.setGender(gender);
            congressPerson.setAppointmentAge(appointmentAge);
            congressPerson.setReligion(religion);
            congressPerson.setPhotoUrl(photoUrl);

            return congressPerson;
        }
    }

    // BELOW ARE USED ONLY FOR INITIAL SETUP

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

    public List<Governor> getFakeGovernorData() {
        List<Governor> fakeGovernorData = new ArrayList<>();
        Governor fakeGovernor1 = new Governor();
        fakeGovernor1.setId(1);
        fakeGovernor1.setFullName("Arnie Schwarz");
        fakeGovernor1.setState("California");
        fakeGovernor1.setYearBegan(2000);
        fakeGovernor1.setYearEnded(2010);
        fakeGovernor1.setEthnicity("White");
        fakeGovernor1.setGender("Male");
        fakeGovernor1.setBirthYear(1950);
        fakeGovernor1.setAppointmentAge(50);
        fakeGovernor1.setIsAlive(1);

        Governor fakeGovernor2 = new Governor();
        fakeGovernor2.setId(2);
        fakeGovernor2.setFullName("Dude Jones");
        fakeGovernor2.setState("New York");
        fakeGovernor2.setYearBegan(2010);
        fakeGovernor2.setYearEnded(2020);
        fakeGovernor2.setEthnicity("African American");
        fakeGovernor2.setGender("Male");
        fakeGovernor2.setBirthYear(1900);
        fakeGovernor2.setAppointmentAge(110);
        fakeGovernor2.setIsAlive(0);

        Governor fakeGovernor3 = new Governor();
        fakeGovernor3.setId(3);
        fakeGovernor3.setFullName("Hilary Bilary");
        fakeGovernor3.setState("Texas");
        fakeGovernor3.setYearBegan(2005);
        fakeGovernor3.setYearEnded(2015);
        fakeGovernor3.setEthnicity("Asian");
        fakeGovernor3.setGender("Female");
        fakeGovernor3.setBirthYear(2000);
        fakeGovernor3.setAppointmentAge(5);
        fakeGovernor3.setIsAlive(1);

        fakeGovernorData.add(fakeGovernor1);
        fakeGovernorData.add(fakeGovernor2);
        fakeGovernorData.add(fakeGovernor3);
        return fakeGovernorData;
    }

    public List<CongressPerson> getFakeCongressData() {
        // temporarily taking out ethnicity data
        List<CongressPerson> fakeCongressPersonData = new ArrayList<>();
        CongressPerson fakeCongressPerson1 = new CongressPerson();
        fakeCongressPerson1.setId(1);
        fakeCongressPerson1.setFullName("Joe Jones");
        fakeCongressPerson1.setState("North Dakota");
        fakeCongressPerson1.setYearBegan(2000);
        fakeCongressPerson1.setYearEnded(2010);
//        fakeCongressPerson1.setEthnicity("White");
        fakeCongressPerson1.setGender("Male");
        fakeCongressPerson1.setBirthYear(1950);
        fakeCongressPerson1.setAppointmentAge(50);
        fakeCongressPerson1.setTotalTerms(2);

        CongressPerson fakeCongressPerson2 = new CongressPerson();
        fakeCongressPerson2.setId(2);
        fakeCongressPerson2.setFullName("Joesph Jones");
        fakeCongressPerson2.setState("North Dakota");
        fakeCongressPerson2.setYearBegan(2000);
        fakeCongressPerson2.setYearEnded(2010);
//        fakeCongressPerson2.setEthnicity("African American");
        fakeCongressPerson2.setGender("Male");
        fakeCongressPerson2.setBirthYear(1960);
        fakeCongressPerson2.setAppointmentAge(40);
        fakeCongressPerson2.setTotalTerms(5);

        CongressPerson fakeCongressPerson3 = new CongressPerson();
        fakeCongressPerson3.setId(3);
        fakeCongressPerson3.setFullName("Bob Smith");
        fakeCongressPerson3.setState("Alaska");
        fakeCongressPerson3.setYearBegan(1990);
        fakeCongressPerson3.setYearEnded(2000);
//        fakeCongressPerson3.setEthnicity("Hispanic");
        fakeCongressPerson3.setGender("Male");
        fakeCongressPerson3.setBirthYear(1950);
        fakeCongressPerson3.setAppointmentAge(40);
        fakeCongressPerson3.setTotalTerms(2);

        CongressPerson fakeCongressPerson4 = new CongressPerson();
        fakeCongressPerson4.setId(4);
        fakeCongressPerson4.setFullName("Roberta Smith");
        fakeCongressPerson4.setState("Alaska");
        fakeCongressPerson4.setYearBegan(1950);
        fakeCongressPerson4.setYearEnded(1952);
//        fakeCongressPerson4.setEthnicity("Asian");
        fakeCongressPerson4.setGender("Female");
        fakeCongressPerson4.setBirthYear(1900);
        fakeCongressPerson4.setAppointmentAge(50);
        fakeCongressPerson4.setTotalTerms(1);

        fakeCongressPersonData.add(fakeCongressPerson1);
        fakeCongressPersonData.add(fakeCongressPerson2);
        fakeCongressPersonData.add(fakeCongressPerson3);
        fakeCongressPersonData.add(fakeCongressPerson4);
        return fakeCongressPersonData;
    }


}
