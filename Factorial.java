import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }
    public static int factorial(int n){
        if (n == 1) {
            return 1;
        }

        int temp = factorial(n - 1);
        int fact = n * temp;
        return fact;
    }
}
