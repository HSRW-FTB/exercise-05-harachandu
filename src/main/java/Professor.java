import java.util.Date;

public class Professor extends User {
    
    private Faculty faculty = Faculty.TUB;
    private Campus campus = Campus.KLE;
    private int phone = 0;


    private Professor(){

    }

    public Professor(String id, String firstname, String lastname){

        super(id, Domain.STAFF, firstname, lastname);

    }

    public Professor(String id, String firstname, String lastname, Date birthdate){

        super(id, Domain.STAFF, firstname, lastname, birthdate);

    }

    public void setFaculty(Faculty faculty){

        this.faculty = faculty;

    }   

    public Faculty getFaculty(){

        return this.faculty;

    }

    public String getFacultyString(){

        return (this.faculty).name();

    }

    public void setPhone(int phone){

        if (phone <= 1000){
            this.phone = phone;
        }
        else {System.out.println("phone variable must be equal or less than 4 digits");}
    }

    public String getPhone(){

    //String phoneStr = Integer.toString(this.phone);
    
    if (this.campus == Campus.KLE) {
        return "+49 2842 908 555";
    }        
    else {return "+49 2842 908 555";}
    }




}
