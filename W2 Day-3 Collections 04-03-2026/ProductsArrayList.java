import java.util.ArrayList;
class ProductsArrayList{
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Headphones");
        for(String Product : products){
            System.out.println(Product);
        }
    }
}