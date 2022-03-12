import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int []arrnew=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++){
            temp= arr[i];
            arrnew[temp]=i;
        }
        for(int i=0;i<n;i++){
            System.out.print(arrnew[i]+"\t");
        }
    }
}
