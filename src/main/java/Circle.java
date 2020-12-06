public class Circle extends GeometricObject {
    
    private double radius;

    public Circle(){
     
    }

    public Circle(double radius){

        this.radius = radius;

    }

    public Circle(double radius, String color, boolean filled){

        super(color, filled);
        this.radius = radius;

    }

    public double getRadius(){

        return this.radius;

    }

    public void setRadius(double radius){

        this.radius = radius;

    }

    public double getDiameter(){

        return 2 * this.radius;

    }

    //the must implement getArea and getPerimeter

    public double getArea(){

        return 2 * this.radius * this.radius;

    }

    public double getPerimeter(){

        return 2 * Math.PI * this.radius;

    }

    public void printCircle(){

             
        System.out.println("The circle is created " + getDateCreated() + 
        " and the radius is " + this.radius);

    }

    public String toString(){

        return "Circle created on " + getDateCreated() + "\ncolor: " +
        this.getColor() + " and filled: " + this.isFilled() + 
        "radius: " + this.radius;

    }



}
