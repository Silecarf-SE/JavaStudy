package org.javatutorials.OOP;

public class Override {
    public void ret(){
        System.out.println("return");
    }
    public static void main(String[] args){
        V v1 = new V(3);
        R r1 = new R(2);
        v1.Count();
        r1.Count();
        r1.Count(3);
        r1.set(3,4);
        r1.set(3,4,5);
    }
}
class V{
    public V(){
        System.out.println("Crate V1");
    }
    public V(int a){
        System.out.println("Create V"+a);
    }
    public static void Count(){
        System.out.println("1");
    }
}
class R extends V{

    public static void Count(){ // override 하기 위해선 부모 타입의 return 타입과 호환되어야 한다.
                                // 같아야 하는 것 = 이름, 매개변수(숫자, 타입, 순서), 리턴 타입
        System.out.println("R 1");
    }
    int left;
    int right;
    int middle;
    public void set(int a, int b){
        this.left=a;
        this.right=b;
        System.out.println(this.left + this.right);
    }
    public static void Count(int a){ // 자식 클래스에서 오버 로드
        System.out.println("R"+a);
    }
    public void set(int a,int b, int c){ // 오버로딩은 이름 같아야하고, 리턴 타입은 같아야한다. 인자는 달라도 됨.
        set(a,b);
        this.middle=c;

        System.out.println(this.left + this.right + this.middle);
    }
    public R(int a){
        super(a);
    }
}