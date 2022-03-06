import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n;
        int space=0;
        for(int i=0;i<n;i++){
            for(int spc=0;spc<space;spc++){
                System.out.print("\t");
            }
            for(int str=0;str<star;str++){
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.println();
        }
    }
}
