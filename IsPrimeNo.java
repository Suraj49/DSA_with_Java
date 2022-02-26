import java.util.Scanner;

public class IsPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalnNo;
        System.out.println("Enter the Total no of Test case:");
        totalnNo = sc.nextInt();
        for (int j = 0; j < totalnNo; j++) {
            int num;
            System.out.println("Enter the No that you want to check:");
            int flag = 0;
            num = sc.nextInt();
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    flag = flag + 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(num + " Is Not Prime Number");
            } else {
                System.out.println(num + " Is Prime Number");
            }
        }
    }
}
