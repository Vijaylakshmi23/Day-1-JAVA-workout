class Student{
    int id;
    String name;
    void display(int a){
        System.out.println(a);
        System.out.println(id);
        System.out.println(name);
    }
}
class Samplecode{
    public static void main(String args[]){
        Student S1 = new Student();
        S1.id = 1;
        S1.name = "Vijaylakshmi";
        S1.display(10);
    }
}