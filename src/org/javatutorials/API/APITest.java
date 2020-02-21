package org.javatutorials.API;

public class APITest {

    public static void main(String[] args){
        System.out.println(); // System 소속인 out 에 담겨진 객체의 메소드가 println ( 인스턴스화 시키지 않고 바로 사용 했음)
                                // System.out (시스템이라는 클래스의 클래스변수 static 메소드?)
                                // System 은 import Java.lang.* 소속이다. (묵시적으로 임포트해줌)
                                //API (어플리케이션 프로그래밍 인터페이스) 자바를 제어하는 조작방법을 확장 시켜주는 것
                                //자바 API 문서( http://docs.oracle.com/javase/ )
        //접근제어자 클래스의 멤버 변수들의 접근권한을 가진다. (public private)
        //접근제어자의 사용이유 : 권한을 가진 사람만 사용하게 함, 내부에서만 사용되는 함수, 내부의 정보를 외부에 보이지 않게 하기 위해서
        Testclass A = new Testclass();
        //A.a += 3; a 는 private int 변수 수정 불가
        System.out.println(A.sum(5));
        System.out.println(A.sum(8));

        /*
        public      같은 클래스, 같은 패키지, 다른패키지 서브클래스, 관계없음
        protected   같은 클래스, 같은 패키지, 다른패키지 서브클래스 (상속하면 프로텍티드가 가능)
        default     같은 클래스, 같은 패키지
        private     같은 클래스
        */
        //같은패키지 = 상속받은 클래스에서 접근 (다른패키지인지 아닌지 중요치 않음)
        //다른패키지 서브클래스 = 다른패키지의 클래스를 또 다른 패키지 클래스에서 접근 (상속하면 가능)



    }
}
class Testclass{
    private int a=3;
    public int sum(int b){
        return a+b;
    }
}