public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Hanif", "Bogor");
        var person2 = new Person("Haikal", "Cilacap");


        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Haikal");

        person2.sayHello("Hanif");
    }
}
