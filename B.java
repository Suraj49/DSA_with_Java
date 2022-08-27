import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N and K :");
        int N=sc.nextInt();
        int K=sc.nextInt();
        int p = concatString(N,K);
        System.out.println("Concatenation N K time is: "+p);
        int excellentNo=findExcellentNo(p);
        System.out.println("excellentNo: "+excellentNo);
    }

    private static int findExcellentNo(int p) {
        int no=0;
        while ( p>0 || no>9 ){
            if(p==0){
                p=no;
                no=0;
            }
            no += p % 10;
            p /= 10;
        }
        return no;
    }

    private static int concatString(int n, int k) {
        String s1 = Integer.toString(n);
        String s=s1;
        for (int i=0;i<k-1;i++){
            s += s1 ;
        }
        int c = Integer.parseInt(s);
        return c;
    }
}
