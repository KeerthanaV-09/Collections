import java.util.ArrayList;
public class ArrayListC {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(); //ArrayList
        num.add(10); //adding elements into the array list
        System.out.println(num.get(0)); //printing element at particular index
        num.remove(0);
        System.out.println(num);
    }
}