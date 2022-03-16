import java.util.Scanner;

public class TheStateOfWakanda_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ro=sc.nextInt();
        int col=sc.nextInt();
        int [][]arr=new int[ro][col];
        for(int i=0;i<ro;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int j = 0; j < col; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < ro; i++)
                    System.out.println(arr[i][j]);
            } else {
                for (int i = ro - 1; i >= 0; i--)
                    System.out.println(arr[i][j]);
            }
        }
    }
}
