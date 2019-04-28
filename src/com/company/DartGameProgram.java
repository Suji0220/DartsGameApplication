package com.company;

import java.util.Scanner;

public class DartGameProgram {
   static int x, y;

    public static void main(String[] args) {



        System.out.println("Enter x coordinate");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        System.out.println();

        System.out.println("Enter y coordinate");
        y = input.nextInt();
        System.out.println();

        Circle circle = new Circle();
        double radius = circle.calculate(x, y);


        if(radius == 0){

       // if(x == 0 && y ==0){
            System.out.println("The target landed in inner circle and player earns 10 points");
        }
        else if ((radius >= 0) && (radius <= 1)){
            System.out.println("The target landed in inner circle and player earns 10 points");
        }
        else if(radius >1 && radius <= 5){
            System.out.println("The target landed in middle circle and player earns 5 points");
        }else if(radius > 5 && radius <= 10){
            System.out.println("The target landed in middle circle and player earns 1 point");
        }else
            System.out.println("The target landed in middle circle and player earns 1 point");







    }
}
