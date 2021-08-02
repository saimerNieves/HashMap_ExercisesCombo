package com.company;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
	// write your code here

        int loopingCount = Integer.parseInt(br.readLine());


        HashMap<String,String> phoneBookMap = new HashMap<>();

        for (int i = 0; i < loopingCount; i++){

            String[] phoneBookNumbers = br.readLine().trim().split(" ");
            phoneBookMap.put(phoneBookNumbers[0],phoneBookNumbers[1]);
        }


        ArrayList<String> namesArray = new ArrayList<>();

        for (int i = 0; i < loopingCount; i++){

            String name = br.readLine();
            namesArray.add(name);
        }


        for (int i = 0; i < namesArray.size(); i++){

            if(phoneBookMap.containsKey(namesArray.get(i)) == true){
                System.out.println( namesArray.get(i)+"=" + phoneBookMap.get(namesArray.get(i)));
            }
            else{
                System.out.println("Not found");
            }


        }

    }
}
