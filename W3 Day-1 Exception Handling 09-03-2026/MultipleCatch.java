import java.util.Scanner;
class MultipleCatch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter the denominator: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Division of two numbers: "+result);
            int[] arr = {10, 20, 30, 40, 50, 60, 70};
            System.out.print("Enter the array index: ");
            int i = sc.nextInt();
            System.out.println("The array element at index "+i+" is: "+arr[i]);
        }
        catch(ArithmeticException e){
            System.out.println("Exception occured! Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred! Array out of Bounds Exception");
        }
    }
}