package data;

public class Manager {

    protected String name;

    public Manager() {

    }

    protected Manager(String name) {
        this.name = name;
    }

    protected void sayHello(String name) {
        System.out.println("Hello " + name +", my name is data.Manager " + this.name);
    }
}
