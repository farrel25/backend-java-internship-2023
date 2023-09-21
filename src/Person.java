public class Person {

    public String name;

    public String address;

    final String country = "Indonesia";

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void sayHello(String name) {
        System.out.println("Hello" + name +", my name is " + this.getName());
    }

    void sayHello(String name, String address) {
        System.out.println("name: " + name + ", address: " + address);
    }

    String getName() {
        return this.name;
    }
}
