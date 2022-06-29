import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> ans=getStairPaths(n);
        System.out.println(ans);

    }

    private static ArrayList<String> getStairPaths(int n) {
    if(n == 0){
        ArrayList<String> base =new ArrayList<>();
        base.add("");
        return base;
    }

    ArrayList<String> myans=new ArrayList<>();

    if(n-1 >= 0){
        ArrayList<String> nm1 = getStairPaths(n-1);
        for(String x : nm1){
            myans.add("1"+x);
        }
    }
    if(n - 2 >= 0){
            ArrayList<String> nm2=getStairPaths(n-2);
            for(String x: nm2){
                myans.add("2"+x);
            }
    }
    if(n-3 >= 0){
            ArrayList<String> nm3=getStairPaths(n-3);
            for(String x: nm3){
                myans.add("3"+x);
            }
    }
    return myans;
    }
}
