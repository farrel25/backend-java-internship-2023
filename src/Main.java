import data.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        Person person = new Person();
//        person.address = "address";
//        person.name = "name";
//        System.out.println(person.name);
//
//
//
//        Person human = new Person("Farrel");
//        System.out.println(human.name);
//
//        human.name = "Putri";
//        System.out.println(human.name);
//
//        System.out.println(human.country);
//        //human.name = "farrel";
//        human.address = "Bandung";
//
//        System.out.println(human.country);
//        human.sayHello("Putri");
//
//
//
//        Person putri = new Person("Putri", "Bandung");
//        System.out.println(putri.name);
//        System.out.println(putri.address);
//
//        putri.sayHello("Farrel", "Bandung");
//
//        data.Manager manager = new data.Manager();
//        manager.name = "Farrel";
//        manager.sayHello("Putri");
//
//        VicePresident vicePresident = new VicePresident();
//        vicePresident.name = "Putri";
//        vicePresident.sayHello("Farrel");
//        vicePresident.sayHelloParent("Farrel");

        //VicePresident putra = new VicePresident("Putra");



//        Integer numberNonPrimitive = 1;
//        int numberPrimitive = 1;
//
//        long l = numberNonPrimitive.longValue();
//        float v = numberNonPrimitive.floatValue();
//
//        float numberPrimitive1 = (float) numberPrimitive;

        Manager manager = new Manager();


        Product product = new Product();
//        product.name = "asd";
//        System.out.println(product.getName());
//        product.setName("Laptop");
        product.setPrice(123);


//        Location location = new Location();
        City city = new City();


//        Person person = new Person("Putri");
//        person.sayHello("Farel");
        Person.sayHello("Farrel");
    }
}