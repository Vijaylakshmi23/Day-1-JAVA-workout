class CompareString{
    public static void main(String args[]){
        String name1 = "Vijaylakshmi";
        String name2 = "Vijaylakshmi";
        String name3 = new String("Vijaylakshmi");
        System.out.println(name1 == name2); //true because both name1 and name2 are string literals and they refer to the same memory location in the string pool
        System.out.println(name1 == name3); //false beacuse name3 is created using the new keyword and it refers to a different memory location in the heap
    }
}