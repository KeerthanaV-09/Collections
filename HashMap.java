import java.util.HashMap;
public class hashmap {
    public static void main(String[] args){
        HashMap<Integer,String> students = new HashMap<>();
        students.put(101,"rahul");
        students.put(102,"arun");
        students.put(103,"arya");
        System.out.println(students);
        System.out.println("Student 101:" + students.get(101));
        students.put(102,"sneha");
        students.remove(103);
        System.out.println("Updated Map:" + students);
    }
}