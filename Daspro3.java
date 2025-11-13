public class Daspro3 {
    public static void main(String[] args) {
        int n = 1;

        while (n <= 5) {               
            int sum = 0;
            int i = 1;
            while (i <= n) {           
                sum = sum + (i * i);
                i++;
            }
            System.out.println("n = " + n + " -> sum = " + sum);
            n++;
        }
    }
}
