package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Circle[] circles=new Circle[3];
    circles[0]=new Circle(1);
    circles[1]=new Circle(3);
    circles[2]=new Circle(2);
    Arrays.sort(circles);
    for (Circle circle:circles)
    {
        System.out.println(circle);
    }
    }
}
