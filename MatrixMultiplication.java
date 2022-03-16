import java.util.Scanner;

public class MatrixMultiplication {

    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        int [][]arr1=new int[row1][col1];
        inputArray1(arr1,row1,col1);
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int [][]arr2=new int[row2][col2];
        inputArray2(arr2,row2,col2);

        if(col1!=row2){
            System.out.println("Invalid input");
        }else {
            multiplyMatrix(arr1,arr2);


        }

    }

    private static void multiplyMatrix(int[][] arr1, int[][] arr2) {

        int n1 =arr1.length;
        int m1=arr1[0].length;
        int m2=arr2[0].length;
        int[][] ans = new int[n1][m2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {                  //4
                for (int k = 0; k < m1; k++) {
                    ans[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        output(ans);
    }

    private static void inputArray2(int[][] arr2, int row2, int col2) {
        for (int i=0;i<row2;i++){
            for (int j=0;j<col2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
    }

    private static void inputArray1(int[][] arr1, int row1, int col1) {
        for (int i=0;i<row1;i++){
            for (int j=0;j<col1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
    }
    private static void output(int[][] arr) {
        int ro=arr.length;
        int col=arr[0].length;
        for (int i=0;i<ro;i++){
            for (int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
