import java.io.*;

public class fileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream r = new FileInputStream("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\FileHandling\\LC.txt");
            FileOutputStream w = new FileOutputStream("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\FileHandling\\ANSHU.txt");

          try {
            int i;
            while ((i=r.read()) != -1) {
                w.write((char) i);
            }
          } catch (Exception e) {
            System.out.println("Something went wrong :: Copy operation");
          }finally{
            r.close();
            w.close();
          }
          System.out.println("Data Copyed successfully....!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
