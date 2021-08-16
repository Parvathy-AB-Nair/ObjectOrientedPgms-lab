import java.io.*;
class OddEven
{
  public static void main(String args[]) throws IOException
  {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a number");
  int a=Integer.parseInt(br.readLine());

    if(a%2==0)
    {
        System.out.println("The number "+a+"is even");
    }
    else
      System.out.println("The number "+a+"is odd");
  }
}
