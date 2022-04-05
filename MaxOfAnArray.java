import java.util.Scanner;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=maxOfArray(arr,0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if (arr.length-1==idx){
            return arr[idx];
        }
        int recAns =maxOfArray(arr,idx+1);
        int maxAns=arr[idx];
        if(maxAns>recAns){
            return maxAns;
        }
        else {
            return recAns;
        }
    }

}
