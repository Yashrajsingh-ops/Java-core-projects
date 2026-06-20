import java.util.Scanner;
import java.util.Random;
public class rockpaperscissor {

    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        Random random= new Random();
        String[]choice={"rock","paper","scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

do {
    System.out.print("enter your move (rock,paper,scissor):");
    playerChoice=scanner.nextLine().toLowerCase();

    if(!playerChoice.equals("rock")&&!
       playerChoice.equals("paper")&&!
       playerChoice.equals("scissor")){
        System.out.println("invalid choice. please enter rock, paper, or scissor.");
        continue;
    }
    computerChoice=choice[random.nextInt(3)];
    
    if(playerChoice.equals(computerChoice)){
        System.out.println("its a tie!");
    }
    else if((playerChoice.equals("rock")&&
        computerChoice.equals("scissor"))||
        (playerChoice.equals("paper")&&
        computerChoice.equals("rock"))||
        (playerChoice.equals("scissor")&&
        computerChoice.equals("paper"))){
        System.out.println("you won!");
    }
    else{
        System.out.println("you lost!");
    }
    System.out.print("Play again (yes/no)?");
    playAgain=scanner.nextLine().toLowerCase();
}
while(playAgain.equals("yes"));
System.out.println("thanks for playing!");
scanner.close();
}    
}
