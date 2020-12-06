import java.util.Date;

public class Student extends User {
    
    // attributes
    private static int idGen = 10_000;
    private StudyCourse studycourse;


    //constructors 

    private Student(){
        idGen++;

    }


    public Student(String firstname, String lastname){
   
        
        super((Integer.toString(idGen)), Domain.STUDENT, firstname, lastname);
        idGen++;
       
    }

    public Student(String firstname, String lastname, Date birthdate){

        super((Integer.toString(idGen)), Domain.STUDENT, firstname, lastname, birthdate);
        idGen++;

    }
    


    public StudyCourse getStudyCourse(){

        return this.studycourse;

    }


    public String getStudyCourseDescription() {
        
        
        if (studycourse == StudyCourse.ME){

            return "Mechanical Engineering, B.Sc.";
           
        }
        else if (studycourse == StudyCourse.MSE){

            return "Mechatronic Systems Engineering, B.Sc.";

        }
        else if (studycourse == StudyCourse.EL){

            return "Electrical and Electronics Engineering, B.Sc.";

        }
        else if (studycourse == StudyCourse.IE){

            return "Industrial Engineering, B.Sc.";
            
        }
        else if (studycourse == StudyCourse.BMS){

            return "Biomaterials Science, B.Sc.";

        }
        else if (studycourse == StudyCourse.SCB){

            return "Science Communication & Bionics, B.A./B.Sc.";

        }
        else if (studycourse == StudyCourse.MME){

            return "Mechanical Engineering, M.Sc.";

        }
        else if(studycourse == StudyCourse.MBB){

            return "Bionics, M.Sc.";

        }
        else return "Error!";


    }

    public void setStudyCourse(StudyCourse newStudyCourse){

        this.studycourse = newStudyCourse;

    }
    

    public void setStudyCourse(String newStudyCourse){

        if (newStudyCourse.equalsIgnoreCase("ME"))
        {
            this.studycourse = StudyCourse.ME;
        }
        else if (newStudyCourse.equalsIgnoreCase("MSE"))
        {
            this.studycourse = StudyCourse.MSE;
        }
        else if (newStudyCourse.equalsIgnoreCase("EL"))
        {
            this.studycourse = StudyCourse.EL;
        }
        else if (newStudyCourse.equalsIgnoreCase("IE"))
        {
            this.studycourse = StudyCourse.IE;
        }
        else if (newStudyCourse.equalsIgnoreCase("BMS"))
        {
            this.studycourse = StudyCourse.BMS;
        }
        else if (newStudyCourse.equalsIgnoreCase("SCB"))
        {
            this.studycourse = StudyCourse.SCB;
        }
        else if (newStudyCourse.equalsIgnoreCase("MME"))
        {
            this.studycourse = StudyCourse.MME;
        }
        else if (newStudyCourse.equalsIgnoreCase("MBB"))
        {
            this.studycourse = StudyCourse.MBB;
        }
        

    }
    


}

