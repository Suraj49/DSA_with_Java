import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if(marks>90){
            System.out.println("Excellent");
        }else if(marks>80&&marks<=90){
            System.out.println("Good");
        }else if(marks>70&&marks<=80){
            System.out.println("Fair");
        }else if(marks>60&&marks<=70){
            System.out.println("Meets Expectations");
        }else if(marks<=60){
            System.out.println("below par");
        }
    }
}
