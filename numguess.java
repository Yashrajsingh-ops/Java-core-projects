import java.util.Random;
import java.util.Scanner;
public class numguess {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner (System.in);

        int guess;
        int attempts = 0 ;
        int randomNumber = random.nextInt(1,11);

        System.out.println("number guessing game");
        System.out.println("Guess a number between 1 to 10");

        do{
            System.out.println("enter a guess");
            guess=scanner.nextInt();
            attempts++;

            if(guess< randomNumber){
                System.out.println("bohot kam hai , zyada soch");

            }
              else if (guess > randomNumber){
                System.out.println("bohot zyada hai , kam soch");

        }
        else{
            System.out.println("correct number was" + randomNumber);
            System.out.println("no.of attempts"+ attempts );
        }
        }while(guess != randomNumber);
        scanner.close();
    }
}
