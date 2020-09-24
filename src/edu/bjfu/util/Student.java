package edu.bjfu.util;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 6781205857954750821L;
    // private static final long serialVersionUID = -6849794470L;


    public Student() {
    }

    private int no;
    private int a;
    private int b;

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", a=" + a +
                '}';
    }
    //private int b;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Student(int no, int a) {
        this.no = no;
        this.a = a;
    }
}
