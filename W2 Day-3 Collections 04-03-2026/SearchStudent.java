import java.util.ArrayList;
class SearchStudent{
    public static void main(String args[]){
        ArrayList<String> student = new ArrayList<>();
        student.add("Anirudh");
        student.add("Aditya");
        student.add("Sam");
        student.add("Rahul");
        student.add("Vibha");
        System.out.println(student.contains("Sameena"));
    }
}