public class Manager {
    String name;

    Manager() {

    }

    Manager(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name +", my name is Manager " + this.name);
    }
}
