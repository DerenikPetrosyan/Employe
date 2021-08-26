package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortEmployee {

    public static ArrayList<Employee> sortSalary(ArrayList<Employee> employee) {
        for (int i = 1; i < employee.size(); i++) {
            Employee current = employee.get(i);
            int j = i - 1;
            while(j >= 0 && current.getSalary() < employee.get(j).getSalary()) {
                employee.set(j+1,employee.get(j)) ;
                j--;
            }
            employee.set(j+1,current) ;
        }
        return employee;
    }

    public static ArrayList<Employee> sortAge(ArrayList<Employee> employee) {
        for (int i = 1; i < employee.size(); i++) {
            Employee current = employee.get(i);
            int j = i - 1;
            while(j >= 0 && current.getPeople().getAge() < employee.get(j).getPeople().getAge()) {
                employee.set(j+1,employee.get(j)) ;
                j--;
            }
            employee.set(j+1,current) ;
        }
        return employee;
    }

    public static ArrayList<Employee> sortName(ArrayList<Employee> employee) {

        for(int i = 0; i< employee.size()-1; i++)
        {
            for (int j = i+1; j< employee.size(); j++)
            {
                if(employee.get(j).getPeople().getName().compareTo(employee.get(i).getPeople().getName())>0)
                {
                    Employee temp = employee.get(i);
                    employee.set(i,employee.get(j)) ;
                    employee.set(j,temp) ;
                }
            }
        }
        return employee;
    }
    public static ArrayList<Employee> sortSurname(ArrayList<Employee> employee) {

        for(int i = 0; i< employee.size()-1; i++)
        {
            for (int j = i+1; j< employee.size(); j++)
            {
                if(employee.get(i).getPeople().getSurname().compareTo(employee.get(j).getPeople().getSurname())>0)
                {
                    Employee temp = employee.get(i);
                    employee.set(i,employee.get(j)) ;
                    employee.set(j,temp) ;
                }
            }
        }
        return employee;
    }

    public static ArrayList<Employee> sortEmployeesByCountry(ArrayList<Employee> employees,String country){
        ArrayList<Employee> employeesByCountry=new ArrayList<>();
        for (Employee i:employees){
            if(Objects.equals(i.getPeople().getAddres().getCountry(), country)){
                employeesByCountry.add(i);
            }
        }
        return employeesByCountry;


    }
    public static ArrayList<Employee> sortEmployeesByDistrict(ArrayList<Employee> employees,String district){
        ArrayList<Employee> employeesByDistrict=new ArrayList<>();
        for (Employee i:employees){
            if(i.getPeople().getAddres().getDistrict().equals(district)){
                employeesByDistrict.add(i);
            }
        }
        return employeesByDistrict;
    }

    public static ArrayList<Employee> sortEmployeesByCityOrVillage(ArrayList<Employee> employees,String cityOrVillage){
        ArrayList<Employee> employeesByCityOrVillage=new ArrayList<>();
        for (Employee i:employees){
            if(i.getPeople().getAddres().getCityOrVillage().equals(cityOrVillage)){
                employeesByCityOrVillage.add(i);
            }
        }
        return employeesByCityOrVillage;
    }

}
