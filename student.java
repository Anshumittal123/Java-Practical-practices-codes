class student{
    String studentName;
    int studentage;
    String studentID;

    student(String name, int age, String stuID){
        this.studentName = name;
        this.studentage = age;
        this.studentID = stuID;
    }

    public void Display_Student_Details(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Age: "+studentage);
        System.out.println("Student ID: "+studentID);
    }
}

class Graduate_Student extends student{
    String researchTopic;
    String advisorName;

    Graduate_Student(String name, int age, String stuID, String topic, String advisorName){
        super(name, age, stuID);
        this.researchTopic = topic;
        this.advisorName = advisorName;
    }

    public void Display_Student_Details(){
        super.Display_Student_Details();
        System.out.println("Research Topices is: "+researchTopic);
        System.out.println("Advisor Name: "+advisorName);
    }
}

class test{
    public static void main(String[] args) {
        Graduate_Student s1 = new Graduate_Student("Anshu", 19, "G67890", "Frontend Developer", "Histesh");
        s1.Display_Student_Details();
    }
}

// OUTPUT:
// Student Name: Anshu
// Student Age: 19
// Student ID: G67890
// Research Topices is: Frontend Developer
// Advisor Name: Histesh