import java.util.LinkedHashSet;
public class linkedhashset {
    public static void main(String[] args){
        LinkedHashSet<String> tasks = new LinkedHashSet<>();
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