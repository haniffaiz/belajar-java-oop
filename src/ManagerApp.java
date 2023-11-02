public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Hanif";
        manager.sayHello("Haikal");

        var vp = new VicePresident();
        vp.name = "Haikal";
        vp.sayHello("Hanif");
    }
}
