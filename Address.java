public class Address {
    String city;
    String state;
    Address(String city, String state){
        this.city = city;
        this.state = state;
    }
}
class Student implements Cloneable{
    String name;
    Address address;
    Student(String name, Address address){
        this.name = name;
        this.address = address;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone(); // shallow copy
    }
}
class ShallowCopyDemo{
    public static void main(String[] args) throws CloneNotSupportedException{
        Address addr = new Address("Vizag", "Andhra Pradesh");
        Student s1 = new Student("Rishi", addr);
        Student s2 = (Student)s1.clone(); // cloning s1 to s2 shallow copy

        s2.address.city = "Hyderabad";
        System.out.println("S1 ADDR = "+s1.address.city);
        System.out.println("S2 ADDR = "+s2.address.city);

        s1.name = "Anurag";
        System.out.println("S1 NAME = "+s1.name);
        System.out.println("S2 NAME = "+s2.name);
    }
}