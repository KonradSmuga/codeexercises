package singleton.one;

public class SingletonRunner {

    public static void main(String[] args) {

        //
        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonEager singletonEager1 = SingletonEager.getInstance();


        singletonEager.addName("Konrad");
        singletonEager.printName();

        func2();
    }

    //
    public static void func2() {
        SingletonEager instance = SingletonEager.getInstance();
        instance.addName("Teyha");
        instance.printName();

        //
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        singleton.addName("Konrad");



    }
}
