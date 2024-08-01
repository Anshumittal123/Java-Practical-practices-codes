import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class copyFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\Practical-questionPractices\\LC.txt");

            try {
                f.write("Java is an intersesting lanaguage. I am enjoying a lot.");
            } catch (Exception e) {
                System.out.println("File Already exists...");
            }finally{
                f.close();
            }
            System.out.println("\"Successfully data wrote in file!!");

            FileInputStream r = new FileInputStream("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\Practical-questionPractices\\LC.txt");
            FileOutputStream w = new FileOutputStream("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\Practical-questionPractices\\ANSHU.txt");

            try{
                int i;
                while ((i = r.read()) != -1) {
                    w.write((char) i);
                }
            }catch(Exception e){
                System.out.println("Something went wrong :: Copy operation");
            }finally{
                r.close();
                w.close();
            }
            System.out.println("Data copy successfully....");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
