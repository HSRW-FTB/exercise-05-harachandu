import java.util.Date;

public class User {
    
    private String id;
    private String lastname;
    private String firstname;
    private Date birthdate = new Date();
    private Domain domain;


    protected User(){

    }


    protected User(String id, Domain domain, String firstname, String lastname){
        
        this.id = id;
        this.domain = domain;
        this.firstname = "firstname";
        this.lastname = "lastname";
       
    }

    protected User(String id, Domain domain, String firstname, String lastname, Date birthdate){

        this.id = id;
        this.domain = domain;
        this.firstname = "firstname";
        this.lastname = "lastname";
        this.birthdate = birthdate;

    }

    public String getFirstName(){

        return this.firstname;

    }

    public void setFirstName(String firstname){

        this.firstname = firstname;

    }

    public String getLastName(){

        return this.lastname;

    }

    public void setLastName(String lastname){

        this.lastname = lastname;

    }

    /*public void setID(String id){
        this.id = id;
    }*/

    public String getID(){

        return this.id;

    }

    public Date getBirthDate(){

        return this.birthdate;
        
    }

    public void setBirthDate (Date birthdate){

        this.birthdate = birthdate;

    }


    public Domain getDomain(){

        return this.domain;

    }


    public String getFQUN(){


        if (this.domain == Domain.STAFF) {
            return (this.id + "@staff.hsrw");
        }
        else {return (this.id + "@student.hsrw");}

    }

}
