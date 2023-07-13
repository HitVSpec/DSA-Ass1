public class Q6 {
    public static void main(String[] args){
        Box<String> stringBox = new Box<>("YEYEYYSYSYEYS");
        Box<String> box1 = stringBox;
        Box<String> box2 = stringBox;

        box1.setItem("NONONONONON");
        System.out.println(box2.getItem());

        Box<Integer> intBox = new Box<>(96);
        Box<Integer> box3 = intBox;
        Box<Integer> box4 = intBox;
        box3.setItem(69);

        System.out.println(box4.getItem());
        Box<Object> objBoxx = new Box<>();

        objBoxx.setItem("Hello");
        System.out.println(objBoxx.getItem());

        objBoxx.setItem(55);
        System.out.println(objBoxx.getItem());
    }
}
class Box<T>{
    private T item;

    public Box(){}
    public Box(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
    public void setItem(T item){
        this.item = item;
    }
}
