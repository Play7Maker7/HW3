import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int X , Y , Z;
        System.out.println("Enter 3 integers: ");
        X=sin.nextInt();
        Y=sin.nextInt();
        Z=sin.nextInt();
        if (X>Y&&Y>Z) System.out.println("Decreasing rate!");
        else if (X<Y&&Y<Z) System.out.println("Increasing rate!");
        else System.out.println("Neither.");
    }
}
