package com.company;

import java.util.ArrayList;

public class TestEmploye {
    public static void main(String[] args) {
        ArrayList<Employee> employeinfo = new ArrayList<>();


        People p1 = new People.Builder("Aram")
                .surname("Aramyan")
                .dateOfBirth("11-01-1995")
                .profession("Manager")
                .country("Armenia")
                .district("Erevan")
                .cityOrVillage("Erevan")
                .street("Abovyan")
                .houseOrBuilding("19b")
                .apartment("42")
                .phoneNumber("077154120")
                .build();
        People p2 = new People.Builder("Karen")
                .surname("Mnacakanyan")
                .dateOfBirth("11-01-1991")
                .profession("Accountant")
                .country("Armenia")
                .district("Armavir")
                .cityOrVillage("Vaxarshapat")
                .street("Agatangexos")
                .houseOrBuilding("-")
                .apartment("42a")
                .phoneNumber("041478956")
                .build();
        People p3 = new People.Builder("Ani")
                .surname("Karapetyan")
                .dateOfBirth("11-01-2000")
                .profession("Developer")
                .country("Armenia")
                .district("Erevan")
                .cityOrVillage("Erevan")
                .street("V.Papazyan")
                .houseOrBuilding("150/2")
                .apartment("31")
                .phoneNumber("046854120")
                .build();
        People p4 = new People.Builder("Gor")
                .surname("Hovsepyan")
                .dateOfBirth("11-01-1998")
                .profession("Developer")
                .country("Armenia")
                .district("Kotayqi")
                .cityOrVillage("Hrazdan")
                .street("v.Sargsyan")
                .houseOrBuilding("-")
                .apartment("13")
                .phoneNumber("021230540")
                .build();

        People p5 = new People.Builder("Tatev")
                .surname("Petrosyan")
                .dateOfBirth("11-01-2001")
                .profession("Designer")
                .country("Armenia")
                .district("Shiraki")
                .cityOrVillage("Gyumri")
                .street("M.Mkrtchyan")
                .houseOrBuilding("15")
                .apartment("12")
                .phoneNumber("054987456")
                .build();
        People p6 = new People.Builder("Lilit")
                .surname("Galstyan")
                .dateOfBirth("10-11-1996")
                .profession("ProjectManager")
                .country("Armenia")
                .district("Ararat")
                .cityOrVillage("Artashat")
                .street("A.SHahinyan")
                .houseOrBuilding("-")
                .apartment("53")
                .phoneNumber("043259875")
                .build();

        Employee e1 = new Employee.Builder(p1)
                .position(Position.Accountant)
                .salaryAMD(400000)
                .bankCardNumber("1234567891234567")
                .build();

        Employee e2 = new Employee.Builder(p2)
                .position(Position.HR)
                .salaryAMD(250000)
                .bankCardNumber("1234567897654321")
                .build();

        Employee e3 = new Employee.Builder(p3)
                .position(Position.Developer)
                .salaryAMD(1000000)
                .bankCardNumber("0000567891234567")
                .build();

        Employee e4 = new Employee.Builder(p4)
                .position(Position.Developer)
                .salaryAMD(600000)
                .bankCardNumber("1234560000234567")
                .build();

        Employee e5 = new Employee.Builder(p5)
                .position(Position.ProductManager)
                .salaryAMD(650000)
                .bankCardNumber("1234567891230000")
                .build();

        Employee e6 = new Employee.Builder(p6)
                .position(Position.ProjectManager)
                .salaryAMD(750000)
                .bankCardNumber("1234000891230000")
                .build();

        employeinfo.add(e1);
        employeinfo.add(e2);
        employeinfo.add(e3);
        employeinfo.add(e4);
        employeinfo.add(e5);
        employeinfo.add(e6);

        SortEmployee.sortSalary(employeinfo);
        for (Employee i : employeinfo) {
            System.out.println(i);
        }
//        Employee.getEmployeeByNameSurname(employeinfo, "Gor", "Hovsepyan");
//        System.out.println(e6.getPeople().getAge());
    }

}
