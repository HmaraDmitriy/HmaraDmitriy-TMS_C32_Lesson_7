package task_2.abstractFigure;

public abstract class Figure {
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Figure: Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
