package org.javatutorials.Polymorphism;

abstract class calculator{
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
class calculatorDecoPlus extends calculator{
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){

    }

}
class calculatorDecoMinus extends calculator{
    public void sum(){

    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
public class PolyCalculator {
    public static void excute(calculator cal){
        System.out.println("실행결과");
        cal.run();
    }
    public static void main(String[] args){
        /*
        calculator c1 = new calculatorDecoPlus(); // 이것도 다형성이 가능하다.
        calculator c2 = new calculatorDecoMinus(); // 내부적으로는 new 이후에 설정된 클래스의 것
        c1.setOperand(10,20);
        c2.setOperand(10,20);
        //c1.run();
        //c2.run();
        excute(c1); // 자동변환
        excute(c2);

         */
        I obj = new C(); // 어떤 클래스가 어떤 인터페이스를 구현하고 있다면 그 인터페이스로 선언해 쓸 수 있다.
        I obj2 = new F();
        I2 obj3 = new C();
        obj.customPrint("I인데요");
        obj2.customPrint("I입니다");
        obj3.B();
        //obj3.customPrint("불가능"); // I2이므로 I2에서 구현된 것만 사용 가능.
    }
}
interface I{
    public void customPrint(String param);
}
interface I2{
    public String B();
}
class C implements I,I2{ // 클래스 한개로 여러가지 인터페이스 형태로 사용할 수 있는 제한을 줄 수 있다.
    public void customPrint(String param){
        System.out.println("이것은 : " + param);
    }

    public String B() {
        return "BBBBBB";
    }
}
class F implements I{
    public void customPrint(String param){
        System.out.println(param);
    }
}