import java.util.Date;

public class TestClassroom {
    public static void main(String[] args) throws Exception {


        Professor prof1 = new Professor("001", "Ronny", "Hartanto");
        Professor prof2 = new Professor("002", "Niels", "Ostergaard");

        Course obj1 = new Course("EL-2309", "OOP",
        prof1 , 5);
        Course obj2 = new Course("EL-2309", "Dynamics",
        prof2 , 5);

        Student stu1 = new Student("Claudia", "Perez");
        Student stu2 = new Student("Lucia", "Martin");
        Student stu3 = new Student("Marina", "Sacristan");
        

        Classroom class1 = new Classroom(obj1, "room");

        class1.addStudent(stu1);
        class1.addStudent(stu2);
        class1.addStudent(stu3);

        System.out.println(class1.getParticipantsEmail());
        System.out.println(class1.getTotalParticipants());
        System.out.println(class1.getID());






    }
}
