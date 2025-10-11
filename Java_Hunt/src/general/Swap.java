package general;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        System.out.println("Before Swap a: "+a+" b: "+b);

        int c = a;
         a = b;
         b = c;

        System.out.println("After Swap a: "+a+" b: "+b);
    }
}
