import java.util.ArrayList;
class StudentArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> Marks = new ArrayList<>();
        Marks.add(90);
        Marks.add(80);
        Marks.add(70);
        Marks.add(60);
        Marks.add(85);
        System.out.println("Marks of students: " + Marks);  
        int sum = 0;
        for(int mark : Marks){ // Enhanced for each loop to print marks of students
            System.out.println(mark);
            sum = sum + mark;
        } //Reduces time complexity
        //for(int i = 0; i < Marks.size(); i++){
        //    sum = sum + Marks.get(i);;
        //}        
        double average = (double) sum / Marks.size();
        System.out.println("Average marks: " + average);
    }
}