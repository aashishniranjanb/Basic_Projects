import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int operator;
        double result = 0;

        System.out.println("Enter first number:");
        num1 = scan.nextInt();

        System.out.println("Enter second number:");
        num2 = scan.nextInt();

        System.out.println("Choose operation: 1.Add  2.Subtract  3.Multiply  4.Divide");
        operator = scan.nextInt();

        switch (operator) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = (double) num1 / num2;
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
    }
}
