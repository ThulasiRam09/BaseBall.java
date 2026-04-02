import java.util.*;

public class BaseBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain=true;
        while(playAgain) {
        	boolean isPlaying = true;
            int playerChoice = 0;
            int comChoice=0;
            int score=0;
            System.out.println("⚾⚾⚾⚾⚾⚾⚾⚾⚾⚾⚾⚾⚾⚾");
            System.out.println("Welcome to Baseball Game");
            System.out.println("⚾⚾⚾⚾⚾⚾⚾⚾⚾⚾⚾⚾⚾⚾");
            do {
                try {
                    System.out.println("CHOOSE A NUMBER FROM 1 to 10 : ");
                    playerChoice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Exception Arises." + e);
                    scanner.nextLine();
                    continue;
                }
                if (playerChoice <= 0 || playerChoice > 10) {
                    System.out.println("Enter only numbers between 1 to 10.");
                    continue;
                }
                comChoice = random.nextInt(10) + 1;
                System.out.println("Computer's Number: " + comChoice);

                if (playerChoice == comChoice) {
                    score += playerChoice + comChoice;
                    System.out.println("HIT!🎯Your score is:" + score);
                } else if (playerChoice == (comChoice - 1) || playerChoice == (comChoice + 1)) {
                    System.out.println("You are Out.😥");
                    isPlaying = false;
                } else {
                    score += playerChoice;
                    System.out.println("Your Score is:" + score);
                }
            } while (isPlaying);
            System.out.println("Final score is:" + score);
            scanner.nextLine();

            System.out.print("Do you like to play Again(yes/no): ");
            String playerDecision = scanner.nextLine().toUpperCase();
            playAgain = playerDecision.equals("YES");
        }
        System.out.println("\nThanks for Playing!😛🎉");
        scanner.close();
    }
}
