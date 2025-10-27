class Address{
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
        Student copy = (Student) super.clone(); // deep copy
        copy.address = (Address) address.clone(); // cloning the Address object
        return copy;
    }
}
public class Deepcopy {
    public static void main(String[] args) throws CloneNotSupportedException{
        Address addr = new Address("Vizag", "Andhra Pradesh");
        Student s1 = new Student("Rishi", addr);
        Student s2 = (Student)s1.clone(); // cloning s1 to s2 deep copy
        s2.address.city = "Hyderabad";
        System.out.println("S1 ADDR CITY = "+s1.address.city);
        System.out.println("S2 ADDR CITY = "+s2.address.city);
    }
}
