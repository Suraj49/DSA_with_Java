import java.util.Scanner;

public class PrintDecreasingRecursion {

    public static void printDecreasing(int n){

        System.out.println(n);
        if(n>1) {
            printDecreasing(n - 1);
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasing(n);
    }
}
