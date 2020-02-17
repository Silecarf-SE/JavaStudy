package org.javatutorials.OOP;

public class OOPClass2 {
    public static void main(String[] args){
        Calculator c1 = new Calculator(); // c1은 인스턴스, 시스템 내부적으로는 크기를 가지게 됨.
        c1.SetOperand(5,7);
        c1.sum();
        c1.SetRightOperand(10);
        c1.sum();
        System.out.println(c1.PI);
        System.out.println(Calculator.PI);
        Calculator2.sum(3,2);
        Calculator2.avg(3,5);
    }
}

/*
    인스턴스 변수 - non-static field
    클래스 변수 - static field
 */
class Calculator{ // static 클래스 변수, 일반 타입이나 private+일반 타입은 인스턴스 변수
    static double PI = 3.14159; // 클래스 자체의 변수 ( 변형x ), 굳이 인스턴스를 하나 더 만들어서 쓸 필요없이 고정 값을 가져다 쓰면 된다.
    private int left=0,right=0; // 인스턴스에서 수정 가능한 변수
    public void SetOperand(int left,int right){
        SetLeftOperand(left);
        SetRightOperand(right);
    }
    public void SetLeftOperand(int left){
        this.left=left;
    }
    public void SetRightOperand(int right){
        this.right=right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((double)(this.left+this.right)/2);
    }

}
class Calculator2{
    // 인스턴스에서 수정 가능한 변수
    /*
     인스턴스는 static 메소드와 일반 메소드 모두 접근 가능
     클래스는 static 메소드에만 접근 가능
     */
    public static void sum(int left, int right){ // 클래스 메소드
        System.out.println(left+right);
    }
    public static void avg(int left, int right){
        System.out.println((double)(left+right)/2);
    }

}