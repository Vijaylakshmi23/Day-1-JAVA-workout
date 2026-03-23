import java.util.Scanner;
class Vowels{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        String S = sc.nextLine();
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U'){
            count++;
            }
        }
        System.out.println("Number of vowels in the string: "+count);
    }
}