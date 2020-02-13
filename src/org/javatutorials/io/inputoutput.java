package org.javatutorials.io;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args){
        for (String e:args) {
            System.out.println(e);
        }
        try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);

        /*
        int i = sc.nextInt();
        double j = sc.nextDouble();
        System.out.println(i*10 + " " + j*10);
        */
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt() * 10);
            }
            sc.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
