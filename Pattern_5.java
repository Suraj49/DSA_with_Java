import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n/2;

        for(int row=1;row<=n;row++){
            for(int spc=0;spc<space;spc++){
                System.out.print("\t");
            }
            for (int str=0;str<star;str++){
                System.out.print("*\t");
            }
            if (row<=n/2){
                star=star+2;
                space=space-1;
            }else {
                star=star-2;
                space=space+1;
            }
            System.out.println();

        }

    }
}
