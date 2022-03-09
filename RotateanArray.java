import java.util.Scanner;

public class RotateanArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for (int j=0;j<k;j++){
            int tmp=a[a.length-1];
            for (int l=a.length-1;l>0;l--){
                a[l]=a[l-1];
            }
            a[0]=tmp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }

    }
}
