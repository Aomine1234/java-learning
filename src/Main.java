public class Main {

    public static void main(String[] args) {

        int a = 5; // переменная

        String s = "Department"; // переменная / объект s
        String s1 = new String("Department");

        System.out.println(s);
        System.out.println(s1);

        Department department = new Department();
        System.out.println(department.name3);

        Shop sh = new Shop();

        Provider pv = new Provider();

        Factory fc = new Factory();

    }
}
