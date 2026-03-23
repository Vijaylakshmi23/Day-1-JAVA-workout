import java.util.HashSet;
class DuplicateId{
    public static void main(String args[]){
        HashSet<Integer> Id = new HashSet<>();
        Id.add(101);
        Id.add(102);
        Id.add(103);
        Id.add(101);
        Id.add(104);
        Id.add(102);
        System.out.println(Id);
    }
}