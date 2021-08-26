package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Addres {

    private String country;
    private String district;
    private String cityOrVillage;
    private String street;
    private String houseOrBuilding;
    private String apartment;


    public static class Builder {
        private String country;
        private String district;
        private String cityOrVillage;
        private String street;
        private String houseOrBuilding;
        private String apartment;
    public Builder(String country) {
        this.country = country;
    }


    public Addres.Builder district(String district) {
        this.district = district;
        return this;
    }

    public Addres.Builder cityOrVillage(String cityOrVillage) {
        this.cityOrVillage = cityOrVillage;
        return this;
    }

    public Addres.Builder street(String street) {
        this.street = street;
        return this;
    }

    public Addres.Builder houseOrBuilding(String houseOrBuilding) {
        this.houseOrBuilding = houseOrBuilding;
        return this;
    }

    public Addres.Builder apartment(String apartment) {
        this.apartment = apartment;
        return this;
    }



    public Addres build() {

        Addres addres = new Addres();

        addres.country = this.country;
        addres.district = this.district;
        addres.cityOrVillage = this.cityOrVillage;
        addres.street = this.street;
        addres.houseOrBuilding = this.houseOrBuilding;
        addres.apartment = this.apartment;


        return addres;
    }
}

    private Addres() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCityOrVillage() {
        return cityOrVillage;
    }

    public void setCityOrVillage(String cityOrVillage) {
        this.cityOrVillage = cityOrVillage;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseOrBuilding() {
        return houseOrBuilding;
    }

    public void setHouseOrBuilding(String houseOrBuilding) {
        this.houseOrBuilding = houseOrBuilding;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
    public static List<Addres> getEmployeesAddres(List<Employee> employees){
        List<Addres> addres =  employees.stream().map(t->t.getPeople().getAddres()).collect(Collectors.toList());
        return addres;
    }

    @Override
    public String toString() {
        return
                "country='" + country + '\'' +
                ", district='" + district + '\'' +
                ", cityOrVillage='" + cityOrVillage + '\'' +
                ", street='" + street + '\'' +
                ", houseOrBuilding='" + houseOrBuilding + '\'' +
                ", apartment='" + apartment + '\''
                ;
    }
}
