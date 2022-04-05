import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x=sc.nextInt();
        int last=lastIndex(arr,0,x);
        System.out.println(last);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if (idx==arr.length){
            return -1;
        }
        int lastRec=lastIndex(arr,idx+1,x);
        if(lastRec!=-1){
            return lastRec;
        }
        else {
            if (arr[idx]==x){
                return idx;
            }else {
                return -1;
            }
        }
    }
}
