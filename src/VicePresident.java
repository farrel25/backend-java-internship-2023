import data.Manager;

public class VicePresident extends Manager {

    VicePresident() {

    }

    VicePresident(String name) {
        super(name);
        System.out.println("calling parent constructor");
        System.out.println(name);
    }

    @Override
    public void sayHello(String name) {
        //super.sayHello(name);
        System.out.println("Hello " + name +", my name is VP " + this.name);
    }

    void sayHelloParent(String name) {
        super.sayHello(name);
    }
}
