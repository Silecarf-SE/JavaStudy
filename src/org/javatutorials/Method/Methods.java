package org.javatutorials.Method;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Methods {

    public static void main(String[] args){
        int k=0;

        String rs = "";
        rs += numbering(3);
        rs += numbering(3,4);
        System.out.println("Number " + rs);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(rs);
            out.close();

        }catch (IOException e){

        }
        String[] returnString = getMembers();
        System.out.println(returnString[0] + returnString[1] + returnString[2]);
    }
    public static int numbering(int init, int add) {
        int s = init;
        s += add;
        return s;
    }
    public static int numbering(int init){
        int s = init;
        s += init;
        return s;
    }
    public static String[] getMembers(){
        String[] members = {"na", "nu", "uri"};
        return members;
    }
}
