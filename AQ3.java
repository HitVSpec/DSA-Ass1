public class AQ3 {
    public static boolean isPalindrome(String s){
        if(s.length() <= 1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length() - 1)){
            String subString = s.substring(1, s.length() - 1);
            return isPalindrome(subString);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        String s1 = "racecar";
        System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
        String s2 = "gohangasalamiimalasagnahog";
        System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));
    }
}
