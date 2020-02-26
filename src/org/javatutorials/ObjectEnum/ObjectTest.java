package org.javatutorials.ObjectEnum;

public class ObjectTest {
    public static void main(String[] args){
        CalculatorObj c1 = new CalculatorObj();
        c1.SetOperand(10,20);
        System.out.println(c1); // org.javatutorials.ObjectEnum.CalculatorObj@4554617c
                                //                  어디의 어떤 클래스 ,    @   인스턴스 번호
        System.out.println(c1.toString()); // 위와 같은 결과. (c1 = c1.toString() 암시적으로 되어있음)
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

}