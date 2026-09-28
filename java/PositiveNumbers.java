import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number:");
        int number1=input.nextInt();
        System.out.print("Enter your number:");
         int number2=input.nextInt();
        if(number1>0 && number2>0){
            int sum=number1+number2;
            System.out.println(sum);}
        else{
            int multiplaction=number1*number2;
            System.out.println(multiplaction);}
        System.out.println("Finish");
    }
    
}
