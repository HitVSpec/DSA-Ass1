public class Q4 {
    public static <E> void printArray(E[] array){
        for(E element : array){
            System.out.println(element);
        }
    }
    public static void main(String [] args){
        Integer[] intA = {1,2,3,4,5};
        String[] strA = {"hello", "world"};
        Double[] doubA = {1.5,1.6,1.8,1.90};
        Character[] charA = {'a', 'b','c'};

        System.out.println();
        printArray(intA);
        System.out.println();
        printArray(strA);
        System.out.println();
        printArray(doubA);
        System.out.println();
        printArray(charA);
    }
}
