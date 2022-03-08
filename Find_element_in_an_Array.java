import java.util.Scanner;

public class Find_element_in_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        for (int i=0;i<n;i++){
            if(d==arr[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
