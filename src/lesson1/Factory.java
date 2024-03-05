package lesson1;

public class Factory {
    public int number;
    public String machine;
    public String inventory;
    public String quality;

    public static void main(String[] args) {
        int number = 2;
        String machine, inventory, quality;
        machine = "\ntokarniy";
        quality = " bad";
        inventory = number + machine + quality;
        System.out.println(inventory);
    }


}
