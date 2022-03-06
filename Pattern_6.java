import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        int Star=(n+1)/2;
        int Space=1;

        for(int i=1;i<=n;i++){
            for(int str=1;str<=Star;str++){
                System.out.print("*\t");
            }
            for(int spc=1;spc<=Space;spc++){
                System.out.print("\t");
            }
            for(int str=1;str<=Star;str++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                Star--;
                Space=Space+2;
            }else {
                Star=Star+1;
                Space=Space-2;

            }
            System.out.println();
        }
    }
}
