import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int X;
        System.out.println("Enter an integer: ");
        X=sin.nextInt();
        if (X>0) System.out.println("The number is positive.");
        else if (X<0) System.out.println("The number is negative.");
        else System.out.println("The number is Zero.");
    }
}
