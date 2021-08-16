import java.io.*;
import java.util.*;
class Product
{
double price;
int pcode;
String pname;


double getProductInfo()
{
  Scanner sc = new Scanner(System.in);
 System.out.println("Enter the product name:");
 pname = sc.nextLine();
  System.out.println("Enter the product code:");
  pcode = sc.nextInt();
  System.out.println("Enter the product price:");
  price = sc.nextDouble();
  return price;

}
}
class ProductMain
{
  public static void main(String args[])
  { double a,b,c;
    //Scanner sc = new Scanner(System.in);
    Product p1=new Product();
    Product p2=new Product();
    Product p3=new Product();
    a= p1.getProductInfo();
    b= p2.getProductInfo();
    c= p3.getProductInfo();

    if(a<b && a<c)
    {
      System.out.println(p1.pname+"has the lowest price:"+p1.price);
    }
    else if(b<c)
    {
      System.out.println(p2.pname+"has the lowest price:"+p2.price);
    }
    else
      System.out.println(p3.pname+"has the lowest price:"+p3.price);
  }
}
