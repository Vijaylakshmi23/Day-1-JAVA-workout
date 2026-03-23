import java.util.HashSet;
class UniqueCity{
    public static void main(String args[]){
        HashSet<String> city = new HashSet<>();
        city.add("Bengaluru");
        city.add("Hyderabad");
        city.add("Chennai");
        city.add("Bengaluru");
        city.add("Mysore");
        city.add("Mumbai");
        city.add("Hyderabad");
        city.add("Vijayawada");
        System.out.println(city);
    }
}