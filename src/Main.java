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
            System.out.println("ITVC->"+ITVC_tot+" OOPM->"+OOPM_tot+" DSM->"+DSM_tot+ " COA->"+COA_tot+ " DS->"+DS_tot+" Honours->"+Honours_tot );
            System.out.println();
        }

    }
}

class calc_gpa extends Main{


}
public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------");
        System.out.println("WELCOME TO CGPA CALCULATOR");
        System.out.println("Before getting started we would need few details from you....");

        Scanner s = new Scanner(System.in);
        Stu_Subjects_Marks[] arr;
//        String stu_name = "";
         public void imx
        {

        }

        arr = new Stu_Subjects_Marks[1];


        for (int i = 0; i < 1; i++) {

            System.out.print("Please enter your name->");
            String stu_name = s.nextLine();
            System.out.print("Please enter your roll no->");
            int id = s.nextInt();

            System.out.println("Please enter your marks (ESE+ISE+CA) in the subject -> 1.ITVC 2.OOPM 3.DSM 4.COA 5.Honours 6.DS");
            int ITVC = s.nextInt();
            int OOPM = s.nextInt();
            int DSM = s.nextInt();
            int COA = s.nextInt();
            int Honours = s.nextInt();
            int DS = s.nextInt();

            arr[i] = new Stu_Subjects_Marks(id, stu_name, ITVC, OOPM, DSM, COA, Honours, DS);

            arr[i].displaymarks();
        }
    }
}