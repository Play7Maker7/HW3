import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        int X , Y;
        String[] Z = new String[12];
        System.out.println("Enter the month: ");
        X=sin.nextInt();
        System.out.println("Enter the day");
        Y=sin.nextInt();
        if ((X>0&&X<13)&&(Y>0&&Y<33))
        {
            for (int i=0;i<12;i++)
            {
                if (i<3)
                    Z[i]="Winter";
                else if (i<6)
                    Z[i]="Spring";
                else if (i<9)
                    Z[i]="Summer";
                else if (i<12)
                    Z[i]="Fall";
            }
            if (Y>=21&&(X==3||X==6||X==9||X==12))
                X+=1;
            System.out.println("The season is: "+Z[X-1]);
        }
        else System.out.println("Such a day/month doesn't exist.");
    }
}
