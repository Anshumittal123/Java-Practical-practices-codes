import java.io.*;

class consoleClass{
    public static void main(String args[]){
        String str;
        char ch[];
        Console obj = System.console();
        System.out.print("Enter UserName: ");
        str = obj.readLine();
        System.out.println("Enter Password: ");
        ch = obj.readPassword();
        String a = String.valueOf(ch);

        System.out.println("UserName: " +str);
        System.out.println("Password: " +ch);
        System.out.println("password value: "+a);
    }
}