package singleton.one;

public class SingletonLazy {
    private static SingletonLazy instance = null;

    private SingletonLazy() {
        System.out.println("uruchamiam konstruktor Lazy");
    }

    public synchronized static SingletonLazy getInstance() {

        //double locking wzorzec
        if(instance == null){
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
        }
        }
        return instance;
    }

}
