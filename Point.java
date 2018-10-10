public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point p){
    double X = this.x - p.x;
    double Y = this.y - p.y;
    return Math.sqrt(Math.pow(X,2) + Math.pow(Y,2));
  }

  public static double distance(Point p1, Point p2){
    double X = p1.x - p2.x;
    double Y = p1.y - p2.y;
    return Math.sqrt(Math.pow(X,2) + Math.pow(Y,2));
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }
}

  
