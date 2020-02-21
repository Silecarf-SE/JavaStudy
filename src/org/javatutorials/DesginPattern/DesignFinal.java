package org.javatutorials.DesginPattern;
//인터페이스는 abstract 와 final 과 함께 대표적인 규제
public class DesignFinal {
    //디자인 패턴은 이미 정해져있는 것이 많다. 따라서 만드는 것이 나쁜것은아니다. 어떤 의미에선 이미 최적화된 형태를 가져다 씀으로서 불편한 부분을 없앨 수 있다.
    public static void main(String[] args){
        //계산기 구현 방법은 template pattern (템플릿에 구멍을 뚫어놓고 그것을 어떤 색연필로,펜으로 할지는 프로그래머가 사용하는 방법에 따라 다름.)
        //Calculator.PI = 3;

    }
}
class Calculator{
    static final double PI = 3.14 ; // 모두 공통적인 (static) 변하지 않는(final) 값 (필드의 fianl)
    int left;
    int right;
    void SetOperand(int left, int right){
        this.left = left;
        this.right = right;
    }
    public final int methodF(){
        System.out.println("Cant Modify");
        return 0;
    }
}
final class TestFinal extends Calculator{
    //int methodF(){ final이기 때문에 상속을 통한 오버라이딩 불가

}
//class TestFFinal extends TestFinal // final 클래스는 상속 불가