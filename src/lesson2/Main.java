package lesson2;

import lesson1.*;

public class Main {

    public static void main(String[] args) {
        Production production = new Production();
        System.out.println("Какая спеиализация у рабочих: " + production.specialization);

        Department department = new Department();
        System.out.println("Название отдела департамента: " + department.name3);

        Factory factory = new Factory();
        System.out.println("Категирия станков на заводе: " + factory.machine);

        Provider provider = new Provider();
        System.out.println("Название поставщика и категория товара: " + provider.provName + " - " + provider.resName);

        Shop shop = new Shop();
        System.out.println("Реализация магазина: " + shop.quantity + " " + "Выручка магазина: " + shop.income);
    }
}
