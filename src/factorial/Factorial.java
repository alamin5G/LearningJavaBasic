package factorial;
import java.util.Scanner;

public class Factorial {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            Factorial fc = new Factorial();
            int result = fc.factorial(n);

            System.out.println("Result = "+result);
        }

        int factorial(int n){
            if(n==0){
                return 1;
            }else if(n==1){
                return 1;
            }else {
                return n*factorial(n-1);
            }
        }
}
