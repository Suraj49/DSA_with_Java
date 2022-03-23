import java.util.Scanner;

public class TheStateOfWakanda_2 {
   public static Scanner sc = new Scanner(System.in);
    public static void input(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }

    public static void print(int arr[][]){
        int n = arr.length;
        for(int gap = 0 ; gap < n; gap++){
            for(int i = 0, j = gap; j < n; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }


    public static void main(String[] args) {
        int n= sc.nextInt();
        int arr[][]=new int[n][n];
        input(arr);
        print(arr);

    }
}
