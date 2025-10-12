package PavanJava.Operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Base: ");
        int base = s.nextInt();

        System.out.print("Enter Exponent: ");
        int exponent = s.nextInt();

        int result =1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + "^" +exponent+" = "+ result);
    }
}
