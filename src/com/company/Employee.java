package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private float salary;
    private People people;
    private Position position;
    private String bankCardNumber;

    public static class Builder {
        private People people;
        private Position position;
        private float salary;
        private String bankCardNumber;

        public Builder(People people) {
            this.people = people;
        }
        public Employee.Builder position(Position position) {
            this.position = position;
            return this;
        }

        public Employee.Builder salaryAMD(float salary) {
            this.salary = salary;
            return this;
        }

        public Employee.Builder bankCardNumber(String bankCardNumber) {
            try {
                if (bankCardNumber.length() == 16) {
                    this.bankCardNumber = bankCardNumber;
                }
            } catch (RuntimeException exception) {
                System.out.println("Enter the sixteen digits in front of your bank card");
            }
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.people = this.people;
            employee.position = this.position;
            employee.salary = this.salary;
            employee.bankCardNumber = this.bankCardNumber;

            return employee;
        }

    }

    private Employee() {
    }


    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }


    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        try {
            if (bankCardNumber.length() == 16) {
                this.bankCardNumber = bankCardNumber;
            }
        } catch (RuntimeException exception) {
            System.out.println("Enter the sixteen digits in front of your bank card");
        }
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    public void  getEmployeeByPhone(ArrayList<Employee> employees, String phoneNumber) {
        employees.stream().filter(t->t.getPeople().getPhoneNumber().equals(phoneNumber))
                .forEach(System.out::println);
    }

    public void getEmployeeByBankCard(ArrayList<Employee> employees, String bankCardNumber) {
        employees.stream().filter(t->t.getBankCardNumber().equals(bankCardNumber))
                .forEach(System.out::println);
    }

    public static void getEmployeeBySalary(ArrayList<Employee> employee, float salary) {
        employee.stream().filter(t->t.getSalary()==(salary))
                .forEach(System.out::println);
    }


    public static void getEmployeeByAge(ArrayList<Employee> employee, int age) {
        employee.stream().filter(t->t.getPeople().getAge()==(age))
                .forEach(System.out::println);
    }

    public static void getEmployeeByPosition(ArrayList<Employee> employee, Position position) {
        employee.stream().filter(t->t.getPosition().equals(position))
                .forEach(System.out::println);
    }

    public static void getEmployeeByPeople(ArrayList<Employee> employee, People people) {
            employee.stream().filter(t->t.getPeople().equals(people))
                    .forEach(System.out::println);
    }

    public static void getEmployeeByName(ArrayList<Employee> employee, String name) {
        employee.stream().filter(t->t.getPeople().getName().equals(name))
                .forEach(System.out::println);
    }

    public static void getEmployeeBySurname(ArrayList<Employee> employee, String surname) {
        employee.stream().filter(t->t.getPeople().getSurname().equals(surname))
                .forEach(System.out::println);

        }
    public static void getEmployeeByNameSurname(ArrayList<Employee> employee, String name, String surname) {
        for (Employee i : employee) {
            if (i.getPeople().getName().equals(name) && i.getPeople().getSurname().equals(surname)) {
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                people +
                "\n, position =" + position +
                ", salary =" + salary +
                ", bankCardNumber ='" + bankCardNumber + '\'' +
                '}';
    }
}
