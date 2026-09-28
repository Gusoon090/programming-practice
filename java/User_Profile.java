import java.util.*;
public class User_Profile {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your name:");
        String name=input.nextLine();
        System.out.print("Enter your age:");
        int age=input.nextInt();
        System.out.print("Enter your GPA:");
        double GPA=input.nextDouble();
        System.out.print("Are you currently a student?(true/false):");
        boolean isStudent=input.nextBoolean();
        input.nextLine();
        System.out.println("Enter your top 3 skills :");
        System.out.print("Skills1:");
        String skills1=input.nextLine();
        System.out.print("Skills2:");
        String skills2=input.nextLine();
        System.out.print("Skills3:");
        String skills3=input.nextLine();

        System.out.println("----------------------------------");
        System.out.println("         User Profile Card        ");
        System.out.println("----------------------------------");
        System.out.printf("Name: %s%n",name);
        System.out.printf("Age: %d%n",age);
        System.out.printf("GPA: %.2f%n",GPA);
        System.out.printf("Is student : %b%n",isStudent);
        System.out.printf("Skills: %s ,%s ,%s%n ",skills1,skills2,skills3);









    }
}
