import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("Cannot divide by zero.");
                sc.close();
                return;
            }
            result = a / b;
        } else {
            System.out.println("Invalid operator.");
            sc.close();
            return;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}