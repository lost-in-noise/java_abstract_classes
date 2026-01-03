package java6;

public class Main {
    public static void main(String[] args) {
        ChildTest obj1 = new ChildTest();
        obj1.printLastName();
        obj1.x = 5;
        obj1.printName();
        Subclass objChild = new Subclass();
        objChild.printName();
        objChild.gamravleba(5,5);
    }
}




