package org.javatutorials.Polymorphism;
interface father {

}
interface believer{

}
interface mother{

}
interface programmer{
    public void coding();
}
class steve implements father,programmer,believer{
    public void coding(){
        System.out.println("elegance");
    }
}
class rachel implements programmer,mother{
    public void coding(){
        System.out.println("fast");
    }
}
public class PolyPerson {
    public static void main(String[] args) {
        programmer employee1 = new steve(); // 스티브에 대하여 개발자라는 부분만 집중해서 사용 가능.
        programmer employee2 = new rachel();
        employee1.coding();
        employee2.coding();
    }
}
