import java.util.Scanner;

public class DigitsOfANo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long div=n;
        long pow=1;
        while (div!=0){
            div=div/10;
            pow=pow*10;
        }
        pow=pow/10;
        div=n;
        while (pow!=0){
            int d;
            d=(int)(div/pow);
            System.out.println(d);
            div=div%pow;
            pow=pow/10;
        }
    }
}
