import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int fstar=1;
        int lstar=1;
        int space=n+1;
        for(int i=1;i<=n;i++) {
            int temp=1;
            int num=1;
            for (int fst=1;fst<=fstar;fst++){
                System.out.print(num+"\t");
                temp=num;
                num++;
            }
            for (int spc=1;spc<=space;spc++){
                System.out.print("\t");
            }

            for (int lst = 1; lst <= fstar; lst++) {
                System.out.print(temp + "\t");
                temp--;
                }
            System.out.println();
            space=space-2;
            fstar++;

        }

    }
}
