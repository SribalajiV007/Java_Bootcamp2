package PavanJava.Operators;

import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n1 = s.nextInt();

        System.out.print("Enter second number: ");
        int n2 = s.nextInt();

        System.out.print("Enter operation (=,-,x,/,%): ");
        char operation = s.next().charAt(0);

        switch(operation){
            case '+':
                System.out.println("Addition of two numbers is: "+(n1+n2));
                break;
            case '-':
                System.out.println("Addition of two numbers is: "+(n1-n2));
                break;
            case 'x':
                System.out.println("Addition of two numbers is: "+(n1*n2));
                break;
            case '/':
                System.out.println("Addition of two numbers is: "+(n1/n2));
                break;
            case '%':
                System.out.println("Addition of two numbers is: "+(n1%n2));
                break;
            default:
                System.out.println("Enter correct oepration");
        }
    }
}
