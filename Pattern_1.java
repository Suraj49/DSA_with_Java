import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        for(int i=0 ; i<n ; i++){
            for(int str=0;str<star;str++){
                System.out.print("*\t");
            }
            for (int spc=0;spc<space;spc++){
                System.out.print("\t");
            }
            star++;
            space--;
            System.out.println();
        }
    }
}
