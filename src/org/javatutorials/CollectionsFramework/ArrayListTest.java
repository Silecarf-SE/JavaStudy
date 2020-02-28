package org.javatutorials.CollectionsFramework;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        String[] arrayObj = new String[2];
        arrayObj[0]="one";
        arrayObj[1]="two";
        //arrayObj[2]="three"; // error
        for (int i=0;i<arrayObj.length;i++) {
            System.out.println(arrayObj[i]);
        }                                               //Set 류에 HashSet, LinkedHashSet, TreeSet
        ArrayList<String> al = new ArrayList<String>();//List 류에 ArrayList, VectorList, LinkedList 3종류가 있다.
        al.add("one"); //인자가 Object 형이다.           //Queue 에 PriorityQueue (우선순위 큐), LinkedList (위의 것과 동일)
        al.add("two");                                  //Map 류에 SortedMap ( 밑에 TreeMap) , HastTable, LinkedHashMap, HashMap
        al.add("three");                                // 각각의 카테고리는 저장 방법과 가져오는 방식이 다르다.

        for (int i=0;i<al.size();i++) {
            String value = al.get(i); // Object 를 형변환하여 사용 가능. ArrayList를 명시적으로 선언하면 형변환 필요 없음.
            System.out.println(value);
        }

    }
}
