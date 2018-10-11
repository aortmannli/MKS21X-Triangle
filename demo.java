public class demo{
  public static void main(String[]args){
    Point p0 = new Point(1,1);
    Point p1 = new Point(2,2);
    Point p2 = new Point(3,4);

    System.out.println(Point.distance(p0,p1));
    System.out.println(p0.distanceTo(p1));
    Triangle T0 = new Triangle(p0, p1, p2);
    Triangle T1 = new Triangle(1, 1, 2, 2, 3, 4);
    System.out.println(T0);
    System.out.println(T1);
    System.out.println(T0.getPerimeter());
    System.out.println(T1.getVertex(1));
    T1.setVertex(0,p2);
    System.out.println(T1);
  }
}

