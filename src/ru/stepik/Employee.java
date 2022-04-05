package ru.stepik;

public class Employee {
    String firstNameOfEmployee;
    String middleNameOfEmployee;
    String lastNameOfEmployee;
    int salaryOfEmployee;
    int department;
    static int count;
    int id;

    public Employee(String firstNameOfEmployee, String middleNameOfEmployee, String lastNameOfEmployee, int salaryOfEmployee, int department) {
        this.firstNameOfEmployee = firstNameOfEmployee;
        this.middleNameOfEmployee = middleNameOfEmployee;
        this.lastNameOfEmployee = lastNameOfEmployee;
        this.salaryOfEmployee = salaryOfEmployee;
        this.department = department;
    }

    public String getFirstNameOfEmployee() {
        return this.firstNameOfEmployee;
    }

    public String getMiddleNameOfEmployee() {
        return this.middleNameOfEmployee;
    }

    public String getLastNameOfEmployee() {
        return this.lastNameOfEmployee;
    }

    public int getSalaryOfEmployee() {
        return this.salaryOfEmployee;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getCount() {
        return count++;
    }

    public int getId() {
        return this.id;
    }

    public void setSalaryOfEmployee(int salaryOfEmployee) {
        this.salaryOfEmployee = salaryOfEmployee;
    }

    public void setDepartment(int department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "№ п/п: " + (getCount() + 1) + " | " + "Имя сотрудника: " + firstNameOfEmployee + " |" + " Отчество сотрудника: " + middleNameOfEmployee + " |" + " Фамилия сорудника: " + lastNameOfEmployee + " |" + " ЗП сотрудника " + salaryOfEmployee + " рублей " + "|" + " Отдел сотрудника: " + department;
    }
}
