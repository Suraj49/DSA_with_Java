import java.util.Arrays;
import java.util.Scanner;

public class BarChart {
    public static void baarChart(int []a){
        int max=maximum(a);
        for (int h=max;h>0;h--){
            for (int ele:a){
                if(ele>=h){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    private static int maximum(int[] a) {
        int max=-1;
        for (int ele:a){
            max=Math.max(max,ele);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
//        for(int ele:a)
//        {
//            System.out.print(ele+" ");
//        }
//        Arrays.sort(a)
//        int max=a[n-1];
          baarChart(a);

    }
}
