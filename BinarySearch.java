import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int j=0;
        int k=n-1;
        int mid;
        while (j<=k){
            mid=(j+k)/2;
            if(num>a[mid]){
                j=mid+1;
            }else if (num < a[mid]) {
                k = mid - 1;
            } else {
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
        }
    }
