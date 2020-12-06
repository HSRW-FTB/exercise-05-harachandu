public class TestBucketOfObjects {
    public static void main(String[] args) throws Exception {
        
        BucketOfObjects bucket = new BucketOfObjects();

        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle();
        RegularPolygon obj3 = new RegularPolygon();
        Triangle obj4 = new Triangle();
        Rectangle obj5 = new Rectangle();

        bucket.addObject(obj1);
        bucket.addObject(obj2);
        bucket.addObject(obj3);
        bucket.addObject(obj4);
        bucket.addObject(obj5);

        System.out.print("Total area: " + bucket.getTotalArea());
        System.out.print(" Total perimeter: " + bucket.getTotalPerimeter());
        System.out.print(" Content: " + bucket.toString());


    }
}
