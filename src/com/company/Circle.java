package com.company;

public class Circle {
    double radius;


    public double calculate(int x, int y)
    {
        x = x * x;
        y = y * y;

        radius = Math.sqrt(x + y);
        System.out.println("The radius of circle is: " + radius);
        return radius;
    }


}
