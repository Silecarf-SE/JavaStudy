package org.javatutorials.RefGeneric;

public class GenericTest2 {
    public static void main(String[] args){
        EmployeeInfo2 e = new EmployeeInfo2(3);
        Integer i = new Integer(2);
        Person2 p2 = new Person2(e,i); // < T,S >를 생략함.
        p2.<EmployeeInfo2>printInfo(e); // < > 함수를 사용 하면서 선언 가능. 생략도 가능
        p2.printInfo("HelloWorld");
        p2.printInfo(3);
        p2.printInfo(5.89);

        Person3<EmployeeInfo3> p3 = new Person3<EmployeeInfo3>(new EmployeeInfo3(5));
        //Person3<String> p4 = new Person3<String>(new EmployeeInfo3(2));
        //String 이 info 의 자식이 아니기 때문에 넣지 못하게한다.
    }
}
class Person2 <T, S>{ // 기본 데이터타입은 올 수 없다.
    public T info;
    public S id;
    Person2(T info,S id){
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}
class EmployeeInfo2{
    public int rank;
    EmployeeInfo2(int rank){ this.rank = rank; }
}
abstract class info3{
    public abstract int getLevel();
}
class EmployeeInfo3 extends info3{
    public int rank;
    EmployeeInfo3(int rank){this.rank=rank;}
    public int getLevel(){return this.rank;}
}
class Person3 <T extends info3>{ // T에 오는 형태는 info3 클래스나 클래스를 상속받는 자식들만 T로 오게한다.
                // Extends 로 인터페이스를 사용해도 된다.
                // < > 안에서는 인터페이스든 클래스든 extends 로 사용한다.
    public T info;
    Person3(T info){
        this.info = info;
        info.getLevel(); // info3안에서 getLevel() 이 있기때문에 가능.
    }
}