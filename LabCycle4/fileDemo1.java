import java.io.File;

class fileDemo1 {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("D:/oops/ObjectOrientedPgms-lab");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList)
    {
      System.out.println(str);
    }
  }
}
