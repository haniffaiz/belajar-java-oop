package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Hanif Faiz";
        first = first + " " + "Hidayat";

        System.out.println(first);
        String second = "Hanif Faiz Hidayat";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
