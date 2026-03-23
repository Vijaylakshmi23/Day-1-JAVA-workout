import java.util.ArrayList;
class OrderArrayList{
    public static void main(String[] args) {
        ArrayList<String> order = new ArrayList<>();
        order.add("Order101");
        order.add("Order102");
        order.add("Order103");
        order.add("Order104");
        order.add("Order105");
        order.remove("Order102");
        for(String orders : order){
            System.out.println(orders);
        }
    }
}