import java.util.Scanner;

class LargestOfThree{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = s.nextInt();

        System.out.print("Enter first number: ");
        int b = s.nextInt();

        System.out.print("Enter first number: ");
        int c = s.nextInt();

        int largest = a;

        if(b > a){
            largest = b;
        }else if(c > a){
            largest = c;
        }

        System.out.println("Largest of three numbers is: "+largest);
    }
}