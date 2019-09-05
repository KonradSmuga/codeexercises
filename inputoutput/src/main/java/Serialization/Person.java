package Serialization;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String secondName;
    private int age;
    private long pesel;

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public long getPesel() {
        return pesel;
    }

    public Person(String name, String secondName, int age, long pesel) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
