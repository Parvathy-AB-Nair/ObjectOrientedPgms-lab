class Rectangle
{
  double length;
  double breadth;
  void setData(double l,double b)
  {
    length=l;
    breadth=b;

  }
  double getArea()
  {
    double a;
    a= length*breadth;
    return a;
  }

}
class RectangleMain extends Rectangle
{
  public static void main(String args[])
  {
    double area;

    Rectangle R1=new Rectangle();
    R1.setData(12.4,13);
    area=R1.getArea();
    System.out.println("Area of rectangle with length 12.4 and breadth 13 is :"+area);

    Rectangle R2=new Rectangle();
    R2.setData(10.5,9);
    area=R2.getArea();
    System.out.println("Area of rectangle with length 10.5 and breadth 9 is :"+area);

    Rectangle R3=new Rectangle();
    R3.setData(13,14);
    area=R3.getArea();
    System.out.println("Area of rectangle with length 13 and breadth 14 is :"+area);


  }
}
