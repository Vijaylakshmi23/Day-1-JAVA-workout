import java.util.LinkedList;
class RemoveCustomer{
    public static void main(String args[]){
        LinkedList<String> customer = new LinkedList<>();
        customer.add("Anirudh");
        customer.add("Aditya");
        customer.add("Sam");
        customer.add("Rahul");
        customer.add("Vibha");
        System.out.println(customer);
        customer.removeFirst();
        System.out.println(customer);
    }
}