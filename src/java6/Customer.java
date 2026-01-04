package java6;

public class Customer {
    public String customerName;
    double salary;
    private int age;

    public void setAge(int customerAge) {
        if (customerAge >= 20 && customerAge <= 65) {
            this.age = customerAge;
            System.out.println("თქვენ შეგიძლიათ აიღოთ სესხი, რადგან თქვენი ასაკია " + this.age);
        } else {
            System.out.println("თქვენ ვერ აიღებთ სესხს");
        }
    }

}
