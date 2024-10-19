package task_2.figure;

import task_2.abstractFigure.Figure;

public class Triangle extends Figure {
     double a;
     double b;
     double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return a*b*c;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
