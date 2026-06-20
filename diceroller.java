import java.util.Random;
import java.util.Scanner;

public class diceroller {
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    Random random = new Random();
    int numOfDice;
    int total=0;
    System.out.print("enter the number of times you want to roll the dice");
    numOfDice= scanner.nextInt();

    if(numOfDice >0){
        for(int i=0;i<numOfDice;i++){
            int roll = random.nextInt(6)+1;
            printDie(roll);
            System.out.println("you rolled : "+ roll);
            total+=roll;

        }  
    System.out.println("total:"+total);
}
else{
    System.out.println("no. of dice must be greater than 0");
    }
    scanner.close();
}
static void printDie(int roll){
    String dice1= """
            _________
           |         |
           |    *    |
           |_________|

            """;
String dice2= """
            _________
           |         |
           |*       *|
           |_________|
            """;
String dice3= """
            _________
           | *      *|
           |    *    |
           |_________| 
            """;
String dice4= """
            _________
           | *      *|
           |  *    * |
           |_________|
            """;

        String dice5= """
            _________
           | *      *|
           |    *    |
           |_*______*|
            """;
String dice6= """
            _________
           | *  *   *|
           | *   *  *|
           |_________|
            """;
switch(roll){
    case 1 -> System.out.println(dice1);
    case 2 -> System.out.println(dice2);
    case 3 -> System.out.println(dice3);
    case 4 -> System.out.println(dice4);
    case 5 -> System.out.println(dice5);
    case 6 -> System.out.println(dice6);
}
}  
}
