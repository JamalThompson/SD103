package com.company;
import java.util.Scanner;
public class Main {
public static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here
        System.out.println("choose a function,\n" +
                "1. design_Tank, \n" +
                "2. calculate_Cost, \n" +
                "3. estimate_Labor Time, \n" +
                "4. estimate_Labor Cost \n");

        int choices = Integer.parseInt(input.nextLine());
        switch (choices) {
            case 1:
                design_Tank();
                break;
            case 2:
                matCost();
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

public static void matCost() {
    System.out.println("what is the radius");
    int radius1 = Integer.parseInt(input.nextLine());
    System.out.println("what is the height");
    int height2 = Integer.parseInt(input.nextLine());

    double surfaceArea = 2 * Math.PI * radius1 * radius1 + 2 * Math.PI * radius1 * height2;
    double alVol = 0.5 * surfaceArea;
    double alPounds = alVol * 0.278;

    double materialCost = 1.61 * alPounds;

    System.out.println("The Volume of Aluminium is " + alVol);
    System.out.println("The Pounds of Aluminium is " + alPounds);
    System.out.println(String.format("The Total cost of Materials will be $%10.2f", materialCost));

}




    public static void design_Tank(){
        System.out.println("What is the Desired tank volume  ");
        int volume =Integer.parseInt(input.nextLine());
        System.out.println("What is the Desired tank radius ");
        int radius =Integer.parseInt(input.nextLine());
        double heightcalculation = volume/(Math.PI*radius*radius);
        System.out.println(String.format("your Height is %10.3f" ,heightcalculation, " Square inches"));
    }
}
