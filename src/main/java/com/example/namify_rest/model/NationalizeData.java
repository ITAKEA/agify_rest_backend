package com.example.namify_rest.model;

import java.util.List;

public class NationalizeData {
    private String name;
    private List<CountryData> country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CountryData> getCountry() {
        return country;
    }

    public void setCountry(List<CountryData> country) {
        this.country = country;
    }
}
