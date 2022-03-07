import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n/2;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int spc=1;spc<=space;spc++){
                System.out.print("\t");
            }
            for(int str=1;str<=star;str++){
                System.out.print("*\t");
            }
           if(i<n/2){
               star=1;
               star=star+i;
               space=n/2;
           }
            if(i==(n/2)){
                star=n;
                space=0;
            }
            if(i>n/2){
                star=n-1;
                space=n/2;
                star=star-i;
                star++;
            }
            System.out.println();
        }
    }
}
