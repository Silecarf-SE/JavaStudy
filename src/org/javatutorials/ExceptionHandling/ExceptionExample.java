package org.javatutorials.ExceptionHandling;

import java.io.*;

public class ExceptionExample {
    public static void main(String[] args){
        A a = new A();
        /*
        a.z(1,0);
        a.z(10,1);
        a.z(2,1);
         */
        BufferedReader bReader=null;
        String input=null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
            input = bReader.readLine();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(input);



    }
}
class A{
    private int[] arr = new int[3];
    A(){
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        }catch (ArithmeticException e){ // catch도 순서대로 처리되므로 잘 포괄적으로 처리해선 안된다.
            System.out.println("error : " + e.toString());
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally { // 예외여부와 관계없이 실행되는 로직
            System.out.println("무조건 나오는 그런 단어이다.");
            //자바 어플리케이션이 DB에 접속해서 가져오는데 DB는 접속할수있는 한계가 있는데 try 안에서 모두 처리하고
            //예외가 생기던 안생기던 연결해제를 해주어야한다. 그럴때 finally 를 사용한다.
        }
    }
}