import java.util.Scanner;

public class CountDigitsInNo {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int d=0;
        while(n!=0){
            n=n/10;
            d++;
        }
        System.out.println(d);
    }
}
