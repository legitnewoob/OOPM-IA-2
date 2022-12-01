//This is the SGPA.java class and is present in the Calculator package

package Calculator;

public class Sgpa extends Grade            //Inherited sub class
{
    float avg=0,earn=0;
    int i;
    int[] a=new int[9];
    String[] c=new String[9];
    float calc=0;

    public Sgpa()				//Constructor
    {
        super();
    }
    public Sgpa(int marks[])
    {
        super(marks);
    }

    public void total()							//Here we assign the Grade point and Grade for each subject.
    {
        super.total();

        for(i=0;i<9;i++)
        {
            if(marks[i]>=80 && marks[i]<=100)
            {
                a[i]=10;
                c[i]="O";
            }
            else if(marks[i]>=70 && marks[i]<80)
            {
                a[i]=9;
                c[i]="A+";

            }
            else if(marks[i]>=60 && marks[i]<70)
            {
                a[i]=8;
                c[i]="A";
            }
            else if(marks[i]>=55 && marks[i]<60)
            {
                a[i]=7;
                c[i]="B+";
            }
            else if(marks[i]>=50 && marks[i]<55)
            {
                a[i]=6;
                c[i]="B";
            }
            else if(marks[i]<=45 && marks[i]<50)
            {
                a[i]=5;
                c[i]="C";
            }
            else if(marks[i]<=40 && marks[i]<45)
            {
                a[i]=4;
                c[i]="D";
            }
            else if(marks[i]<40)
            {
                a[i]=0;
                c[i]="FF";
            }


            if(c[i]=="FF")									//Calculating the total credits earned.
                earn+=0;
            else
                earn+=credits[i];


            calc+=((float)a[i]*credits[i]);
        }

        avg=calc/sum; 									//Calculating the SGPA.
    }
}