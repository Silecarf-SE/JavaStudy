package org.javatutorials.OOP;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class OOPClass3 {
    static int i;
    static String a(){
        //i=0;
        String title = "Nothing everywhere";
        return title;
    }
    public static void main(String[] args) {
        //유효 범위, 스코프(지역변수 전역변수 등)
        TestC c1 = new TestC();
        TestC c2 = new TestC(3);
        TestC2 c3 = new TestC2(4); // 부모 클래스의 생성자를 자동 호출 (매개변수가 있는 생성자는 안된다.)
        for (i = 0; i < 5; i++) {
            //a();
            //System.out.println(a());
        }

        c1.sum(3,4);
        c2.sum(4,5);
        c3.sub(7,3);
        System.out.println("\n");
        c2.avg(3,4);
        c3.avg(3,4);

    }
}
class TestC{
    public TestC(){

    }
    public TestC(int a){
        a+=3;
        System.out.println(a);
    }

    int v=0;

    public void sum(int left, int right) { //전역변수는 거의 금기시 한다. 콜바이레퍼런스로 하는게 낫다. 접근우선순위 로컬 > 전역

        System.out.println(left+right);
    }
    public void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}
class testA{
    int a=0;
    public void testA(){ //자바는 기본 생성자를 자동으로 만들어주지 않는다.
        a=3;
    }
}
class TestC2 extends TestC { // 생성자는 상속이 되지 않는다.
    public TestC2(int a){
       super(a); // 하위 클래스의 초기화 코드는 항상 super이후에 온다
        //여기에 초기화~
    }
    public void sub(int left, int right){
        v=3;
        System.out.println(left-right);
    }
    public void avg(int left, int right) {
        System.out.println((double) (left + right) / 2);
    }
}