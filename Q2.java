import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int X;
        String Y;
        System.out.println("Enter a chess board square, number: ");
        X=sin.nextInt();
        System.out.println("Enter a chess board square, Letter: ");
        Y=sin.next();
        if (X<=8&&X>=1&&X%2!=0)
        {
            if (Y.equals("a")||Y.equals("c")||Y.equals("e")||Y.equals("g"))
                System.out.println("The Square "+X+Y+" is black.");
            else if (Y.equals("b")||Y.equals("d")||Y.equals("f")||Y.equals("h"))
                    System.out.println("The Square "+X+Y+" is White.");
        }
        else if (X<=8&&X>=1&&X%2==0)
        {
            if (Y.equals("a")||Y.equals("c")||Y.equals("e")||Y.equals("g"))
                System.out.println("The Square "+X+Y+" is White.");
            else if (Y.equals("b")||Y.equals("d")||Y.equals("f")||Y.equals("h"))
                System.out.println("The Square "+X+Y+" is black.");
        }
        else System.out.println("Wrong input");
    }
}