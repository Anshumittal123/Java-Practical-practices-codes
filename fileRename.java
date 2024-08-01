import java.io.File;

public class fileRename {
    public static void main(String[] args) {
        File f = new File("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\FileHandling\\ANSHU.txt");
        File r = new File("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\FileHandling\\LC.txt");

        if (f.exists()) {
            System.out.println(f.renameTo(r));
        }else{
            System.out.println("File dosn't exists....!");
        }
    }
}
