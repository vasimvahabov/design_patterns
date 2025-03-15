package singleton.eager;

import java.io.Serial;
import java.io.Serializable;

// Eager initialization
public class SingletonEager implements Serializable {

    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() { }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("SingletonEager says hello...");
    }

    @Serial
    protected Object readResolve() {
        return getInstance();
    }

}
