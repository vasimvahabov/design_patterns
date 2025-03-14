package singleton.lazy;

// Lazy initialization
public class SingletonLazy {

    private static SingletonLazy INSTANCE = null;

    private SingletonLazy() { }

    public static synchronized SingletonLazy getInstance() {
        return INSTANCE != null ? INSTANCE : (INSTANCE = new SingletonLazy());
    }

}
