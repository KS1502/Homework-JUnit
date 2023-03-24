package Homework;

public class Maint {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());

        Shape rectangle = new Rectangler(10, 10);
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());
    }
}