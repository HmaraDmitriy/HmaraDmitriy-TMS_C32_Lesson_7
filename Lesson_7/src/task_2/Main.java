package task_2;

/*Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра
(используя абстрактный класс/методы).
Создать массив из 5 разных фигур.
Пройтись циклом по массиву и вывести информацию о каждой фигуре.
Вывести на экран сумму периметров всех фигур в массиве.*/


import task_2.abstractFigure.Figure;
import task_2.figure.Circle;
import task_2.figure.Rectangle;
import task_2.figure.Triangle;

public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[] {
                new Triangle(12, 5, 7),
                new Rectangle(17, 10),
                new Rectangle(2, 3),
                new Circle(9),
                new Circle(1.5)
        };

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            System.out.println(figure);
            totalPerimeter += figure.getPerimeter();
        }
        System.out.println("Total Perimeter all Figures: " + totalPerimeter);

    }
}
