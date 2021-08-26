package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class People {

    private int age;
    private String name;
    private Addres addres;
    private String surname;
    public String profession;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public static class Builder {

        private String name;
        private String surname;
        private LocalDate dateOfBirth;
        public String profession;
        private Addres addres;
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

        public Builder addres(Addres addres) {
            this.addres = addres;
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
            people.addres = this.addres;
            people.phoneNumber = this.phoneNumber;

            return people;
        }
    }

    private People() {
    }


    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public Addres getAddres() {
        return addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
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

    private LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getProfession() {
        return profession;
    }


    public void setProfession(String profession) {
        this.profession = profession;
    }


    @Override
    public String toString() {
        return name +
                "  " + surname +
                ", age =" + getAge() +
                ", profession ='" + profession + '\'' +
                ",\n  " + addres + '\'' + '\'' +
                ",\n phoneNumber ='" + phoneNumber + '\'';
    }
}
