class StringReversal{
    public static void main(String args[]){
        String word = "Java";
        for(int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
        System.out.println(); // To move to the next line after printing the reversed string
    }
}