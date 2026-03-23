import java.util.LinkedList;
class BusStopQueue{
    public static void main(String args[]){
        LinkedList<String> people = new LinkedList<>();
        people.add("Anirudh");
        people.add("Aditya");
        people.add("Sam");
        people.add("Rahul");
        people.add("Vibha");
        System.out.println(people);
        people.addFirst("Anish");
        System.out.println(people);
        people.addLast("Pooja");
        System.out.println(people);
    }
}