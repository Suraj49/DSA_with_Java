import java.util.Scanner;

public class PrintKpc {
    public static void main(String[] args) throws Exception {

        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        printKPC(str,"");
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String str, String asf) {

        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        char ch=str.charAt(0);
        String roq=str.substring(1);
        String codeforch=codes[ch-'0'];
        for(int t=0;t<codeforch.length();t++){
            char cho=codeforch.charAt(t);
            printKPC(roq,asf+cho);
        }
    }
}
