import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the radius of a circle");
        double radius = scanner.nextDouble();
        double diameter = calculateDiameter(radius);
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);
        System.out.println("The diameter is " + diameter + ", the area is " + area + ", the circumference is " + circumference);

    }

    public static double calculateDiameter(double radius) {
        return (2 * radius);
    }

    public static double calculateArea(double radius) {
        return (Math.PI * radius * radius);
    }
    public static double calculateCircumference(double radius) {
        return (2 * Math.PI * radius);
    }
}
