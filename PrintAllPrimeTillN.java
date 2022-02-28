import java.util.Scanner;

public class PrintAllPrimeTillN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        for(int n=low;n<high;n++){
            int fact=0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    fact++;
                    break;
                }
            }
            if(fact==0){
                System.out.println(n);
            }
        }
    }
}
