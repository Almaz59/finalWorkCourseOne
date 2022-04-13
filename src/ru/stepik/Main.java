package ru.stepik;

public class Main {

    public static void getPrint(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void calculateSumOfMonth(Employee[] salary) {
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i].salaryOfEmployee;
        }
        System.out.println("Сумма затарат на ЗП в месяц составляет: " + sum + " рублей");
    }

    public static void findMinSalary(Employee[] minSalary) {
        double min = Double.MAX_VALUE;
        String nameOfEmployeeWithMinSalary = "";
        for (int i = 0; i < minSalary.length; i++) {
            if (minSalary[i].salaryOfEmployee < min) {
                min = minSalary[i].salaryOfEmployee;
                nameOfEmployeeWithMinSalary = getFullName(new Employee[]{minSalary[i]});

            }
        }
        System.out.println("Сотрудник с минимальной ЗП: " + nameOfEmployeeWithMinSalary + " eго ЗП составляет: " + min);
    }

    private static String getFullName(Employee[] array) {
        String fullNameOfEmployee = "";
        for (int i = 0; i < array.length; i++) {
            fullNameOfEmployee = array[i].firstNameOfEmployee + " " + array[i].middleNameOfEmployee + " "
                    + array[i].lastNameOfEmployee;
        }
        return fullNameOfEmployee;
    }

    public static void findMaxSalary(Employee[] maxSalary) {
        double max = Double.MIN_VALUE;
        String nameOfEmployeeWithMaxSalary = "";
        for (int i = 0; i < maxSalary.length; i++) {
            if (maxSalary[i].salaryOfEmployee > max) {
                max = maxSalary[i].salaryOfEmployee;
                nameOfEmployeeWithMaxSalary = getFullName(new Employee[]{maxSalary[i]});

            }
        }
        System.out.println("Сотрудник с максимальной ЗП: " + nameOfEmployeeWithMaxSalary + " eго ЗП составляет: " + max);
    }

    public static void calculateMiddleSum(Employee[] midSum) {
        double sum = 0;
        for (int i = 0; i < midSum.length; i++) {
            sum += midSum[i].salaryOfEmployee;
        }
        System.out.println("Среднее значение ЗП составляет: " + sum / midSum.length + " рублей");
    }

    public static void getListOfEmployee(Employee[] list) {
        String name = "";
        for (int i = 0; i < list.length; i++) {
            name += list[i].lastNameOfEmployee + " " + list[i].firstNameOfEmployee + " "
                    + list[i].middleNameOfEmployee + "\n";
        }
        System.out.println("Список всех сотрудников: ");
        System.out.println(name);
    }

    public static void findMinSalaryOfDepartment(Employee[] array) {
        int numOfDepartment = 5;
        double min = Integer.MAX_VALUE;
        String nameOfEmployeeWithMinSalary = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].department == numOfDepartment && min > array[i].salaryOfEmployee) {
                min = array[i].salaryOfEmployee;
                nameOfEmployeeWithMinSalary =  getFullName(new Employee[]{array[i]});

            }
        }
        System.out.println("Минимальный размер ЗП в отделе " + numOfDepartment + " у сотрудника: " + nameOfEmployeeWithMinSalary
                + " которая составляет - " + min + " рублей");
        System.out.println("====================================================================================================================================================================");
    }

    public static void findMaxSalaryOfDepartment(Employee[] array) {
        int numOfDepartment = 1;
        double max = Integer.MIN_VALUE;
        String nameOfEmployeeWithMaxSalary = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].department == numOfDepartment && max < array[i].salaryOfEmployee) {
                max = array[i].salaryOfEmployee;
                nameOfEmployeeWithMaxSalary = getFullName(new Employee[]{array[i]});

            }
        }
        System.out.println("Максимальный размер ЗП в отделе " + numOfDepartment + " у сотрудника: " + nameOfEmployeeWithMaxSalary
                + " которая составляет - " + max + " рублей");
        System.out.println("====================================================================================================================================================================");
    }


    public static void calculateSumOfSalaryDepartment(Employee[] array) {
        double sum = 0;
        int numOfDepartment = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].department == numOfDepartment) {
                sum += array[i].salaryOfEmployee;
            }
        }
        System.out.println("Сумма затрат на ЗП по отделу " + numOfDepartment + " составляет " + sum + " рублей");
        System.out.println("====================================================================================================================================================================");
    }

    public static void calculateMediumOfSalaryDepartment(Employee[] array) {
        double sum = 0;
        int count = 0;
        int numOfDepartment = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].department == numOfDepartment) {
                sum += array[i].salaryOfEmployee;
                count++;
            }
        }
        System.out.println("Размер средней ЗП по отделу " + numOfDepartment + " составляет "
                + sum / count + " рублей");
        System.out.println("====================================================================================================================================================================");
    }

    public static double getIndexSalary(Employee[] array) {
        double index = 0.01;
        for (int i = 0; i < array.length; i++) {
            array[i].salaryOfEmployee *= (1 + index);
        }
        return index;
    }

    public static void getPrintListOfEmployees(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString1());
        }
        System.out.println("====================================================================================================================================================================");
    }

    public static void getSalaryLessThen(Employee[] array) {
        double salaryLess = 150000;
        System.out.println("Сотрудники с ЗП меньше "+salaryLess+" рублей");
        for (int i = 0; i < array.length; i++) {
            if (array[i].salaryOfEmployee < salaryLess) {
                System.out.println(array[i].toString1());
            }
        }
        System.out.println("====================================================================================================================================================================");
    }

    public static void getSalaryMoreThen(Employee[] array) {
        double salaryMore = 150000;
        System.out.println("Сотрудники с ЗП больше "+salaryMore+" рублей");
        for (int i = 0; i < array.length; i++) {
            if (array[i].salaryOfEmployee >= salaryMore) {
                System.out.println(array[i].toString1());
            }
        }
        System.out.println("====================================================================================================================================================================");
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

//        getPrint(employees);
//        calculateSumOfMonth(employees);
//        findMinSalary(employees);
//        findMaxSalary(employees);
//        calculateMiddleSum(employees);
//        getListOfEmployee(employees);
        findMinSalaryOfDepartment(employees);
        findMaxSalaryOfDepartment(employees);
        calculateSumOfSalaryDepartment(employees);
        calculateMediumOfSalaryDepartment(employees);
        getIndexSalary(employees);
        getPrintListOfEmployees(employees);
        getSalaryLessThen(employees);
        getSalaryMoreThen(employees);
    }

}

