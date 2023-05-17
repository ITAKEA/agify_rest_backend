package com.example.namify_rest.model;

public class DataResult {
    private AgifyData agifyData;
    private GenderizeData genderizeData;
    private NationalizeData nationalizeData;

    public AgifyData getAgifyData() {
        return agifyData;
    }

    public void setAgifyData(AgifyData agifyData) {
        this.agifyData = agifyData;
    }

    public GenderizeData getGenderizeData() {
        return genderizeData;
    }

    public void setGenderizeData(GenderizeData genderizeData) {
        this.genderizeData = genderizeData;
    }

    public NationalizeData getNationalizeData() {
        return nationalizeData;
    }

    public void setNationalizeData(NationalizeData nationalizeData) {
        this.nationalizeData = nationalizeData;
    }
}

