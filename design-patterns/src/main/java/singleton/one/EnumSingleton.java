package singleton.one;


import java.util.ArrayList;
import java.util.List;

//wymyslil Joshua Bloch, od javy 5 bo pojawily się enumy.
public enum EnumSingleton {

    INSTANCE;

    private EnumSingleton() {

        System.out.println("uruchamiam konstruktor enumSingleton");
    }

    private List<String> stringList = new ArrayList<>();

    public void addName(String name) {
        stringList.add(name);
    }

    public void printName() {
        System.out.println(stringList);
    }
}
