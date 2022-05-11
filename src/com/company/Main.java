package com.company;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileReader fileReader;
        FileWriter fileWriter;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        System.out.println("You have made changes:" + name);
        int ch;
        try {
            fileReader = new FileReader("D:\\ooop\\input.txt");
            fileWriter = new FileWriter("D:\\ooop\\output.txt");

            while ((ch = fileReader.read()) != -1) {
                fileWriter.write(ch);
            }

            fileReader.close();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        HashMap<String, String> map = new HashMap<String, String>();

        map.put("S", "s");
        map.put("B", "B");
        map.put("A", "a");
        map.put("C", "c");
        map.put("Z", "z");

        System.out.println(map);
    }
}
