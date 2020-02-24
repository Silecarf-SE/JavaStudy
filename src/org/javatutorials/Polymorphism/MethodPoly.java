package org.javatutorials.Polymorphism;


public class MethodPoly {
    public static void main(String[] args){ // 같은 동작 방법의 키라 하더라도 각자 다른 실행의 목적을 가진다.
                                            // 동일한 조작 바업ㅂ으로 동작시키지만 동작 방법은 다른것을 의미한다.

        O o1 = new O();
        o1.a("이라는");
        o1.a(3);

        O obj= new B(); // A 는 B를 상속 받기 때문에 가능. (B>O), 실제로 B지만 O처럼 동작하게 한다.
        //B obj2 = new O();
        obj.a(3);
        obj.a("문자인데"); // O의 행세를 하고 있지만 B의 함수로 실행된다.
        //obj.vector(2,3); //실행되지 않는다. O안에 있지 않기 때문.
    }
}
class O{
    public void a(int param){ // 다형성의 기본은 오버로딩이다.
        System.out.println("숫자");
    }
    public void a(String param){ // 오버로딩
        System.out.println("문자");
    }
}
class B extends O{
    public void a(String param){ // 오버라이드된 함수
        System.out.println("문자 출력");
    }
    public void vector(int a,int b){
        System.out.println(a + " , " + b);
    }
}
