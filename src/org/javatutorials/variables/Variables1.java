package org.javatutorials.variables;

public class Variables1 {

    public static void main(String[] args) {
        float a = 2.2f;
        long h = 2147483648l;
        double b;
        b=3;
        String first = " this is Test";
        String c;
        String d;
        c = "every";
        d = "body";
        System.out.println( a+c + d + first);
        byte e;
        e=-128;
        //data type
        /*
            byte 1byte -128~127
            int 4byte -2147483648 ~ 2147483647
            short 2byte
            long 8byte
            double 8byte
            float 4byte
            char 2byte
            String 2N byte(글자 하나당)
            short = char < int < long < float < double // size 오른쪽으론 넘어갈 수 있음
        */
        double i = 3.3f; // implicit Conversion 암시적 변환
        float j = (float)2.0; // double > float error!
        int k = (int)3.6f; // 소수점 이하는 손실(사라짐 반올림 x)
        System.out.println( i + " " + j + " " + k);


        // write your code here

        //vim 계열인가 i로 인서트하네
    }
}
