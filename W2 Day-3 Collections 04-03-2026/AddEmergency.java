import java.util.LinkedList;
class AddEmergency{
    public static void main(String args[]){
        LinkedList<String> patient = new LinkedList<>();
        patient.add("Anirudh");
        patient.add("Aditya");
        patient.add("Sam");
        patient.add("Rahul");
        patient.add("Vibha");
        System.out.println(patient);
        patient.addFirst("Emergency Patient - xyz");
        System.out.println(patient);
    }
}