package PavanJava.Operators;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();

        String result = (n%2 == 0) ? "Even number" : "odd number";
        System.out.println(result);
    }
}
