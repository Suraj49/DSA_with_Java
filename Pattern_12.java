import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+"\t");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
