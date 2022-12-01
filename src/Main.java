import java.util.Scanner;

import Calculator.Display;


class Caller
{
    String y= "yes";
    Scanner sc=new Scanner(System.in);
    int[] marks =new int[10];

    public void begin()
    {

        System.out.println("Do you know the subject order?");
        System.out.println("(Press yes only if you know. Else press any other key)");
        String c = sc.nextLine();
        if(c.equalsIgnoreCase(y))
        {
            System.out.println();
            System.out.println("Please enter the marks in the correct order.");
            int i;
            for(i =0; i <marks.length; i++)
            {
                int m = sc.nextInt();
                marks[i]= m;
            }
            Display d=new Display(marks);			//Declaring Objects and Overloading
            d.total();								//Overriding
            d.disp();
        }
        else
        {
            Display d=new Display();				//Overloading
            d.total();
            d.disp();
        }

        System.out.println("--------------------------------Thank You!!--------------------------------");
        sc.close();
    }
}

public class Main {
    public static void main(String[] args){


        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t--------WELCOME TO CGPA CALCULATOR--------\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t---------Here you can calculate your--------\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t--------Semester grade point average--------\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t----------This is for Comps SEM III---------\t\t\t\t\t\t\t\t");
        System.out.println();


        Caller k = new Caller();

        k.begin();


    }
}