package com.company;

import java.util.ArrayList;

public class Experiment1 {
    public static void main(String[] args) {
        ArrayList<Integer>arr= new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.remove(1);
        for(int i:arr)
        {
            System.out.println(i);
        }

    }
}