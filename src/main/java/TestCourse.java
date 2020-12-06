import java.util.Date;
public class TestCourse {
    public static void main(String[] args) throws Exception {
        
        Professor prof1 = new Professor("001", "Ronny", "Hartanto");
        Professor prof2 = new Professor("002", "Niels", "Ostergaard");

        Course obj1 = new Course("EL-2309", "OOP",
        prof1 , 5);
        Course obj2 = new Course("EL-2309", "Dynamics",
        prof2 , 5);

        System.out.println("Data of the first course: ");
        System.out.println("ID: " + obj1.getID());
        System.out.println("Name: " + obj1.getName());
        System.out.println("Lecturer: " + obj1.getLecturer());
        System.out.println("Cedits: " + obj1.getCredit());

        System.out.println("Data of the second course: ");
        System.out.println("ID: " + obj2.getID());
        System.out.println("Name: " + obj2.getName());
        System.out.println("Lecturer: " + obj2.getLecturer());
        System.out.println("Cedits: " + obj2.getCredit());

       
        

    }
}
