package Calculator;
import java.util.Scanner;

public class Grade									//Super Class
{
    int marks[]=new int[9];
    float credits[]= {4,3,3,3,4,2,1,1,1};     				//Credits are known by Default
    private int i,j=1;												//as it is only for the 4th Semester.
    float sum=0;
    Scanner sc=new Scanner(System.in);

    public Grade()									//Constructor
    {
        System.out.println();
        System.out.println("Enter the marks in the following order:(Out of 100)");
        System.out.print("ITVC: ");
        marks[0]=sc.nextInt();
        System.out.print("DS: ");
        marks[1]=sc.nextInt();
        System.out.print("COA: ");
        marks[2]=sc.nextInt();
        System.out.print("OOPM: ");
        marks[3]=sc.nextInt();
        System.out.print("DSM: ");
        marks[4]=sc.nextInt();
        System.out.print("DD_Lab: ");
        marks[5]=sc.nextInt();
        System.out.print("DS_Lab: ");
        marks[6]=sc.nextInt();
        System.out.print("COA_Lab: ");
        marks[7]=sc.nextInt();
        System.out.print("OOPM_Lab: ");
        marks[8]=sc.nextInt();
}

    public Grade(int marks[])								//When the subject order is known.
    {
        for(i=0;i<9;i++)
            this.marks[i]=marks[i];
    }

    public void total()									//Calculating the total credits for the Semester.
    {
        for(i=0;i<credits.length;i++)
            sum+=credits[i];
    }
}