public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Hanif");
        manager.sayHello("Haikal");

        var vp = new VicePresident("Haikal");
        vp.sayHello("Hanif");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
