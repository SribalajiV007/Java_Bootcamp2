
import java.util.Scanner;

class Salary_Hike_Calc{
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Salary Hike Calculator");

        System.out.println("Enter Your Basic Annual Salary: ");
        double salary = s.nextDouble();

        double hike = salary * 20/100;
        double hike_salary = salary + hike;

        double monthly_salary = salary/12;

        System.out.println("Calculating.....");
        Thread.sleep(2000);

        System.out.println("Your Salary is: "+salary);
        System.out.println("Salary after 20% Hike: "+hike_salary);
        System.out.println("Your Monthly Salary: "+monthly_salary);

    }
}