import java.util.Scanner;
public class TrailingZeroes {

    static int trailingZeroes(int n) {
        int res = 0;
        int powOf5 = 5;
        while(n>= powOf5){
            res += n/powOf5;
            powOf5 *= 5;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to find the trailing zeroes in its factorial: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("The number of trailing zeroes in " + n + "! is: ");
        System.out.println(trailingZeroes(n));
        scanner.close(); 
    }
}
