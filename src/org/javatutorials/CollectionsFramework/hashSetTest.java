package org.javatutorials.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class hashSetTest {
    public static void main(String[] args){
        HashSet<Integer> A = new HashSet<Integer>();
        //ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2); // Set 은 하나의 값만 가진다.(중복을 허용하지 않는다.)
        A.add(2); // hashSet 이기 때문에 Hash 값 즉 중복을 지원하지 않는다.
        A.add(2); // Queue 는 FIFO 즉 처음 넣은 값을 바로 뺄 수 있다.
        A.add(3);
        A.add(3);
        HashSet<Integer> B = new HashSet<Integer>();
        HashSet<Integer> C = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);
        C.add(1);
        C.add(3);
        System.out.println(A.containsAll(B)); // 부분집합인가에 대한 질문
        System.out.println(A.containsAll(C));

        A.addAll(B);
        System.out.println(A.containsAll(B));

        Iterator hi = (Iterator) A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }

        Collection<Integer> D = new HashSet<Integer>(); // 전혀 문제 없다. iterator 도 있고 add 도 있기 때문에.
    }
}
