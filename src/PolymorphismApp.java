public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Hanif");
        employee.sayHello("Haikal");

        employee = new Manager("Hanif");
        employee.sayHello("Haikal");

        employee = new VicePresident("Hanif");
        employee.sayHello("Haikal");

        sayHello(new Employee("Hanif"));
        sayHello(new Manager("Hanif"));
        sayHello(new VicePresident("Hanif"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "  + vicePresident.name);
        } else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "  + manager.name);
        } else {
            System.out.println("Hello "  + employee.name);
        }

    }
}
