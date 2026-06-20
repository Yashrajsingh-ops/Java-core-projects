//question array[]
//option array[][]
//declare variables
//welcome mesage
//qiestions (loop)
//get guess form user
//check answer
//display final result

import java.util.Scanner;

public class quizgame {
    public static void main(String[] args) {

        String[] questions = {
            "what are the main functions of the router?",
            "which parts of a computer is considered as a brain?",
            "what year was facebook launched?",
            "who is known as father of computers",
            "what was the first commercial programming language"
        };

        String[][] options = {
            {"1.storing files", "2.hard drive", "3.directing internet traffic", "4.managing passwords"},
            {"1.central processing unit", "2.keyboard", "3.RAM", "4.GPU"},
            {"1.2000", "2.2002", "3.2004", "4.2008"},
            {"1.Steve jobs", "2.Sundar pichai", "3.Alan Turing", "4.Charles Babbage"},
            {"1.COBOL", "2.C", "3.FORTRAN", "4.Assembly Language"}
        };

        int[] answers = {3, 1, 3, 4, 3};
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("********");
        System.out.println("Welcome to my quiz!");
        System.out.println("********");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("******");
                System.out.println("Correct!");
                System.out.println("******");
                score++;
            } else {
                System.out.println("******");
                System.out.println("Wrong!");
                System.out.println("******");
            }
        }

        System.out.println("Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}