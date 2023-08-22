package org.launchcode;
import java.util.Scanner;
public class area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a radius");
                double radius = input.nextDouble();
                double pi = 3.14;
                double area = circle.getArea(radius);
                input.close();
        System.out.println("The area of a circle with a radius of "  + radius + " is " + area) ;


    }
}
