package org.javatutorials.ExceptionHandling;

import com.sun.org.apache.xpath.internal.operations.Div;

class DivideException extends RuntimeException{
    int left,right;
    DivideException(){
        super();
    }
    DivideException(String Message){
        super(Message);
    }
    DivideException(String Message,int left, int right){
        super(Message);
        this.left=left;
        this.right=right;
    }
}
public class ExceptionTest {
    public static void main(String[] args){
        calculatorExcDecoPlus c1 = new calculatorExcDecoPlus();
        try {
            c1.setOperand(5, 0);
        }catch (IllegalArgumentException e){ // throw 로 이미 처리된 예외처리기 때문에 더 이상 처리 안됨.
            System.out.println(e.getMessage());
        }
        try {
            c1.divide();
        }catch (DivideException e){
            System.out.println(e.right + " 가 문제입니다.");
        }
    }
}

abstract class calculatorExc {
    int left, right;
    public void setOperand(int left, int right){ // illegal Argument Exception
        if(right==0){ // right 는 무조건 0이안됨.
            throw new IllegalArgumentException("두번째 인자는 0은 안됩니다."); // Exception 발생시키는 법
        }
        this.left = left;
        this.right = right;
    }
    public abstract void sum();
    public abstract void avg();

    public void run() {
        sum();
        avg();
    }
}
class calculatorExcDecoPlus extends calculatorExc {
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){

    }
    public void divide() throws DivideException{ // Arithmetic Exception
        if(this.right==0){ // right가 0이면 divide는 안됨.
            throw new DivideException("0으로 나눌 수 없습니다.",this.left,this.right);
        }
        try { // 예외발생시 catch 안을 실행후 끝까지 실행함.
            System.out.println("Result : ");
            System.out.println(this.left / this.right);
        }catch (Exception e){
            System.out.println("오류 "+  e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("Divide END");
    }

}