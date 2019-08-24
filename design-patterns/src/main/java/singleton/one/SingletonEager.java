package singleton.one;


import java.util.ArrayList;
import java.util.List;

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();
    private List<String> names = new ArrayList<>();
    private SingletonEager(){
        System.out.println("uruchamiam konstruktor singletonu");
    }

    public static SingletonEager getInstance(){
        return instance;

    }

    public void addName(String name){
        names.add(name);
    }

    public void printName(){
        System.out.println(names);
    }
}
