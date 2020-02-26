package org.javatutorials.ObjectEnum;
class Fruit{ // 클래스로 만들어진 상수를 정의하게 되면 클래스가 가진 멤버를 배열처럼 열거할 수 없다.
    public static final Fruit APPLE = new Fruit(); // 자기자신을 인스턴스화해서 넣는다?
    public static final Fruit BANANA = new Fruit(); // 같은 데이터타입을 같지만 서로 다른 인스턴스를 갖고 있다.
    public static final Fruit GRAPE = new Fruit();
}
interface CompanyT{
    int GOOGLE =2, APPLE=1,ORACLE=3;
}
class Company{
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();

}
enum FruitE{ // 열거를 위한 코드임을 표현한다. 사실상 클래스이다. 즉 생성자를 만들 수 있다.
            //열거형에 어떤 데이터가 있는지 몰라도 하나씩 꺼내서 처리할 수 있다.
    APPLE("red"), BANANA("yellow"), GRAPE("purple"),PEACH("pink");
    private String color; // 변수 가능
    FruitE(String color){ // 생성자 가능
        this.color = color;
        System.out.println(this+" : enum Constructor");
    }
    public String getColor(){
        return this.color;
    }
}
enum CompanyE{
    GOOGLE, APPLE, ORACLE;
}
public class EnumTest {
    private final static int APPLE = 1; // final 한번 지정되면 안바뀜!, static 이 클래스의 변수이다.(인스턴스에서 못바꿈)
    private final static int BANANA = 2;
    private final static int GRAPE = 3;

    public static void main(String[] args){
        //int type=Fruit.APPLE;
        Fruit type = Fruit.APPLE;
        /*
        switch (type) { // 문제는 스위치문의 조건은 타입이 제한되어 있다.
            case Fruit.APPLE:
                System.out.println("Apple");
                break;
            case Fruit.BANANA:
                System.out.println("Banana");
                break;
            case Fruit.GRAPE:
                System.out.println("Grape");
                break;
        }
        */
        /*if(Fruit.APPLE == Company.APPLE) // 런타임 에러를 컴파일 타임으로 가져왔다.
            System.out.println("같아?");*/
        FruitE typeE = FruitE.APPLE;
        switch (typeE) { // enum 으로 인스턴스의 생성과 상속을 방지할 수 있다.
            case APPLE:
                System.out.println("Apple : " + FruitE.APPLE.getColor());
                break;
            case BANANA:
                System.out.println("Banana : "+ FruitE.APPLE.getColor());
                break;
            case GRAPE:
                System.out.println("Grape : "+ FruitE.APPLE.getColor());
                break;
        }

        for(FruitE F : FruitE.values()){ // foreach, 열거형은 연관된 값들을 저장한다. 또 그 값들이 변경되지 않도록 보장한다.
                                        //열거형 자체가 클래스이기 때문에 열거형 내부에 필드 생성자 메소드를 가질 수 있다.
            System.out.println(F);
        }
    }
}
