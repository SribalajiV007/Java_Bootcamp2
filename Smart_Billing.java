import java.util.Scanner;

public class Smart_Billing{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Smart Billing");
        System.out.print("Enter number of items to buy: ");
        int n = s.nextInt();

        String item1;

        int i = 1;
        while(i <= n){
           System.out.print("Enter Item name: ");
           item1 = s.next();
           i++;
        }
         
        System.out.println();
    }
}