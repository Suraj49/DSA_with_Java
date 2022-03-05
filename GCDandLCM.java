import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1<n2){
            int rem=n2;
            while(rem!=0){
                int temp;
                temp=n1%rem;
                n1=rem;
                rem=temp;
            }
            System.out.println(n1);
        }
        if(n1>n2){
            int rem=n1;
            while(rem!=0){
                int temp;
                temp=n2%rem;
                n2=rem;
                rem=temp;
            }
            System.out.println(n2);
        }
    }
}
