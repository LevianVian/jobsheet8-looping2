public class Daspro1 {
    public static void main(String[] args) {
        int r = 10;      
        int i = 1;       

        while (i <= r) {           
            int j = 1;
            while (j <= i) {       
                System.out.print("*");
                j++;
            }
            System.out.println();  
            i++;                   
        }
    }
}
