import java.util.Scanner;

public class ToggleCase {

    public static String toggleCase(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr>='A' && curr<='Z'){
              char t=(char)(curr-'A'+'a');
              sb.append(t);
            }
            if(curr>='a' && curr<='z') {
                char t=(char)(curr-'a'+'A');
                sb.append(t);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }
}
