class Student{
    Student(){
        System.out.println("This is the constructor of the Student class");
    }
    Student(int a, int b){
        System.out.println("The sum of a and b is: " + (a+b));
    }
    Student(float a){
        System.out.println("The value of a is: " + a);
    }
}

class ConstructorOverloading{
    public static void main(String args[]){
        Student S1 = new Student();
        Student S2 = new Student(10, 20);
        Student S3 = new Student(5.5f);
    }
}