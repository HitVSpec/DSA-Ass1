public class Q10 {
    public static void main(String[] args){
        String s = "pots&pans";
        System.out.print("Reversed String of " + s + " is " + rev(s));
    }
    public static String rev(String s){
        if(s.isEmpty()){
            return s;
        }
        else{
            char lc = s.charAt(s.length() - 1);
            String rc = s.substring(0 , s.length() - 1);
            return lc + rev(rc);
        }
    }
}
 