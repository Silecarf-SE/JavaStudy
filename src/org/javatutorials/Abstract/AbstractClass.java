package org.javatutorials.Abstract;


abstract class Ab{
    public abstract int b(); //
    public void d(){ // 본체가 있는 메소드는 abstract 이름을 가질 수 없다.
        System.out.println("world");
    }

}
class B extends Ab{ // 추상클래스 Ab를 상속함
    public int b() { // 추상 메소드를 구현해야 규칙에 맞는다.
        System.out.println("B!!");
        return 0;
    }
}

public class AbstractClass {
    public static void main(String[] args){
        //A obj = new A();
        B obj = new B();
        obj.d();
        obj.b();
    }
}
