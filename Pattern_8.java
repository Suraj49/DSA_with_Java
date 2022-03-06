import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int Space=n-1;
        for(int i=1;i<=n;i++){
            for(int spc=1;spc<=Space;spc++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            System.out.println();
            Space--;
        }
    }
}
