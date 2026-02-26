class Bank{
    private int balance;
    public int getbalance(){
        return balance;
    }
    public void setbalance(int balance){
        this.balance = balance;
    }
}
class Encapsulation{
    public static void main(String args[]){
        Bank B1 = new Bank();
        B1.setbalance(100);
        System.out.println("The balance in the bank account is: " + B1.getbalance());
        Bank B2 = new Bank();
        B2.setbalance(1000);
        System.out.println("The balance in the bank account is: " + B2.getbalance());
    }
}