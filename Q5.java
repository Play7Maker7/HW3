import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int X , Y , Z;
        System.out.println("Enter 3 integers: ");
        X=sin.nextInt();
        Y=sin.nextInt();
        Z=sin.nextInt();
        if (X==Y&&Y==Z) System.out.println("All the same!");
        else if (X!=Y&&Y!=Z&&Z!=X) System.out.println("All different!");
        else System.out.println("Neither.");
    }
}
