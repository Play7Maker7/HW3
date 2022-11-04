import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int X;
        System.out.println("Enter an integer: ");
        X=sin.nextInt();
        if (X<-1) X*=-1;
        System.out.println("\n");
        if (X>10000000) System.out.println("Too big number.");
        else if (X>9999999) System.out.println("The number has 8 digits.");
        else if (X>999999) System.out.println("The number has 7 digits.");
        else if (X>99999) System.out.println("The number has 6 digits.");
        else if (X>9999) System.out.println("The number has 5 digits.");
        else if (X>999) System.out.println("The number has 4 digits.");
        else if (X>99) System.out.println("The number has 3 digits.");
        else if (X>9) System.out.println("The number has 2 digits.");
        else if (X<9) System.out.println("The number has 1 digits.");
    }
}
