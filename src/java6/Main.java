package java6;

public class Main {
    public static void main(String[] args) {
        ChildTest obj1 = new ChildTest();
        obj1.printLastName();
        obj1.x = 5;
        obj1.printName();
        Subclass objChild = new Subclass();
        objChild.printName();
        objChild.gamravleba(5, 5);

        int[] arr = {3, -5, 20};
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("ელემენტი არ იძებნება");
        } finally {
            System.out.println("ეს ყოველთვის სრულდება");
        }


        Customer objCustomer = new Customer();
        objCustomer.customerName = "Nancy";
        objCustomer.salary = 1495.7;
        objCustomer.setAge(27);


        Dog objDog = new Dog();
        objDog.dogName = "Evelina";
        objDog.dogAge = 12;
        System.out.println("Name: " + objDog.dogName + " " + "Age: " + objDog.dogAge + " " + "Legs: " + objDog.legs);

        Dog objDog2 = new Dog();
        objDog2.dogName = "Emily";
        objDog2.dogAge = 13;
        objDog2.legs = 3;
    }
}




