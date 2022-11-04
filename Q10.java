import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int X , Y = 0;
        System.out.println("Enter the month: ");
        X=sin.nextInt();
        if (X<=12&&X>0)
        {
            for (int i=0;i<13;i++)
            {
                if (X==2) Y=28;
                else Y=30;
            }
            System.out.println("There are "+Y+" days in this month.");
        }
        else System.out.println("Such a month doesn't exist.");
    }
}
