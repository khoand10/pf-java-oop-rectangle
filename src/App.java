import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle retangle = new Rectangle(width,height);
        System.out.println(String.format("Info "+retangle.toString()));
        System.out.println(String.format("Area :"+retangle.getArea()));
        System.out.println(String.format("Perimeter :"+retangle.getPerimeter()));
    }
}

class Rectangle {
    public double width;
    public double height;

    Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}