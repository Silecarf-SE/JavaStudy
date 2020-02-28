package org.javatutorials.CollectionsFramework;

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        //Map 은 Key : Value 쌍으로 이루어지는데 Key 는 고유값(중복 허용하지 않음), Value (중복 허용)
        HashMap<String,Integer> a = new HashMap<String,Integer>();
        a.put("one",3);
        a.put("two",2);
        a.put("three",7);
        //System.out.println(a.get("one"));
        //System.out.println(a.get("two"));
        //System.out.println(a.get("three"));
        a.put("one",5);
        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }
    static void iteratorUsingForEach(HashMap map){ // map 을 set 에 가져와서 엔트리만 가져간다.get Key, get value 로 다룬다.
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    static void iteratorUsingIterator(HashMap map){ // map 을 set 에 가져와서 set 의 이터레이터를 통하여 본다.
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String,Integer>> i = entries.iterator();
        while (i.hasNext()){
            Map.Entry<String,Integer> entry = i.next();
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }

    }

}
