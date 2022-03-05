import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);
        int n=cs.nextInt();
       for(int i=2;i*i<=n;i++){
           while (n%i==0){
               n=n/i;
               System.out.print(i + " ");
           }
        }
       if(n!=1){
           System.out.print(n + " ");
       }
    }
}
