package Serialization;

import java.io.*;
import java.lang.reflect.InaccessibleObjectException;

public class SerializationObject {

    public static void main(String[] args) throws IOException {
        Person person = new Person("Mike");
        writeToFile(person);
        readFile();

    }

    public static void writeToFile(Person person) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Person.bin"));
        objectOutputStream.writeObject(person);
    }

    public static void readFile() throws IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.bin"));
    }
}
