package org.javatutorials.CollectionsFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable{ // sort 메소드가 Comparable 을 구현하는 오브젝트에 대해서만 기능을 함.
    int serial;
    String owner;
    Computer(int serial, String owner){
        this.serial = serial;
        this.owner = owner;
    }
    public int compareTo(Object o){ // 인터페이스 Comparable 의 메소드, 정렬의 기준을 잡는다.
        return this.serial - ((Computer)o).serial;
    }
    public String toString(){
        return serial + " " + owner;
    }

}
public class CollectionFrameworkTest {
    public static void main(String[] args){


        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, " egoing"));
        computers.add(new Computer(200,"Steve"));
        computers.add(new Computer(3233,"Rachel"));
        System.out.println("before");
        Iterator i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Collections.sort(computers);
        System.out.println("\nlater");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
