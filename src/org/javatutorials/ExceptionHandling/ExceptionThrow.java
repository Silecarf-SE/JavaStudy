package org.javatutorials.ExceptionHandling;

import java.io.*;

public class ExceptionThrow {
    public static void main(String[] args){
        C c = new C();
        try {
            c.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class B{
    void run() throws IOException{ // B의 예외를 내가 catch하기 싫으면 Throw 할 수 있다.

        BufferedReader bReader=null;
        String input=null;

        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();

        System.out.println(input);
    }
}
class C{ // B -> C -> Throw -> 일반사용자 (엔드유저)
    void run() throws IOException{
        B b= new B();
        b.run();

    }
}
