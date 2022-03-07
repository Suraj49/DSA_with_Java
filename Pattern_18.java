import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space = 0;
        int star = n;
        for (int i = 1; i <= n; i++) {
            for (int spc = 1; spc <= space; spc++) {
                System.out.print("\t");
            }
            for (int str = 1; str <= star; str++) {
                if ( i > 1 && i <= n / 2 && str > 1 && str < star) {
                    System.out.print("\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            if ( i <= n / 2) {
                star -= 2;
                space++;
            }
            else {
                star += 2;
                space--;
            }
            System.out.println();
        }
    }
}
