import java.util.Scanner;

public class FirstIndexAndLastIndex {
    public static int firstIdx(int [] arr, int x){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int fi = -1;
        while(i<=j){
            int mid = (i+j)/2;

            if(arr[mid] == x){
                fi = mid;
                j = mid-1;
            }
            else if(arr[mid] < x){
                i = mid+1;
            }
            else{
                j = mid-1;
            }

        }
        return fi;
    }

    public static int lastIdx(int [] arr, int x){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int li = -1;
        while(i<=j){
            int mid = (i+j)/2;

            if(arr[mid] == x){
                li = mid;
                i = mid+1;
            }
            else if(arr[mid] < x){
                i = mid+1;
            }
            else{
                j = mid-1;
            }

        }
        return li;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int fi = firstIdx(a,x);
        int li = lastIdx(a,x);
        System.out.println(fi);
        System.out.println(li);

    }
}
