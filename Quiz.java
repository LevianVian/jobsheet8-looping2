import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do { 
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.println("Guess the number (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
            } while (!success);
            System.out.println("Do you want to repeat the game? (y/n): ");
            menu = input.nextLine().charAt(0);
            input.nextLine();
        } while (menu == 'y' || menu == 'Y');

    }
}
