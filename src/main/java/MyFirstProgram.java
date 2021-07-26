public class MyFirstProgram {
    public static void main (String[] args){

    Point p1 = new Point(3, 6);
    Point p2 = new Point (5, 3);

    System.out.println("Distance between  p1 and p2 = " + distance(p1,p2)); // task 2.1, 2.2, 2.3
    System.out.println("Distance between  p1 and p2  = " + p1.distance(p2)); //task 2.4


 }

    public static double distance(Point p1, Point p2)
    {
                return  Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
      }
}