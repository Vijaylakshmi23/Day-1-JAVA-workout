import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.TreeSet;
class CompareSize{
    public static void main(String args[]){
        HashSet<Integer> H1 = new HashSet<>();
        H1.add(10);
        H1.add(20);
        H1.add(30);
        H1.add(20);
        H1.add(40);
        H1.add(10);
        System.out.println("Size of HashSet: "+H1.size());
        LinkedHashSet<Integer> L1 = new LinkedHashSet<>();
        L1.add(10);
        L1.add(20);
        L1.add(30);
        L1.add(20);
        L1.add(40);
        L1.add(10);
        System.out.println("Size of LinkedHashSet: "+L1.size());
        TreeSet<Integer> T1 = new TreeSet<>();
        T1.add(10);
        T1.add(20);
        T1.add(30);
        T1.add(20);
        T1.add(40);
        T1.add(10);
        System.out.println("Size of TreeSet: "+T1.size());
    }
}