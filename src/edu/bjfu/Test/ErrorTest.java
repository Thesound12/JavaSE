package edu.bjfu.Test;

public class ErrorTest {
    public static void main(String[] args) {
        try {
            throw new Error("Error");
        } catch (Error e) {
            System.out.println("aaa");
        }
        System.out.println("bbb");
    }
}
