import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=n/2||i==n){
                    if(j==1||i+j==n+1||i==j||j==n){
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }

                }else if(i==n/2+1) {
                    if(j==1||j==n||j==n/2+1){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
                else {
                    if(j==1||j==n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
