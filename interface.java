import java.util.Scanner;

interface client{
    Double totalSalary = 45000.35; // by default it public + static + final
    void input(); // by default it public + abstract
    void output(); // by default it public + abstract
}

class Raju implements client{
    String name;
    Double salary;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        name = sc.nextLine();
        System.out.println("Enter Salary: ");
        salary = sc.nextDouble();
    }
    public void output(){
        System.out.println(name+" "+salary+" and total salary is: "+totalSalary);
    }

    public static void main(String[] args) {
        Raju r = new Raju();
        r.input();
        r.output();
    }
}

// Anshu 50000.35 and total salary is: 45000.35