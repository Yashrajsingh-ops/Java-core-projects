import java.util.Scanner;

public class bankingprogramme {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0.0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println("**************");
            System.out.println("BANKING PROGRAMME");
            System.out.println("**************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("**************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("**************");
        System.out.println("Thank you, have a nice day!");
        System.out.println("**************");

        scanner.close();
    }

    // Show Balance
    static void showBalance(double balance) {
        System.out.println("Your current balance is: " + balance);
    }

    // Deposit Method
    static double deposit() {
        double amount;

        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }

        return amount;
    }

    // Withdraw Method
    static double withdraw(double balance) {
        double amount;

        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT BALANCE");
            return 0;
        } 
        else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } 
        else {
            return amount;
        }
    }
}
