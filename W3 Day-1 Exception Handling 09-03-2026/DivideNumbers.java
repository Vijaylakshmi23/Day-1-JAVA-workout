import java .util.Scanner;
class DivideNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter the denominator: ");
            int b = sc.nextInt();
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception! Cannot divide by zero");
        }
        finally{
            System.out.println("Execution completed");
        }
    }
}