import java.lang.Math;

public class RegularPolygon extends GeometricObject {
    
    //attributes 
    private int n;
    private double side;
    private double x;
    private double y;


    //constructors
    RegularPolygon(){

        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
        
    }
    RegularPolygon(int n, double side)
    {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;

    }
    RegularPolygon(int n, double side, double x, double y)
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;

    }

    //accessor (getter) and mutator (setter) methods
    public void setN(int n){

        this.n = n;

    }
    public int getN(){

        return this.n;

    }
    public void setSide(double side){

        this.side = side;

    }
    public double getSide(){

        return this.side;

    }
    public void setX(double x){

        this.x = x;

    }
    public double getX(){

        return this.x;
        
    }
    public void setY(double y){

        this.y = y;

    }
    public double getY(){

        return this.y;

    }
    // other methods
    public double getPerimeter(){

        return (this.n * this.side);

    }
    public double getArea(){

        double angle = (Math.PI / this.n);
        double num = (this.n * (Math.pow(this.side, 2)));
        double denom = (4 * (Math.tan(angle)));
        return (num / denom);

    }

    public String toString(){

        return "RegularPolygon: number of sides = " + this.n + 
        " side length = " + this.side;

    }


}
