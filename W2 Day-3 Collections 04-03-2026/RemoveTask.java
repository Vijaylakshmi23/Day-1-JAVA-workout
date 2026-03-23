import java.util.LinkedList;
class RemoveTask{
    public static void main(String args[]){
        LinkedList<String> task = new LinkedList<>();
        task.add("Task 1");
        task.add("Task 2");
        task.add("Task 3");
        task.add("Task 4");
        task.add("Task 5");
        System.out.println(task);
        task.removeLast();
        System.out.println(task);
    }
}