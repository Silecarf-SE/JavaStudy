package org.javatutorials.operator;
import org.javatutorials.OOP.Override;
public class Operators {
    public static void main(String[] args) {
        Override r1 = new Override();
        r1.ret();
        System.out.println( 1==2);
        System.out.println( 1== 1);
        System.out.println("one" != "two");
        System.out.println("one" == "one");
        int a=0;
        int b=3;
        if(a==b)
            System.out.println(true);
        else
            System.out.println(false);
        /*
        String id = args[0];
        if(id.equals("egoing")){
            System.out.println("GOGO");
        }else{
            System.out.println("Stop");
        }*/
        switch (4){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Default");
        }

    }
}
