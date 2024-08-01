import java.io.*;

class createFile {
    public static void main(String args[]){
        try {
            File f = new File("C:\\Java And DSA Beginning to advanced level\\Java-Practices\\FileHandling\\LC.txt");
            if(f.createNewFile()){
               System.out.println("File successfully Created....");
            }else{
               System.out.println("File Already exists....");
            }
        } catch (Exception e) {
            System.out.println("Exception Handled...!");
        }
    }
}
 