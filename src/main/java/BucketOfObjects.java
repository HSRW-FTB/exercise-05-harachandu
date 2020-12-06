public class BucketOfObjects {
    
    private GeometricObject[] items;
    private int tracker;


    BucketOfObjects(){

        this.items = new GeometricObject[10];
        this.tracker = 0;        
    }

    public void addObject(GeometricObject geometricObject){
 
        
        this.items[tracker] = geometricObject;
        tracker++;
        
    }

    public double getTotalArea(){

        double sum = 0;
        int i;
       for (i = 0; i < tracker; i++) {
            sum += items[i].getArea();
        }
        
        return sum;
    }

    public double getTotalPerimeter(){

        double sum = 0;
        int i;
        for (i = 0; i < tracker; i++) {
            sum += items[i].getPerimeter();
        }

        return sum;

    }

    public String toString(){

        String str = "";
        int i;
        for (i = 0; i < tracker; i++) {
            if (items[i] instanceof Circle) {
                str += "Circle ";
            }
            else if (items[i] instanceof Rectangle) {
                str += "Rectangle  ";
            }
            else if (items[i] instanceof Triangle) {
                str += "Triangle ";
            }
            else { str += "RegularPolygon ";}
            
        }

        return str;

    }

}
