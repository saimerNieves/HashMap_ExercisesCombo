package com.company;

import java.util.HashMap;

public class Main {

    public int majorityElement(int[] nums) {


        int majority= 2;
        int size = nums.length;
        int limit = size/majority;

        HashMap<Integer,Integer> mapLocation = new HashMap<>();

        for(int i = 0 ; i < size ; i++){

            int counter = 0;
            int newNumber = nums[i];

            for (int j = 0; j < size; j++) {

                if(nums[j] == newNumber){
                    counter++;
                }
            }
            mapLocation.put(newNumber,counter);
        }

        int maxNum = 0;
        int maxKey = 0;

        for ( int key : mapLocation.keySet()) {

            if(mapLocation.get(key) > maxNum){

                maxNum = mapLocation.get(key);
                maxKey = key;
            }

        }


        return maxKey;



    }

    public static void main(String[] args) {
	// write your code here


    }
}
