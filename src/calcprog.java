package src;
import java.util.Scanner;

public class calcprog {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double num1;
    double num2;
    char operator;
    double result =0;
    boolean validOperation= true;

    System.out.print("enter the fist number :");
    num1= scanner.nextDouble();

    System.out.print("enter the operator :");
    operator = scanner.next().charAt(0);
    
    System.out.print("enter the second number :");
    num2=scanner.nextDouble();

    switch(operator){
        case '+' -> result = num1 + num2;
        case '-' -> result = num1 - num2;
        case '*'->  result = num1 * num2;
        case '/' -> {
            if (num2==0){
                System.out.println("zero not allowed in denominator");
                validOperation=false;
            }
            else{
                result= num1/num2;
            }
        }
        default -> {
            System.out.println("invalid hai bhai");
            validOperation=false;
        }
    }       
if ( validOperation){
    System.out.println(result);
}
scanner.close();       
}
}
    
    

