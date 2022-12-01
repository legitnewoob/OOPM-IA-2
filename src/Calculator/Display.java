//This is the first class we are using here we keep all the subjects to be displayed;

package Calculator;
import java.text.DecimalFormat;
public class Display extends Sgpa{					//Multi-level inheritance.

    DecimalFormat two_decimal=new DecimalFormat("#.##");
    public  Display()
    {
        super();
    }
    public Display(int[] marks)
    {
        super(marks);
    }

    public void disp()						//Displaying the final result.
    {
        float Cgpa=Float.parseFloat(two_decimal.format(avg));				//Shortening float to 2 decimal places.
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------This is your report card-----------------------------------");
        System.out.println("\t\tSemester 3\t\t Credits registered: 24\t\tCredits earned: "+earn);
        System.out.println();
        System.out.println("Course Code\t\t\t\t\t\t\t\t\t\t\tCourse Name\t\t\t\t\tGP\t\tGrade");
        System.out.println();
        System.out.println("116U01C301\t\tIntegral Transform and Vector Calculus\t\t\t\t\t\t\t"+a[0]+"\t\t"+c[0]);
        System.out.println("116U01C302\t\tData Structures\t\t\t\t\t\t\t\t\t\t\t\t\t"+a[1]+"\t\t"+c[1]);
        System.out.println("116U01C303\t\tComputer Organization and Architecture\t\t\t\t\t\t\t"+a[2]+"\t\t"+c[2]);
        System.out.println("116U01C304\t\tObject Oriented Programming Methodology\t\t\t\t\t\t\t"+a[3]+"\t\t"+c[3]);
        System.out.println("116U01C305\t\tDiscrete Mathematics\t\t\t\t\t\t\t\t\t\t\t"+a[4]+"\t\t"+c[4]);
        System.out.println("116U01L301\t\tDigital Design Laboratory\t\t\t\t\t\t\t\t\t\t"+a[5]+"\t\t"+c[5]);
        System.out.println("116U01L302\t\tData Structures Laboratory\t\t\t\t\t\t\t\t\t\t"+a[6]+"\t\t"+c[6]);
        System.out.println("116U01L303\t\tComputer Organization & Architecture Laboratory\t\t\t\t\t"+a[7]+"\t\t"+c[7]);
        System.out.println("116U01L304\t\tObject Oriented Programming Methodology Laboratory\t\t\t\t"+a[8]+"\t\t"+c[8]);
//
        System.out.println();
        System.out.println("SGPA : "+Cgpa);
        System.out.println();
//        System.out.println();
    }
}