import java.util.ArrayList;
class UpdateSalary{
    public static void main(String args[]){
        ArrayList<Integer> salary = new ArrayList<>();
        salary.add(50000);
        salary.add(46000);
        salary.add(58000);
        salary.add(78000);
        salary.add(94000);
        System.out.println("Salaries of employees are: "+salary);
        salary.set(2, 70000);
        System.out.println("Updated salaries of employees are: "+salary);
    }
}