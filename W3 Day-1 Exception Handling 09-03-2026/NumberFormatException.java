import java.util.Scanner;
class NumberFormatException{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the String: ");
            String S = sc.nextLine();
            int num = Integer.parseInt(S);
            System.out.println("The String in number format is: "+num);
        }
        catch(NumberFormatException e){
            System.out.println("Exception occurred! Number Format Exception");
        }
    }
}