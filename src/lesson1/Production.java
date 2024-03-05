package lesson1;

public class Production {
    public int quantity;
    public String type;
    public String specialization;

    public static void main(String[] args) {
        String resources, type, specialization;
        type = "Human resources: ";
        int quantity = 2000;
        specialization = " engineer";
        resources = type + quantity + specialization;
        System.out.println(resources);


    }

}
