public class StringDemo {
    public static void main(String[] args) {
            String s = "Suraj";
            int val = 4;
        	s = val + s;

           System.out.println(s.length());

        //=============String .equals ()============
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
         if(a == c){
            System.out.println("Yes it is equal");
        }
        else{
            System.out.println("No it is not equal");
        }
        if (a == b) {
            System.out.println("Yes it is equal");
        }
        else{
            System.out.println("No it is not equal");
        }
        if(a.equals(c)){
            System.out.println("Yes it is equal");
        }else{
            System.out.println("No it is not equal");
        }
    }
}
