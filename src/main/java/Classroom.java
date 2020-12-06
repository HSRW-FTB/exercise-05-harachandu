import java.util.Date;
import java.text.DateFormat;

public class Classroom {
    
    private String id;
    private Course course;
    private Student[] participants;
    private String room;
    private String term;
    private int tracker;

    

    private Classroom(){

        this.participants = new Student[100];
        this.tracker = 0;
    

    }

    public Classroom(Course course, String room){

        this.course = course;
        this.room = room;
        this.participants = new Student[100];
        this.tracker = 0;
        Date date = new java.util.Date();

        int month = date.getMonth();
        int year = date.getYear() + 1900;
    
        if (month < 10 && month >3) {
            this.id = this.course.getID() + "SS" + year;
        }
        else {this.id = this.course.getID() + "WS" + year + "/" + ((year-2000)+1);}


    }

    public Classroom(Course course, String room, Date date ){

        
        this.course = course;
        this.room = room;

        this.participants = new Student[100];
        this.tracker = 0;

        int month = date.getMonth();
        int year = date.getYear() + 1900;
    
        if (month < 10 && month >3) {
            this.id = this.course.getID() + "SS" + year;
        }
        else {this.id = this.course.getID() + "WS" + year + "/" + ((year-2000)+1);}


    }

    public Course getCourse(){

        return this.course;

    }

    public String getRoom(){

        return this.room;

    }

    public void setRoom(String room){

        this.room = room;

    }

    public String getTerm(){
        Date date = new java.util.Date();
        int month = date.getMonth();
        int year = date.getYear() + 1900;
    
        if (month < 10 && month >3) {
            this.term = "SS" + year;
        }
        else {this.term = "WS" + year + "/" + ((year-2000)+1);}
        
        return this.term;

    }

    public String getID(){
        Date date = new java.util.Date();

        int month = date.getMonth();
        int year = date.getYear() + 1900;
    
        if (month < 10 && month >3) {
            this.id = this.course.getID() + "-SS" + year;
        }
        else {this.id = this.course.getID() + "-WS" + year + "/" + ((year-2000)+1);}
        return this.id;

    }

    public void addStudent(Student student){

        this.participants[tracker] = student;
        tracker++;

    }

   public String getParticipantsEmail(){
       
        String all = "";
        int i;
        for (i = 0; i < tracker; i++) {
            all += participants[i].getID() + "@student.hsrw, ";
        }
        return all;

    }

    public int getTotalParticipants(){

        int counter = 0;
        int i;
        for (i = 0; i < tracker; i++) {
            counter++;
        }
        return counter;

    }
    





}
