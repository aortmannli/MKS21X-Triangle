public class demo{
  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    Point P3 = new Point(3,4);

    System.out.println(Point.distance(P1,P2));
    System.out.println(P1.distanceTo(P2));
    Triangle T0 = new Triangle(P1, P2, P3);
    Triangle T1 = new Triangle(1, 1, 2, 2, 3, 4);
    System.out.println(T0);
    System.out.println(T1);
    System.out.println(T0.getPerimeter());
    System.out.println(T1.getVertex(1));
 }
}

