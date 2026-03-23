class CompareString3{
    public static void main(String args[]){
        String name1 = "Vijaylakshmi";
        String name2 = new String("VIJAYLAKSHMI");
        String name3 = "ViJaYlAkShMi";
        System.out.println(name1.equalsIgnoreCase(name2)); //true because equalsIgnoreCase() method ignores the case of the characters while comparing the strings
        System.out.println(name1.equalsIgnoreCase(name3)); //true because equalsIgnoreCase() method ignores the case of the characters while comparing the strings
    }
}