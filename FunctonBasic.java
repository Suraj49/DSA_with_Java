

public class FunctonBasic {
    public static int sum(int x,int y){
        return x+y;
    }
    public static int sub(int x,int y){
        return x-y;
    }
    public static int mul(int x,int y){
        return x*y;
    }
    public static int div(int x,int y){
        return x/y;
    }



    public static void main(String[] args) {
        int x=20;
        int y=10;
        int ans=sum(x,y);
        System.out.println(ans);
         ans=sub(x,y);
        System.out.println(ans);
         ans=mul(x,y);
        System.out.println(ans);
        ans=div(x,y);
        System.out.println(ans);

    }
}
