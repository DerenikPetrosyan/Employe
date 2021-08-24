package com.company;
import java.util.ArrayList;

public class Employee {
    private People people;
    private Position position;
    private float salary;
    private String bankCardNumber;

//    public Employee(People people, Position position, float salaryAMD, String bankCardNumber) {
//        try {
//            if (bankCardNumber.length() == 16) {
//                this.bankCardNumber = bankCardNumber;
//            }
//        } catch (RuntimeException exception) {
//            System.out.println("Enter the sixteen digits in front of your bank card");
//        }
//        this.people = people;
//        this.position = position;
//        this.salary = salaryAMD;
//    }
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
            this.salary=salary;
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

    public Employee getEmployeeByPhone(ArrayList<Employee> employees, String phoneNumber) {
        for (Employee i : employees) {
            if (i.getPeople().getPhoneNumber().equals(phoneNumber)) {
                return i;
            }
        }
        return null;
    }

    public Employee getEmployeeByBankCard(ArrayList<Employee> employees, String bankCardNumber) {
        for (Employee i : employees) {
            if (i.getBankCardNumber().equals(bankCardNumber)) {
                return i;
            }
        }
        return null;
    }

    public static String getEmployeeBySalary(ArrayList<Employee> employee, float salary) {
        for (Employee i : employee) {
            if (i.getSalary() == salary) {
                System.out.println(i);
            }
        }
        return "";
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public static void getEmployeeByAge(ArrayList<Employee> employee, int age) {
        for (Employee i : employee) {
            if (i.getPeople().getAge() == age) {
                System.out.println(i);
            }
        }

    }

    public static void getEmployeeByPosition(ArrayList<Employee> employee, Position position) {
        for (Employee i : employee) {
            if (i.getPosition().equals(position)) {
                System.out.println(i);
            }
        }

    }

    public static void getEmployeeByPeople(ArrayList<Employee> employee, People people) {
        for (Employee i : employee) {
            if (i.getPeople().equals(people)) {
                System.out.println(i);
            }
        }

    }

    public static void getEmployeeByName(ArrayList<Employee> employee, String name) {
        for (Employee i : employee) {
            if (i.getPeople().getName().equals(name)) {
                System.out.println(i);
            }
        }

    }

    public static void getEmployeeBySurname(ArrayList<Employee> employee, String surname) {
        for (Employee i : employee) {
            if (i.getPeople().getSurname().equals(surname)) {
                System.out.println(i);
            }
        }

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
