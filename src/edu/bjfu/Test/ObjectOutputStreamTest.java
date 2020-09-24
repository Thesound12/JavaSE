package edu.bjfu.Test;

import edu.bjfu.util.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws Exception{
        Student student = new Student(1,2);
        ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("a"));
        a.writeObject(student);
        a.flush();
        a.close();


    }
}
