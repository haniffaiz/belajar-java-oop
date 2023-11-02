public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "Hanif";
        person1.address = "Cilacap";
//        person1.country = "Amerika";


        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Haikal");
    }
}
