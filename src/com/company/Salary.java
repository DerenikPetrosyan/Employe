package com.company;

import java.util.ArrayList;

public class Salary {
    public static float maxSalary(ArrayList<Employee> employee) {
        float maxSelry = 0;
        for (Employee i : employee) {
            if (i.getSalary() > maxSelry) {
                maxSelry = i.getSalary();
            }
        }
        return maxSelry;
    }

    public static void maxSalaryEmployee(ArrayList<Employee> employee) {
        float maxSelry = maxSalary(employee);
        for (Employee i : employee) {
            if (i.getSalary() == maxSelry) {
                System.out.println(i);
            }
        }
    }

    public static float minSalary(ArrayList<Employee> employee) {
        float minSelry = employee.get(0).getSalary();
        for (Employee i : employee) {
            if (i.getSalary() < minSelry) {
                minSelry = i.getSalary();
            }
        }
        return minSelry;
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
        float incomeTax = 0;
        for (Employee i : employee)
            incomeTax = incomeTax + ((i.getSalary() * percent) / 100);
        return incomeTax;
    }

    public static float profit(ArrayList<Employee> employee, float income) {
        for (Employee i : employee)
            income = income - i.getSalary();
        return income;
    }

}
