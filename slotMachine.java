//declare variable
//Display welcome message
//play if balance>0
//enter the bet amount
//verify if the bet amount>balance
//verify if bet amount>0
//subtract bet from amount
//spin row
//??print row
//get payout
//ask to play again
//display exit message
import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    static Random random = new Random();
    
    public static void main (String[]args){
        Scanner scanner= new Scanner(System.in);

int balance=100;
int bet;
int payout;
String[]row;
String playAgain;

System.out.println("***********");
System.out.println("Welcome to java slot machine!");
System.out.println("symbols:🍒,🍉,🍋,🔔,⭐");
System.out.println("***********");

while(balance>0){
    System.out.println("current balance :$ "+balance);
    System.out.println("place your bet amount:");
    bet=scanner.nextInt();
    scanner.nextLine();

    if(bet>balance){
        System.out.println("insufficient funds");
        continue;
    }
    else if(bet<=0){
        System.out.println("bet must be greater than zero!");
        continue;
    }
    else{
        balance-=bet;
}
System.out.println("spinning.......");
row=spinRow();
printRow(row);
payout=getPayout(row,bet);

if(payout>0){
    System.out.println("you won$"+payout);
    balance+=payout;
}
else{
    System.out.println("sorry you lost the game");
    }
    System.out.println("do you want to play the game again? (yes/no)");
    playAgain=scanner.nextLine().toUpperCase();
    if(!playAgain.equals("yes"))
        break;
}
System.out.println("game over! your final balance is $"+balance);
scanner.close();
    }
    
    public static String[] spinRow(){
    String[]symbols={"🍒","🍉","🍋","🔔","⭐"};
    String[]row=new String[3];
    for(int i=0;i<3;i++){
        row[i]=symbols[random.nextInt(symbols.length)];
    }
    return row;

}
static void printRow (String[]row){
    System.out.println("-------------");
    System.out.println(String.join("|",row));
    System.out.println("-------------");
}
static int getPayout(String[]row,int bet){
    if(row[0].equals(row[1])&&row[1].equals(row[2])){
        switch(row[0]){
            case "🍒":
                return bet*10;
            case "🍉":
                return bet*20;
            case "🍋":
                return bet*30;
            case "🔔":
                return bet*40;
            case "⭐":
                return bet*50;
            default:
                return 0;
        }
    }
    else if(row[0].equals(row[1])||row[1].equals(row[2])||row[0].equals(row[2])){
        return bet*2;
    }
    else{
        return 0;
    }
}
}


