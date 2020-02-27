package org.javatutorials.RefGeneric;

public class GenericTest { // 왜 Generic 을 사용하는가(가장 늦게 사용도입된 기능)
    public static void main(String[] args){

        //Person<String> p1=new Person<String>();
        //Person<StringBuilder> p2 = new Person<StringBuilder>();
        /*
        Person p1 = new Person("부장"); // 문제지만 컴파일은 문제없음. 변수의 데이터 타입을 지정할 때 매우 중요시 여겨야 함.
        EmployeeInfo ei = (EmployeeInfo)p1.info; // 똑같이 문제지만 컴파일엔 문제없음.
        System.out.println(ei.rank); //Type safety 가 보장이 안됨.

         */
        Integer id = new Integer(1);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(5),id);
        //기본 데이터 타입은 wrapper 클래스가 있다.
        System.out.println(p1.info.rank+" , "+p1.id.intValue());
    }
}
/*
class Person{
    //public T info; // info 의 data type (명시적으로 수정하지 않고 있다가 클래스를 인스턴스화할 때 < > 안에 구체적인 데이터 타입을 언급하여 선언시키는 방법
    public Object info;
    Person(Object info){ this.info = info; }
}
 */
class Person <T, S>{ // 기본 데이터타입은 올 수 없다.
    public T info;
    public S id;
    Person(T info,S id){
        this.info = info;
        this.id = id;
    }
}
class StudentInfo{
public int grade;
        StudentInfo(int grade){ this.grade = grade; }
        }
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class StudentPerson{
    //public StudentInfo info;
    public StudentInfo info;
    StudentPerson(StudentInfo info){ this.info = info; }
}
class EmployeePerson{
    //public EmployeeInfo info;
    public EmployeeInfo info;
    EmployeePerson(EmployeeInfo info){ this.info = info; }
}