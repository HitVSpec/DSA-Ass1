import java.util.*;
public class Q5 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        Integer[] arr = {1, 2, 3,4,5,9,4,7,2,4};
        Integer item = x.nextInt();
        int count = count(arr, item);
        System.out.println("Count: " + count);
    }
    public static<T> int count(T[] array, T item){
        int count = 0;
        for(T element: array){
            if(element.equals(item)){
                count++;
            }
        }
        return count;
    }
}
