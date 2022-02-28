import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int digit=0;
        int temp=n;
        while (temp!=0){
            temp = temp / 10;
            digit++;
        }
        k=k%digit;
        if(k<0){
            k+=digit;
        }
        int pow=(int)Math.pow(10,k);//10^k
        int left=n / pow;
        int right=n % pow;
        int mul=(int)Math.pow(10,digit-k);
        int newNo=(right*mul)+left;
        System.out.println(newNo);
    }
}
