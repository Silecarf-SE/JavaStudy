package org.javatutorials.ExceptionHandling;

public class ExceptionTest {
    public static void main(String[] args){
        calculatorExcDecoPlus c1 = new calculatorExcDecoPlus();
        c1.setOperand(5,0);
        c1.divide();
    }
}

abstract class calculatorExc {
    int left, right;
    public void setOperand(int left, int right){
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
    public void divide(){
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
class calculatorExcDecoMinus extends calculatorExc {
    public void sum(){

    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}