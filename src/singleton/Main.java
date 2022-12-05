package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        System.out.println(singleton == second);
        System.out.println(singleton.hashCode());
        System.out.println(second.hashCode());
    }
}
