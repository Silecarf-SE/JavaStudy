package org.javatutorials.ExceptionHandling;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.io.*;

public class ExceptionHandling {
    public static void main(String[] args){

    }
}

// throwable 밑에는 exception, error 두종류가 있다.(error 는 우리가 처리할수있는게 없을때(기반 시스템의 문제다.))

class E{
    void throwArithmeticException(){
        throw new ArithmeticException(); // RuntimeException 밑의 ArithmeticException (unchecked 예외처리)
    }
    void throwIOException(){
        try {
            throw new IOException(); // IOException (checked 예외처리) -> 반드시 try catch 를 해야한다.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException{
        throw new IOException();
    }
}