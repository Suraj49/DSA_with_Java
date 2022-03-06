import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Star=1;
        int Space=n-1;
        for(int i=1;i<=n;i++){
            for(int spc=1;spc<=Space;spc++) {
                System.out.print("\t");
            }
            for(int str=1;str<=Star;str++){
                System.out.print("*\t");
            }
            Star++;
            Space--;
            System.out.println();
        }
    }
}
