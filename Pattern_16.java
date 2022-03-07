import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=(n*2)-3;
        for(int i=1;i<=n;i++) {
            int num=1;
            for (int fst=1;fst<=star;fst++){
                System.out.print(num+"\t");
                num++;
            }
            for (int spc=1;spc<=space;spc++){
                System.out.print("\t");
            }
            if ( i == n){
                star--;
                num--;
            }
            for (int lst = 1; lst <= star; lst++) {
                num--;
                System.out.print(num + "\t");
            }
            System.out.println();
            space=space-2;
            star++;
        }
    }
}
