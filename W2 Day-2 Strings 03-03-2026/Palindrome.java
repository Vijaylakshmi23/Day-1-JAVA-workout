class Palindrome{
    public static void main(String args[]){
        StringBuilder word = new StringBuilder("Teacher");
        String reversed = word.reverse();
        if(reversed.equals(word)){
            System.out.println("The word is a Palindrome");
        }
        else{
            System.out.println("The word is not a Palindrome");
        }
    }
}