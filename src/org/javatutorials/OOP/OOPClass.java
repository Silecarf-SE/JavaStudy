package org.javatutorials.OOP;

public class OOPClass {
    public static void sum(int left, int right){ //리팩토링(refactoring) : 코드의 내용을 개선하여 더 효율적으로 만드는 것
        System.out.println(left + right);
    }
    public static void avg(int left,int right){
        System.out.println((double)(left+right)/2);
    }
    public static void sumavg(int left, int right,boolean flag){
        if(flag) {
            sum(left, right);
        }else {
            avg(left, right);
        }
    }
    public static void main(String[] args){
        //추상화 : 현실세계의 정보를 소프트웨어 적으로 단순화시켜서 만드는 행위
        //부품화 : 재사용이 가능해지도록 만드는 것
        //객체지향은 부품화의 정점이다. 메소드는 중복적으로 사용 되는 부분을 빼서 재사용성을 높인 것
        //은닉화, 캡슐화 : 제대로된 부품이라면 어떻게 만들어졌는지 몰라도 사용하는 방법만 알면 쓸 수 있게 해야함.
        //인터페이스 : 부품과 부품을 서로 교환 할 수 있어야 한다.(규격이 맞는다면) 그 연결점이 인터페이스이다.
        sumavg(5,6,false);
    }
}
