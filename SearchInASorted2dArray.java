import java.util.Scanner;

public class SearchInASorted2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        int i=0;
        int j=n-1;
        while (j>=0 && i<n){

            int me=arr[i][j];
            if(me==x){
                System.out.println(i);
                System.out.println(j);
                return;

            }else if(me>x){
                j--;
            }else {
                i++;
            }
        }
        System.out.println("Not Found");
    }

}
