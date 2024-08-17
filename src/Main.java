import Models.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();


        boolean validOperation = false;

        while(!validOperation) {
            System.out.println("What do you want to do?");
            System.out.println("Enter add to add , sub to subtract , multiply to Multiply and divide to Divide");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("add")) {
                double sum = calculator.add(num1, num2);
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
                validOperation = true;
            }
            else if (operation.equalsIgnoreCase("sub")) {
                double sub = calculator.subtract(num1, num2);
                System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub);
                validOperation = true;

            }
            else if (operation.equalsIgnoreCase("multiply")) {
                double mul = calculator.multiply(num1, num2);
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + mul);
                validOperation = true;

            }
            else if (operation.equalsIgnoreCase("divide")) {
                double div = calculator.divide(num1, num2);
                System.out.println("Division of " + num1 + " and " + num2 + " is " + div);
                validOperation = true;
            }

            else {
                System.out.println("Invalid operation");
                validOperation = false;
            }
        }








        }











    }

