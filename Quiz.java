import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int answer = rand.nextInt(10) + 1;
        System.out.println("Tebak angka antara 1 sampai 10. Ketik 0 untuk keluar.");
        int guess;
        int attempts = 0;

        while (true) {
            System.out.print("Masukkan tebakan: ");
            if (!input.hasNextInt()) {
                input.next();
                System.out.println("Masukkan harus angka!");
                continue;
            }
            guess = input.nextInt();
            attempts++;

            if (guess == 0) {
                System.out.println("Game dihentikan. Jawaban adalah: " + answer);
                break;
            }

            if (guess == answer) {
                System.out.println("Tepat! Jawaban = " + answer + ". Coba " + attempts + " kali.");
                break;
            } else if (guess < answer) {
                System.out.println("Terlalu kecil.");
            } else {
                System.out.println("Terlalu besar.");
            }
        }
        input.close();
    }
}
