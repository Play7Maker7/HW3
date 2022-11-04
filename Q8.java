import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        Double hours , salary=9.25 , salary_after , extra_hours;
        String name;
        System.out.println("Enter the employee name: ");
        name=sin.next();
        System.out.println("Enter the employee`s work hours past week: ");
        hours=sin.nextDouble();
        if (hours<=40)
        {
            salary_after=salary*hours;
            System.out.println("Employee`s name: "+name+"\nEmployee`s salary past week: "+salary_after+"$");
        }
        else if (hours>40)
        {
            extra_hours=hours-40;
            salary_after=(salary*40)+(salary*extra_hours*1.5);
            System.out.println("Employee`s name: "+name+"\nEmployee`s salary past week: "+salary_after+"$");
        }
        else System.out.println("No body can work for minus hours...");
    }
}