public class Q2 {
    public static void main(String[] args){
        String[] colors = {"blue", "green", "purple", "pink"};
        try{
            System.out.println(colors[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }
        try{
            System.out.println(colors[2].toUpperCase());
            colors[2] = null;
            System.out.println(colors[2].toUpperCase());
        }
        catch(NullPointerException e){
            System.out.println("Error");
        }
        for(String color : colors){
            if(color != null){
                System.out.println(color);
            }
        }
    }
}
