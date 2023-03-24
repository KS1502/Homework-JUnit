package Homework;

public class Rectangler implements Shape {
    int length;
    int width;

    public Rectangler(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double totalSquare() {
        return 0;
    }

    @Override
    public double totalSquare(int a,int b) {
        return a+b;
    }
}
