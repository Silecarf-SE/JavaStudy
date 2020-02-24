package org.javatutorials.Polymorphism;

public class MethodPoly2 {
    public static void main(String[] args){
        A obj = new D2();
        A obj2 = new D();
        //둘다 A의 행세를 하지만 함수는 new로 선언된 형태의 함수에서 가져온다.
    }
}
class A{
    int a=0;
    public void a(int param){ // 다형성의 기본은 오버로딩이다.
        System.out.println("숫자");
    }
    public void a(String param){ // 오버로딩
        System.out.println("문자");
    }
}
class D2 extends A{
    int a=3;
    public void a(String param){ // 오버라이드된 함수
        System.out.println("문자2 출력");
    }
    public void vector(int a,int b){
        System.out.println(a + " , " + b);
    }
}
class D extends A{
    int a=5;
    public void a(String param){ // 오버라이드된 함수
        System.out.println("문자 출력");
    }
    public void vector(int a,int b){
        System.out.println(a + " , " + b);
    }
}