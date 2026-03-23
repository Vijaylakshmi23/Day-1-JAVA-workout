class StringReplace{
    public static void main(String args[]){
        StringBuffer word = new StringBuffer("Java Developer");
        System.out.println(word.replace(0, 4, "Python"));
    }
}