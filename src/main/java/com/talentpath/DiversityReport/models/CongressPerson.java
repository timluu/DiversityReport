package com.talentpath.DiversityReport.models;

public class CongressPerson {
    Integer id;
    String fullName;
    String state;
    String governmentSeat;
    Integer yearBegan;
    Integer yearEnded;
    String ethnicity;
    String gender;
    Integer birthYear;
    Integer appointmentAge;
    Integer totalTerms;
    String photoUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGovernmentSeat() {
        return governmentSeat;
    }

    public void setGovernmentSeat(String governmentSeat) {
        this.governmentSeat = governmentSeat;
    }

    public Integer getYearBegan() {
        return yearBegan;
    }

    public void setYearBegan(Integer yearBegan) {
        this.yearBegan = yearBegan;
    }

    public Integer getYearEnded() {
        return yearEnded;
    }

    public void setYearEnded(Integer yearEnded) {
        this.yearEnded = yearEnded;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getAppointmentAge() {
        return appointmentAge;
    }

    public void setAppointmentAge(Integer appointmentAge) {
        this.appointmentAge = appointmentAge;
    }

    public Integer getTotalTerms() {
        return totalTerms;
    }

    public void setTotalTerms(Integer totalTerms) {
        this.totalTerms = totalTerms;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public CongressPerson() {}
}
