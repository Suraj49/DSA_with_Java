import java.util.Scanner;

public class RotateBy90Degree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int j=0;j<n;j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
