package com.javarush.task.task38.task3802;

/* 
Проверяемые исключения (checked exception)
*/

import java.io.FileReader;

public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        FileReader reader = new FileReader("a:\\exception.file");
    }

    public static void main(String[] args) {
    }
}