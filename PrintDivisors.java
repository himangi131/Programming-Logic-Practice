import java.util.Scanner;
public class PrintDivisors {
    static void printDivisors(int n){
        
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for(int i=(int)Math.sqrt(n);i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    printDivisors(n);
    scanner.close();
}

    
}
