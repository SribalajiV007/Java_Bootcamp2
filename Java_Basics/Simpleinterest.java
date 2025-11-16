import java.util.Scanner;

class Simpleinterest{
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        System.out.println("Simple Interest Calculator");
        System.out.println("Enter Principal: ");
        double principal = s.nextDouble();

        System.out.println("Enter rate of interest: ");
        double roi = s.nextDouble();
        

        System.out.println("Enter Time in years(Mention 0.n if month): ");
        double time = s.nextDouble();

        double SimpleIntrest = principal * roi * time / 100;
        System.out.println("Simple Interest = "+SimpleIntrest);
    }
}