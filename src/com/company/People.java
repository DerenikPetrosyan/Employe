package com.company;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class People {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private int age;
    public String profession;
    private String country;
    private String district;
    private String cityOrVillage;
    private String street;
    private String houseOrBuilding;
    private String apartment;
    private String phoneNumber;

    public static class Builder {

        private String name;
        private String surname;
        private LocalDate dateOfBirth;
        public String profession;
        private String country;
        private String district;
        private String cityOrVillage;
        private String street;
        private String houseOrBuilding;
        private String apartment;
        private String phoneNumber;

        public Builder(String name) {
            this.name = name;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder dateOfBirth(String dateOfBirth) {
            try {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate time = LocalDate.parse(dateOfBirth, format);
                this.dateOfBirth = time;
            } catch (RuntimeException exception) {
                System.out.println("Date The date of birth was entered incorrectly\n" +
                        "Write as follows:  dd-MM-YYYY -->(Day-Months-Year)");
            }
            return this;
        }

        public Builder profession(String profession) {
            this.profession = profession;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder district(String district) {
            this.district = district;
            return this;
        }

        public Builder cityOrVillage(String cityOrVillage) {
            this.cityOrVillage = cityOrVillage;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder houseOrBuilding(String houseOrBuilding) {
            this.houseOrBuilding = houseOrBuilding;
            return this;
        }

        public Builder apartment(String apartment) {
            this.apartment = apartment;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            try {
                if (phoneNumber.length() == 9 && phoneNumber.charAt(0) == '0' && isNumeric(phoneNumber)) {
                    this.phoneNumber = phoneNumber;
                }

            } catch (RuntimeException exception) {
                System.out.println("The number of digits is incorrect \n" +
                        "Enter it as follows:  0######## --> (090909090)");
            }

            return this;
        }

        public People build() {

            People people = new People();
            people.name = this.name;
            people.surname = this.surname;
            people.dateOfBirth = this.dateOfBirth;
            people.profession = this.profession;
            people.country = this.country;
            people.district = this.district;
            people.cityOrVillage = this.cityOrVillage;
            people.street = this.street;
            people.houseOrBuilding = this.houseOrBuilding;
            people.apartment = this.apartment;
            people.phoneNumber = this.phoneNumber;

            return people;
        }
    }

    private People() {
    }

//
//    public People(String name, String surname, String dateOfBirth, String profession, String country, String district, String cityOrVillage,
//                  String street, String houseOrBuilding, String apartment, String phoneNumber) {
//
//        try {
//            if (phoneNumber.length() == 9 && phoneNumber.charAt(0) == '0' && isNumeric(phoneNumber)) {
//                this.phoneNumber = phoneNumber;
//            }
//
//        } catch (RuntimeException exception) {
//            System.out.println("The number of digits is incorrect \n" +
//                    "Enter it as follows:  0######## --> (090909090)");
//        }
//
//
//        try {
//            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//            LocalDate time = LocalDate.parse(dateOfBirth, format);
//            this.dateOfBirth = time;
//        } catch (RuntimeException exception) {
//            System.out.println("Date The date of birth was entered incorrectly\n" +
//                    "Write as follows:  dd-MM-YYYY -->(Day-Months-Year)");
//        }
//        this.name = name;
//        this.surname = surname;
//        this.profession = profession;
//        this.country = country;
//        this.district = district;
//        this.cityOrVillage = cityOrVillage;
//        this.street = street;
//        this.houseOrBuilding = houseOrBuilding;
//        this.apartment = apartment;
//    }

    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        try {
            if (phoneNumber.length() == 9 && phoneNumber.charAt(0) == '0' && isNumeric(phoneNumber)) {
                this.phoneNumber = phoneNumber;
            }

        } catch (RuntimeException exception) {
            System.out.println("The number of digits is incorrect \n" +
                    "Enter it as follows:  0######## --> (090909090)");
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        Period diff = Period.between(this.dateOfBirth, LocalDate.now());
        age = diff.getYears();

        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getProfession() {
        return profession;
    }

    public String getCountry() {
        return country;
    }

    public String getDistrict() {
        return district;
    }

    public String getCityOrVillage() {
        return cityOrVillage;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseOrBuilding() {
        return houseOrBuilding;
    }

    public String getApartment() {
        return apartment;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCityOrVillage(String cityOrVillage) {
        this.cityOrVillage = cityOrVillage;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseOrBuilding(String houseOrBuilding) {
        this.houseOrBuilding = houseOrBuilding;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "People{" + name +
                "  " + surname +
                ", age =" + getAge() +
                ", profession ='" + profession + '\'' +
                ",\n country ='" + country + '\'' +
                ", district ='" + district + '\'' +
                ", cityOrVillage ='" + cityOrVillage + '\'' +
                ", street='" + street + '\'' +
                ", houseOrBuilding ='" + houseOrBuilding + '\'' +
                ", apartment ='" + apartment + '\'' +
                ", phoneNumber ='" + phoneNumber + '\'' +
                '}';
    }
}
