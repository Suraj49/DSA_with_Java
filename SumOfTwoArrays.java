import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n11=sc.nextInt();
        int []a=new int[n11];
        for(int i=0;i<n11;i++){
            a[i]=sc.nextInt();
        }
        int n22=sc.nextInt();
        int []b=new int[n22];
        for(int i=0;i<n22;i++){
            b[i]=sc.nextInt();
        }
        int n1 = a.length;
        int n2 = b.length;
        int size = n1 > n2 ? n1 : n2;
        int [] c = new int[size];
        int carry = 0;
        int i = n1-1;
        int j = n2-1;
        int k = size-1;
        while( k >= 0 ){
            int sum = carry;
            if(i >= 0){
                sum += a[i];
            }
            if(j >= 0){
                sum += b[j];
            }
            carry = sum / 10;
            int val = sum % 10;
            c[k] = val;
            i--;
            j--;
            k--;
        }
        if(carry > 0)
            System.out.println(carry);
        for(int p = 0; p<size; p++){
            System.out.println(c[p]);
        }
    }
}
