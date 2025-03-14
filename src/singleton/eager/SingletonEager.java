package singleton.eager;

// Eager initialization
public class SingletonEager {

    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() { }

    public static synchronized SingletonEager getInstance() {
        return INSTANCE;
    }

}
