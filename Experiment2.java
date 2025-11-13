
import java.util.Scanner;

public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int col = 1; col <= N; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
