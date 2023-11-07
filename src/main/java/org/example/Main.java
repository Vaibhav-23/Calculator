package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("The world's first unscientific calculator. Now with many DevOps tools behind it");
        Scanner reader = new Scanner(System.in);
        int op, flag = 0;
        double num1, num2;

        do {
            System.out.println("------------Calculator--------------");
            System.out.println("Choices of Operations:");
            System.out.println("");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Sine");
            System.out.println("6. Cosine");
            System.out.println("7. Tangent");
            System.out.println("8. Exponential");
            System.out.println("9. Absolute Value");
            System.out.println("10. Addition");
            System.out.println("11. Subtraction");
            System.out.println("12. Multiplication");
            System.out.println("13. Division");
            System.out.println("14. Exit");
            System.out.println("");
            System.out.print("Enter your choice(number): ");
            System.out.println("");
            op = reader.nextInt();
            if (op == 14) flag = 1;
            else {
                switch (op) {
                    case 1:  // Square Root
                        System.out.println("You choose Square Root!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num1 = reader.nextDouble();
                        squareRoot(num1);
                        break;

                    case 2: // Factorial
                        System.out.println("You choose Factorial!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        int num = reader.nextInt();
                        factorial(num);
                        break;

                    case 3: // Natural Log
                        System.out.println("You choose Natural Log!!");
                        System.out.println(" ");
                        System.out.print("Enter number: ");
                        num1 = reader.nextDouble();
                        naturalLog(num1);
                        break;

                    case 4: // Power
                        System.out.println("You choose Power!!");
                        System.out.println("");
                        System.out.print("Enter base: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exp = reader.nextDouble();
                        power(num1, exp);
                        break;

                    case 5: // Sine
                        System.out.println("You choose Sine!!");
                        System.out.println("");
                        System.out.print("Enter angle in radians: ");
                        num1 = reader.nextDouble();
                        sine(num1);
                        break;

                    case 6: // Cosine
                        System.out.println("You choose Cosine!!");
                        System.out.println("");
                        System.out.print("Enter angle in radians: ");
                        num1 = reader.nextDouble();
                        cosine(num1);
                        break;

                    case 7: // Tangent
                        System.out.println("You choose Tangent!!");
                        System.out.println("");
                        System.out.print("Enter angle in radians: ");
                        num1 = reader.nextDouble();
                        tangent(num1);
                        break;

                    case 8: // Exponential
                        System.out.println("You choose Exponential!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num1 = reader.nextDouble();
                        exponential(num1);
                        break;

                    case 9: // Absolute Value
                        System.out.println("You choose Absolute Value!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num1 = reader.nextDouble();
                        absoluteValue(num1);
                        break;

                    case 10: // Addition
                        System.out.println("You choose Addition!!");
                        System.out.println("");
                        System.out.print("Enter first number: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = reader.nextDouble();
                        addition(num1, num2);
                        break;

                    case 11: // Subtraction
                        System.out.println("You choose Subtraction!!");
                        System.out.println("");
                        System.out.print("Enter first number: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = reader.nextDouble();
                        subtraction(num1, num2);
                        break;

                    case 12: // Multiplication
                        System.out.println("You choose Multiplication!!");
                        System.out.println("");
                        System.out.print("Enter first number: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = reader.nextDouble();
                        multiplication(num1, num2);
                        break;

                    case 13: // Division
                        System.out.println("You choose Division!!");
                        System.out.println("");
                        System.out.print("Enter numerator: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter denominator: ");
                        num2 = reader.nextDouble();
                        division(num1, num2);
                        break;

                    default:
                        System.out.println("Exiting due to invalid input!!");
                        flag = 1;
                }
            }
        } while (flag == 0);
    }

    public static double squareRoot(double num) {
        double c = Math.sqrt(num);
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing squareRoot function!");
        return c;
    }

    public static int factorial(int num) {
        int c = num;
        if (num == 0) {
            c = 1; // Factorial of 0 is 1
        } else {
            for (int i = num - 1; i >= 1; i--) {
                c = c * i;
            }
        }
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Factorial function!");
        return c;
    }

    public static double naturalLog(double num) {
        double c = Math.log(num);
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing naturalLog function!");
        return c;
    }

    public static double power(double num, double exp) {
        double c = Math.pow(num, exp);
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Power function!");
        return c;
    }

    public static double sine(double num) {
        double c = Math.sin(num);
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Sine function!");
        return c;
    }

    public static double cosine(double num) {
        double c = Math.cos(num);
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Cosine function!");
        return c;
    }

    public static double tangent(double num) {
        double c = Math.tan(num);
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Tangent function!");
        return c;
    }

    public static double exponential(double num) {
        double c = Math.exp(num);
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Exponential function!");
        return c;
    }

    public static double absoluteValue(double num) {
        double c = Math.abs(num);
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Absolute Value function!");
        return c;
    }

    public static double addition(double num1, double num2) {
        double c = num1 + num2;
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Addition function!");
        return c;
    }

    public static double subtraction(double num1, double num2) {
        double c = num1 - num2;
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Subtraction function!");
        return c;
    }

    public static double multiplication(double num1, double num2) {
        double c = num1 * num2;
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Multiplication function!");
        return c;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        double c = num1 / num2;
        System.out.println("");
        System.out.println("The Result is " + c);
        System.out.println("");
        logger.info("Executing Division function!");
        return c;
    }
}
