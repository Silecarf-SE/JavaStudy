package org.javatutorials.RefGeneric;

class A{
    public int id;
    A(int id){
        this.id=id;
    }

}
public class ReferencesTest {
    public static void runValue(){
        int a=1;
        int b=a; // 복제
        b=2;
        System.out.println("runValue : "+a);
    }
    static void value2(int b){
        b=2;
    }
    static void runValue2(){
        int a=1;
        value2(a);
        System.out.println("runValue2 : "+a);
    }
    public static void runReference(){
        A a = new A(1);
        A b = a; // 참조
        b.id=2; // new A 로 만들어진 인스턴스를 참조한 것이기 때문에 2로 바뀐다. (a 와 b 모두)
        System.out.println("runReference a : "+ a.id);
        a.id=3;
        System.out.println("runReference b : "+ b.id);
    }
    static void reference2(A b){ // 참조를 통한 전달
        b.id=2;
    }
    static void runReference2(){
        A a= new A(1);
        reference2(a);
        System.out.println("runReference2 a : "+a.id);
    }

    public static void main(String[] args){
        // = 이라는 것은 복제와 참조의 역할 모두 할 수 있다. 기본형 데이터 타입은 복제, new 를 이용하여 만드는 자료는 참조 자료형, 참조 데이터형 이라 하여 참조를 기본으로 한다.
        runValue();
        runReference();
        runReference2();
    }
}
