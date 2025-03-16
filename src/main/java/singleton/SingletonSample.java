package singleton;

public class SingletonSample {

    public static void main(String[] args) {
        var lazy = SingletonLazy.getInstance();
        lazy.sayHello();

        var eager = SingletonEager.getInstance();
        eager.sayHello();

    }

}
