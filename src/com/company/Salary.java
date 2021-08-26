package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Salary {
    public static float maxSalary(List<Employee> employee) {
      return Collections
                .max(employee.stream().map(Employee::getSalary).collect(Collectors.toList()));
    }

    public static void maxSalaryEmployee(List<Employee> employee) {
        float maxSelry = maxSalary(employee);
        for (Employee i : employee) {
            if (i.getSalary() == maxSelry) {
                System.out.println(i);
            }
        }
    }

    public static float minSalary(ArrayList<Employee> employee) {
        return Collections
                .min(employee.stream().map(Employee::getSalary).collect(Collectors.toList()));
    }

    public static void minSalaryEmployee(ArrayList<Employee> employee) {
        float minSelry = minSalary(employee);
        for (Employee i : employee) {
            if (i.getSalary() == minSelry) {
                System.out.println(i);
            }
        }
    }

    public static void rangeSalary(ArrayList<Employee> employee, float firstSalary, float secondSalary) {
        if (firstSalary > secondSalary) {
            float count = firstSalary;
            firstSalary = secondSalary;
            secondSalary = count;
        }
        for (Employee i : employee) {
            if (i.getSalary() >= firstSalary && i.getSalary() <= secondSalary) {
                System.out.println(i);
            }
        }
    }

    public static void valueBigSalary(ArrayList<Employee> employee, float value) {
        for (Employee i : employee) {
            if (i.getSalary() > value) {
                System.out.println(i);
            }
        }
    }

    public static void valueSmallSalary(ArrayList<Employee> employee, float value) {
        for (Employee i : employee) {
            if (i.getSalary() < value) {
                System.out.println(i);
            }
        }
    }

    public static void salaryIncrease(ArrayList<Employee> employee, int percent) {
        for (Employee i : employee) i.setSalary(i.getSalary() + ((i.getSalary() * percent) / 100));
    }

    public static void salaryReduction(ArrayList<Employee> employee, int percent) {
        for (Employee i : employee) i.setSalary(i.getSalary() - ((i.getSalary() * percent) / 100));
    }

    public static float incomeTaxSalary(ArrayList<Employee> employee, int percent) {
       Stream<Float>  sum = Salary.getEmployeesSalary(employee).stream().map(i -> i+(i * percent) / 100);
        return  sum.reduce((float) 0, (a, b) -> a + b);

    }

    public static float profit(List<Employee> employee, float income) {
        income  = income-Salary.getEmployeesSalary(employee).stream().reduce((float) 0, (a, b) -> a + b);
        return income;
    }

    public static List<Float> getEmployeesSalary(List<Employee> employees){
        List<Float> salary =  employees.stream().map(t->t.getSalary()).collect(Collectors.toList());
        return salary;
    }

}
