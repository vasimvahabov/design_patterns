package singleton.lazy;

// Lazy initialization
public class SingletonLazy {

    private static SingletonLazy INSTANCE = null;

    private SingletonLazy() {
        System.out.println("SingletonLazy instance created...");
    }

    public void sayHello() {
        System.out.println("SingletonLazy says hello...");
    }

      /* bad for performance */
//    public static synchronized SingletonLazy getInstance() {
//        return INSTANCE != null ? INSTANCE : (INSTANCE = new SingletonLazy());
//    }

    /* better for performance */
    public static SingletonLazy getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (SingletonLazy.class) {
            System.out.println("SingletonLazy instance created synchronously...");
            return INSTANCE = new SingletonLazy();
        }
    }

}
