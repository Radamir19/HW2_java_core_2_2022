package org.example;

public class MyArraySizeException extends Throwable {

    public  MyArraySizeException() {
        System.out.println("Размер массива должен быть 4х4. Создайте массив заново");
    }
}
