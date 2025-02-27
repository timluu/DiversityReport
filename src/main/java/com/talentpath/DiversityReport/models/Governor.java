package com.talentpath.DiversityReport.models;

public class Governor {
    Integer id;
    String fullName;
    String state;
    Integer yearBegan;
    Integer yearEnded;
    String ethnicity;
    String gender;
    Integer birthYear;
    Integer appointmentAge;
    Integer isAlive;

    String previousOccupation;
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

    public Integer getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(Integer isAlive) {
        this.isAlive = isAlive;
    }



    public String getPreviousOccupation() {
        return previousOccupation;
    }

    public void setPreviousOccupation(String previousOccupation) {
        this.previousOccupation = previousOccupation;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Governor() {}
}
