package lesson2;

import lesson1.Department;
import lesson1.Factory;
import lesson1.Provider;
import lesson1.Shop;

public class Main {

    public static void main(String[] args) {

        int a = 5; // переменная

        String s = "lesson1.Department"; // переменная / объект s
        String s1 = new String("lesson1.Department");

        System.out.println(s);
        System.out.println(s1);

        Department department = new Department();
        System.out.println(department.name3);

        Shop sh = new Shop();

        Provider pv = new Provider();

        Factory fc = new Factory();

    }
}
