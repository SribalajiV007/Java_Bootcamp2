import java.util.Scanner;

class Temperature
{
    public static void main(String[]args)
    {
       Scanner s = new Scanner(System.in);

       System.out.println("Enter Temperature in Celcius: ");
       double temp = s.nextDouble();

       double farenheit = (temp * 9/5) +32;

       System.out.println("Celcius to Fahrenheit: "+farenheit);



    }   
}