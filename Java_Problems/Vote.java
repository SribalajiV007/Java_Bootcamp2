
import java.util.Scanner;

class Vote{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter youR Age: ");
        int age = s.nextInt();
        
        
        if(age >= 18 && age <=60){
            System.out.println("You are Eligible to Vote");
        }else if (age > 60){
            System.out.println("You are eligible to vote through post");
        }else{
            System.out.println("You are not Eligible for Voting");
        }
        
    }
}