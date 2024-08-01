import java.io.*;

public class fileRead {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\FileHandling\\LC.txt");
            try {
                int i;
                while ((i=r.read()) != -1) {
                    System.out.print((char)i);
                }
                
            } catch (Exception e) {
                System.out.println("Something went wrong :: Read operation");
            }finally{
                r.close();
            }
        } catch (Exception e) {
            System.out.println("Exception Handled...! ");
        }
    }
}
