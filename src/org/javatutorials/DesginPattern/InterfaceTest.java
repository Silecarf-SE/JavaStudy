package org.javatutorials.DesginPattern;

public class InterfaceTest { // 협업을 위한 더미 클래스를 만드는데 매우 효과적이다.
    //인터페이스는 협업하는 개발자간의 약속으로 만들어두고 더미클래스를 만들면 효과적으로 기능을 인계할 수 있다.
}
interface Calculatorable{
    public void setOperand(int left, int right,int middle);
    public int sum(); // 인터페이스는 abstract 와 다르게 안을 구현할 수 없다.
}
interface SubCalculatorable{
    public int avg();
}
interface SubSubCalculatorable extends SubCalculatorable{ // 상속도 가능
    public int mul();
}
class DummyClass implements Calculatorable,SubSubCalculatorable{ //인터페이스를 완벽하게 구현해야 컴파일이 되기때문에 약속이 꺠질것이라는 문제가 거의 없다.
    // 특정한 클래스는 반드시 I 인터페이스를 기반으로 구현해야한다.
    //상속된 상위 인터페이스도 모두 구현해야한다.
    int right;
    int left;
    int middle;
    public int sum(){ // 오버라이딩이 아닌 '구현' 이다. 본체를 그대로 가져와 구현해야함.
        return right+left+middle;
    }
    public void setOperand(int left, int right,int middle){
        this.left = left;
        this.right = right;
        this.middle = middle;
    }
    public int avg(){
        return (this.right + this.left + this.middle)/3;
    }
    public int mul(){

        return (this.right * this.left * this.middle);
    }
}