package java6;

public class Subclass implements InterfaceTest, Interface2 {
    @Override
    public void printName() {
        System.out.println("My name is Lola");
    }
    public void gamravleba(int a, int b) {
        System.out.println(a * b);
    }
}
