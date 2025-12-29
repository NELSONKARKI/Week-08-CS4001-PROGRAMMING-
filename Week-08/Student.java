public class Student {
    String name;
    int studentId;
    int age;
    double grade;

    Student(String name){
        this.name = name;
    }

    Student(String name, int age, int studentId, double grade){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
    }

    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Student ID : " + studentId);
        System.out.println("Grade : " + grade);
        System.out.println("-------------------");
    }

    public static void main(String[] args){
        Student s1 = new Student("Nelson");
        Student s2 = new Student("Nischal", 20, 123, 3.2);

        s1.displayInfo();  
        s2.displayInfo();  
    }
}
