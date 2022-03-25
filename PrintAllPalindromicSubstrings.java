import java.util.Scanner;

public class PrintAllPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

    public static void solution(String str) {
        int n=str.length();
        for(int st=0;st<n;st++){
            for (int end=st;end<n;end++){
                String ss=str.substring(st,end+1);
                if(islPalindromic(ss)){
                    System.out.println(ss);
                }
            }
        }
    }
    public static boolean islPalindromic(String s){
        int i=0;
        int j=s.length()-1;
        while (i<=j){
            char lstr=s.charAt(i);
            char rstr=s.charAt(j);
            if(lstr!=rstr){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
