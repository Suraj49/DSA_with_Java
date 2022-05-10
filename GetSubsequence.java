import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> ans=gss(s);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);    //a
        String ros=str.substring(1);  //bc

        ArrayList<String> recAns= gss(ros);
        ArrayList<String> myAns=new ArrayList<>();
        //not include a
        for (String x:recAns){
            myAns.add(x);
        }
        //include a
        for (String x:recAns){
            myAns.add(ch + x);
        }

        return myAns;
    }
}
