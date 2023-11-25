package org.example;

public class Main {
    public static void main(String[] args) {
        JSONToJavaClassConverter prueba = new JSONToJavaClassConverter(System.getProperty("user.dir") +
                "\\src\\main\\java\\org\\example\\prueba.json");

        prueba.isAValidJSON();
    }
}