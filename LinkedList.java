import java.util.LinkedList;
public class LinkedListC {
    public static void main(String[] args){
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("learn java");
        tasks.add("learn SQL");
        tasks.add("learn React");
        tasks.addFirst("Start Training");
        tasks.addLast("Build Project");
        System.out.println(tasks);
        tasks.removeFirst();
        tasks.removeLast();
        System.out.println("After Removal:" + tasks);
    }
}