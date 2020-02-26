package org.javatutorials.ObjectEnum;

import java.util.Objects;

public class ObjectTest {
    public static void main(String[] args){
        CalculatorObj c1 = new CalculatorObj();
        c1.SetOperand(10,20);
        System.out.println(c1); // org.javatutorials.ObjectEnum.CalculatorObj@4554617c
                                //                  어디의 어떤 클래스 ,    @   인스턴스 번호
        System.out.println(c1.toString()); // 위와 같은 결과. (c1 = c1.toString() 암시적으로 되어있음)

        student s1 = new student("steve");
        //System.out.println(s1==s2);
        //System.out.println(s1.equals(s2));

        s1.test(); // 같은 패키지라 가능.
        try {
            student s2 = (student)s1.clone();
            System.out.println(s1==s2);
            System.out.println(s1.equals(s2));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class obj extends Object{ // 암시적으로 붙어있는 것. Object 는 클래스의 기본형.(java.lang.Object)
                            // clone(), equals(Object), finalize(), toString(); 기본 오브젝트의 메쏘드들

}
class CalculatorObj{ // extends Object 이기 때문에. 위의 기본 메쏘드를 가지고 있다.
    static double PI = 3.14159;
    private int left=0,right=0;
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

    public String toString(){ // toString overriding 일종의 super toString
        //가급적 다시 만드는게 권장됨.
        return "left : " + this.left + " right : " + this.right;
    }

}
class Human{
    protected String test(){
        return "test";
    }
}
class student extends Human implements Cloneable{ // Cloneable 인터페이스를 사용하여 복제 가능하게 만듬.
                                    // Protected Object.clone() ,
    String name;
    student(String name){
        this.name = name;
    }

    public boolean equals(Object o) { // 오버라이딩
        student s = (student) o;
        if (o == null) return false;
        return this.name==s.name;
    }

    protected void finalize() throws Throwable { // 객체가 소멸될때 호출되기로 한 메소드. 직접 사용하기 매우 위험한 메소드이다.
        super.finalize();
    }
    public Object clone() throws CloneNotSupportedException{ // 클론은 이렇게 사용해야한다.
        return super.clone();
    }
    //인스턴스를 만드는것은 내부적으로 메모리를 이용하는 것. 제한된 메모리이기 때문에 소멸된 인스턴스는 메모리에서도 제거해줘야한다.
    //즉 메모리를 비워주는 행위 = 가비지 컬렉션 이다.
}