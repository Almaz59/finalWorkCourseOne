package ru.stepik;

import java.util.Arrays;

public class Main {

    public static void print(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sumOfMonth(Employee[] salary) {
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i].salaryOfEmployee;
        }
        System.out.println("Сумма затарат на ЗП в месяц составляет: " + sum + " рублей");
    }

    public static void minSalary(Employee[] minSalary) {
        double min = Integer.MAX_VALUE;
        String nameOfEmployeeWithMinSalary = "";
        for (int i = 0; i < minSalary.length; i++) {
            if (minSalary[i].salaryOfEmployee < min) {
                min = minSalary[i].salaryOfEmployee;
                nameOfEmployeeWithMinSalary = minSalary[i].lastNameOfEmployee + " " + minSalary[i].firstNameOfEmployee + " " + minSalary[i].middleNameOfEmployee;
                ;
            }
        }
        System.out.println("Сотрудник с минимальной ЗП: " + nameOfEmployeeWithMinSalary + " eго ЗП составляет: " + min);
    }

    public static void maxSalary(Employee[] maxSalary) {
        double max = Integer.MIN_VALUE;
        String nameOfEmployeeWithMaxSalary = "";
        for (int i = 0; i < maxSalary.length; i++) {
            if (maxSalary[i].salaryOfEmployee > max) {
                max = maxSalary[i].salaryOfEmployee;
                nameOfEmployeeWithMaxSalary = maxSalary[i].lastNameOfEmployee + " " + maxSalary[i].firstNameOfEmployee + " " + maxSalary[i].middleNameOfEmployee;

            }
        }
        System.out.println("Сотрудник с максимальной ЗП: " + nameOfEmployeeWithMaxSalary + " eго ЗП составляет: " + max);
    }

    public static void middleSum(Employee[] midSum) {
        double sum = 0;
        for (int i = 0; i < midSum.length; i++) {
            sum += midSum[i].salaryOfEmployee;
        }
        System.out.println("Среднее значение ЗП составляет: " + sum / midSum.length + " рублей");
    }

    public static void listOfEmployee(Employee[] list) {
        String name = "";
        for (int i = 0; i < list.length; i++) {
            name += list[i].lastNameOfEmployee + " " + list[i].firstNameOfEmployee + " " + list[i].middleNameOfEmployee + "\n";
        }
        System.out.printf(name);
        System.out.println();
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван", "Иванович", "Иванов", 100000, 5);
        employees[1] = new Employee("Петр", "Петрович", "Петров", 110000, 5);
        employees[2] = new Employee("Семен", "Семенович", "Семенов", 120000, 4);
        employees[3] = new Employee("Алексей", "Алексеевич", "Алексеев", 130000, 4);
        employees[4] = new Employee("Александр", "Александров", "Александрович", 140000, 3);
        employees[5] = new Employee("Антон", "Антонович", "Антонов", 150000, 3);
        employees[6] = new Employee("Илья", "Ильич", "Ильин", 160000, 2);
        employees[7] = new Employee("Василий", "Васильевич", "Васильев", 170000, 2);
        employees[8] = new Employee("Борис", "Борисович", "Борисов", 180000, 1);
        employees[9] = new Employee("Алмаз", "Нагимович", "Маматов", 190000, 1);

        print(employees);
        sumOfMonth(employees);
        minSalary(employees);
        maxSalary(employees);
        middleSum(employees);
        listOfEmployee(employees);
    }


}
