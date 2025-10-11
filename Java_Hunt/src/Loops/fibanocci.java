package Loops;

import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = s.nextInt();

        int first = 0;
        int second =1;

        for(int i =2;i< n; i++){
            System.out.print(first+" ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

//Solution
//Scanner s = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//int n = s.nextInt();
//
//int a= 0;
//int b =1;
//int count = 2;
//
//        while(count <=n){
//int temp = b;
//b = b+a;
//a= temp;
//count++;
//        System.out.print(b+" ");