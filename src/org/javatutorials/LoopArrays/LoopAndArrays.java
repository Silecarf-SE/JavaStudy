package org.javatutorials.LoopArrays;

public class LoopAndArrays {
    public static void main(String[] args) {
        int i=0;
        while(i < 10){ // 참 조건
            System.out.println("while loop : " + ++i);
        }

        for(i=0;i<10;i++){
            System.out.println("for loop : " + i);
            if(i > 5 && i < 8){
                continue;
            }
            System.out.println("Not Continue");
        }
        int j=0;
        for(i=0; i<10; i++){
            for(j=0;j<=i;j++){
                System.out.println("i : " + i +  ", j : " + j);
            }
        }
        String[] student = {"J","I","N","A","S","U"};
        /*
            String[] student = new String[6];
            student[0] = "B";
         */

        for(i=0;i<student.length;i++){
            System.out.println(student[i]);
        }
        for (String e:student) {
            System.out.println(e);
        }

        int a[] = new int[8];
        //collection 에서 데이터를 편리하게 핸들링하는 방법을 배울 것.
    }
}
