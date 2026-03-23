class CompareString2{
    public static void main(String args[]){
        String name1 = "Vijaylakshmi";
        String name2 = "Vijaylakshmi";
        String name3 = new String("Vijaylakshmi");
        System.out.println(name1.equals(name2)); //true because both name1 and name2 have the same content
        System.out.println(name1.equals(name3)); //true because both name1 and name3 have the same content
        System.out.println(name1 == name3); //false because name3 is created using the new keyword and it refers to a different memory location in the heap
        System.out.println(name2.equals(name3)); //true because both name2 and name3 have the same content
    }
}