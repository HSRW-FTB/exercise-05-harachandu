public class Rectangle extends GeometricObject {
    
    private double width;
    private double height;


    public Rectangle(){

    }

    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;

    }

    public Rectangle(double width, double height, String color, Boolean filled){

        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth(){

        return this.width;

    }

    public void setWidth(double width){

        this.width = width;

    }

    public double getHeight(){

        return this.height;

    }

    public void setHeight(double height){

        this.height = height;

    }
     //case of overriding
     public void setFilled(int n){

        if (n>0){
            super.setFilled(true);
        }
        else {super.setFilled(false);}

     }

    public void changeColor(String color){

        super.setColor(color);

    }

    public String toString(){

        return "Rectangle created on " + getDateCreated() + "\ncolor: " +
        this.getColor() + " and filled: " + this.isFilled() + 
        "height: " + this.height + " width: " + this.width;
    }

    public double getArea(){

        return this.height * this.width;

    }

    public double getPerimeter(){

        return 2 *this.height + 2 * this.width;

    }
}
