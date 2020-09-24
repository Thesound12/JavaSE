package edu.bjfu.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception {
        ObjectInputStream a = new ObjectInputStream(new FileInputStream("a"));
        Object o = a.readObject();
        System.out.println(o);
        a.close();
    }
}
