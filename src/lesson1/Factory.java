package lesson1;

public class Factory {
    public int number = 2;
    public String machine = "Tokarniy";
    public String inventory;
    public String quality = " bad";

    public static void main(String[] args) {
        int number = 2;
        String machine, inventory, quality;
        machine = "\ntokarniy";
        quality = " bad";
        inventory = number + machine + quality;
        System.out.println(inventory);
    }


}
