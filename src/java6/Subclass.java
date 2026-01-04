package java6;

public class Subclass implements InterfaceTest, Interface2 {
    @Override
    public void printName() {
        System.out.println("My name is Lola");
    }

    public void gamravleba(int i, int i1) {
        System.out.println(i * i1);
    }

}
