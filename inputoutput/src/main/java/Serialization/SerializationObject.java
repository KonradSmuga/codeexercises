package Serialization;

import java.io.*;
import java.lang.reflect.InaccessibleObjectException;

public class SerializationObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Mike");

        readFile();

    }

    public static void writeToFile(Person person) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Person.bin"));
        objectOutputStream.writeObject(person);
    }

    public static void readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.bin"));
        Person name = (Person) objectInputStream.readObject();
        System.out.println(name);
    }
}
