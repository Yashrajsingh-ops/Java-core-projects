import java.util.Scanner;
public class weightconvertor {
     public static void main(String[]args){

        Scanner scanner = new Scanner (System.in);

        double weight ;
        double newWeight;
        int choice;

        System.out.println("Weight Converter Programme");
        System.out.println("1:covert lbs to kgs");
        System.out.println("2:convert kgs to lbs");

        System.out.println("choose an option: ");
        choice=scanner.nextInt();

        if(choice==1){
            System.out.println("enter the weight in lbs:");
            weight=scanner.nextDouble();
            newWeight=weight*0.453592;
            System.out.println("the new weight is in kgs is:" + newWeight);    
        }
        else if (choice == 2){
            System.out.println("enter the weight in kgs:");
            weight=scanner.nextDouble();
            newWeight=weight*2.20462;

            System.out.println("the new weight in lbs is"+newWeight);
 }
else {
    System.out.println("invalid choice");
}
        scanner.close();
        }        
    }
    