class FinallyBlock{
    public static void main(String args[]){
        int a = 10;
        int b = 2;
    try{
        int result = a / b;
        System.out.println("Division of two numbers is: "+result);
    }
    catch(ArithmeticException e){
        System.out.println("Exception occured! Arithmetic Exception");
    }
    finally{
        System.out.println("Program executed");
    }
    }
}