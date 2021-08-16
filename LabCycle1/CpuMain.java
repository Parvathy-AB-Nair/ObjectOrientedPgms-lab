import java.io.*;
import java.util.*;
class CPU
{
  double price;
  RAM robj;
  Processor pobj;
  CPU(double p,String rmemory,String rmanufacturer,String pmanufacturer,int pcores)
  {
    price=p;
    robj=new RAM(rmemory,rmanufacturer);
    pobj=new Processor(pcores,pmanufacturer);

  }
  class Processor
  {
    int pcores;
    String pmanufacturer;
    Processor(int pcores,String pmanufacturer)
    {
      this.pcores=pcores;

    this.pmanufacturer=pmanufacturer;

  }
  void pdisplay()
  {
    System.out.println("Processor Core="+pcores);
    System.out.printf("Processor manufacturer="+pmanufacturer);
  }
}
static class RAM
{
  String rmemory;
  String rmanufacturer;
  RAM(String rmemory,String rmanufacturer)
  {
    this.rmemory=rmemory;

  this.rmanufacturer=rmanufacturer;

  }
  void rdisplay()
  {
    System.out.println("RAM memory="+rmemory);

  System.out.println("RAM manufacturer="+rmanufacturer);
}}

  void display()
  {
    System.out.println("CPU Price="+price);
  robj.rdisplay();
  pobj.pdisplay();

  }
}


class CpuMain
{
    public static void main(String args[])
    {
    CPU c=new CPU(5000,"4 GB","HP RAM manufacturer","HP Processor manufacturer",8) ;
    c.display();
    }
}
