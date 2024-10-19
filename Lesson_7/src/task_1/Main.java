package task_1;

/*Задача 1:
Создать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
Имплементировать этот метод в созданные классы.
Создать класс-раннер с методом мейн для запуска программы.
Запросить с консоли код должности и вывести название должности на экран.*/


import task_1.employee.Accountant;
import task_1.employee.Director;
import task_1.employee.Worker;
import task_1.interfaceJobTitle.JobTitle;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the code 1 - Director, 2 - Worker, 3 - Accountant:");
        int cod = scanner.nextInt();

        JobTitle jobTitle;

        switch (cod) {
            case 1 -> jobTitle = new Director();
            case 2 -> jobTitle = new Worker();
            case 3 -> jobTitle = new Accountant();
            default -> {
                System.out.println("Invalid code.");
                return;
            }
        }

        jobTitle.printJobTitle();
    }
}
