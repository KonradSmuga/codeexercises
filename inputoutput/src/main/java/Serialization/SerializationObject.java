package Serialization;

import java.io.*;
import java.lang.reflect.InaccessibleObjectException;
import java.net.URI;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class SerializationObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Person person = new Person("Mike");
//
//        readFile();
        Person person = new Person("Konrad", "Smuga", 28, 901119134);
        serlializableWrite(person);
        serializableRead();
    }
//
//    public static void writeToFile(Person person) throws IOException {
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Person.bin"));
//        objectOutputStream.writeObject(person);
//    }
//
//    public static void readFile() throws IOException, ClassNotFoundException {
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.bin"));
//        Person name = (Person) objectInputStream.readObject();
//        System.out.println(name);
//    }
//}




    public static void serlializableWrite(Person person) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.ser"));
        objectOutputStream.writeObject(person);

    }
    public static Person serializableRead() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.ser"));
        Object o = objectInputStream.readObject();
        Person p = (Person) o;
        return p;
    }
}

