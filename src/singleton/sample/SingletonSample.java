package singleton.sample;

import singleton.eager.SingletonEager;
import singleton.lazy.SingletonLazy;

public class SingletonSample {

    public static void main(String[] args) {
        var lazy = SingletonLazy.getInstance();
        lazy.sayHello();

        var eager = SingletonEager.getInstance();
        eager.sayHello();

    }

}
