import java.util.Scanner;

public class SubarrayProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
           for(int t=i;t<n;t++) {
               for (int j = i; j <= t; j++) {
                   System.out.print(arr[j] + "\t");
               }
               System.out.println();
           }
        }
    }
}
