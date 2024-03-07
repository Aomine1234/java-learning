package lesson1;

public class Production {
    public int quantity = 2000;
    public String type = "Human resources: ";
    public String specialization = "Engineers";

    public static void main(String[] args) {
        String resources, type, specialization;
        type = "Human resources: ";
        int quantity = 2000;
        specialization = " engineer";
        resources = type + quantity + specialization;
        System.out.println(resources);


    }

}
