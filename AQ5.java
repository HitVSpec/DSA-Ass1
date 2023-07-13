public class AQ5 {
    public static void hanoi(int n, char s, char a, char d){
        if(n == 1){
            System.out.println("Move disk 1 from " + s + " to " + d);
            return;
        }

        hanoi(n - 1, s, d, a);
        System.out.println("Move disk " + n + " from " + s +" to "+ d);
        hanoi(n - 1, a, s, d);
    }
    public static void main(String[] args){
        int n = 4;
        char s = 'A';
        char a = 'B';
        char d = 'C';

        System.out.println("Solution for " + n + " disks is: ");
        hanoi(n,s,a,d);
    }
}
