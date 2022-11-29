//import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.*;


class Stu_Subjects_Marks {
    public int id;
    public String stu_name;
    public int ITVC_tot;
    public int OOPM_tot;
    public int DSM_tot;
    public int COA_tot;
    public int Honours_tot;
    public int DS_tot;

    Stu_Subjects_Marks(int id, String stu_name,int ITVC_tot,int OOPM_tot,int DSM_tot,int COA_tot,int Honours_tot,int DS_tot)
    {
        this.id= id;
        this.stu_name=stu_name;
        this.ITVC_tot=ITVC_tot;
        this.DS_tot=DS_tot;
        this.OOPM_tot=OOPM_tot;
        this.DSM_tot=DSM_tot;
        this.COA_tot=COA_tot;
        this.Honours_tot=Honours_tot;
    }

    public void displaymarks() {
       
        {
            System.out.println("Student roll no. is: " + id + " " +"and Student name is: " + stu_name+ "");
            System.out.println("The marks are-");
            System.out.println("1->"+ITVC_tot+" 2->"+OOPM_tot+" 3->"+DSM_tot+ " 4->"+COA_tot+ " 5->"+Honours_tot+" 6->"+DS_tot );
            System.out.println();
        }
        
    }
}

class displayft extends Stu_Subjects_Marks{

    displayft(int id, String stu_name, int ITVC_tot, int OOPM_tot, int DSM_tot, int COA_tot, int Honours_tot, int DS_tot) {
        super(id, stu_name, ITVC_tot, OOPM_tot, DSM_tot, COA_tot, Honours_tot, DS_tot);
    }
    public void displaymarks() {

        {
            System.out.println("Student roll no. is: " + id + " " +"and Student name is: " + stu_name+ "");
            System.out.println("The marks are-");
            System.out.println("1->"+ITVC_tot+" 2->"+OOPM_tot+" 3->"+DSM_tot+ " 4->"+COA_tot+ " 5->"+Honours_tot+" 6->"+DS_tot );
            System.out.println();
        }

    }
}

public class Main {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       Stu_Subjects_Marks[] arr;

       arr= new Stu_Subjects_Marks[2];


        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter your roll no -");
            int id= s.nextInt();
            System.out.println("Please enter your name");
            String stu_name= s.nextLine();
            System.out.println("Please enter your marks (ESE+ISE+CA) in the subject ITVC,OOPM,DSM,COA,Honours,DS");
            int ITVC= s.nextInt();
            int OOPM= s.nextInt();
            int DSM= s.nextInt();
            int COA= s.nextInt();
            int Honours= s.nextInt();
            int DS= s.nextInt();

            arr[i]= new Stu_Subjects_Marks(id,stu_name,ITVC,OOPM,DSM,COA,Honours,DS);

            arr[i].displaymarks();

        }








    }

}
