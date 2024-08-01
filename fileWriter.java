import java.io.*;

public class fileWriter {
    public static void main(String[] args) {
        try {
            // Way 1 of writing a file
            FileWriter f = new FileWriter("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\FileHandling\\LC.txt");

            // Way 2 of writing a file
            // FileWriter file = new FileWriter("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\FileHandling\\LC.txt");
            // BufferedWriter f = new BufferedWriter(file);

            // Way 3 of writing a file
            // FileOutputStream f = new FileOutputStream("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\FileHandling\\LC.txt");
            // String data = "Java Programming is the best languages....!";
            // byte[] array = data.getBytes();

            // Way 4 of writing a file
            // PrintWriter f = new PrintWriter("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\FileHandling\\LC.txt");
            try {
                f.write("Java Programming is the best languages....!");
                // f.write(array);

            } catch (Exception e) {
                System.out.println("Something went wrong with :: write opeartion");
            }finally{
                f.close();
            }
            System.out.println("Successfully data wrote in file!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
