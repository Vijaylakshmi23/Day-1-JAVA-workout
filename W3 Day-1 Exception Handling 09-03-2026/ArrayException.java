class ArrayException{
    public static void main(String args[]){
        int[] arr = {10, 20, 30, 40, 50};
        try{
            int result = arr[7];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error! Array Index out of Bounds");
        }
        finally{
            System.out.println("Excecution completed");
        }
    }
}