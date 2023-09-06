import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        //The Scanner class is introduced into the code to allow input from the user
        Scanner scanner = new Scanner(System.in);
        //the print function asks for a temperature in fahrenheit, then the variable "fahrenheit" is set to the temperature the user inputs
        System.out.println("give me a temperature in fahrenheit");
        double fahrenheit = scanner.nextDouble();
        //the next 4 lines calculate the conversions from fahrenheit to celsius and celsius to kelvin and prints them both
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("your temperature in celsius is " + celsius);
        double kelvin = (celsius + 273.15);
        System.out.println("your temperature in kelvin is " + kelvin);
    }
}
