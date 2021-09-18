package Test1;

import java.util.Scanner;

class Student_in_DSA {
    String student_id;
    String name;
    String birthday;

    public Student_in_DSA() {
    }

    public Student_in_DSA(String student_id, String name, String birthday) {
        this.student_id = student_id;
        this.name = name;
        this.birthday = birthday;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void OutputInf(){
        System.out.println("Student ID: " + student_id);
        System.out.println("Name: " + name);
        System.out.println("Date of birth: " + birthday);
        System.out.println("");
    }
    public void InputInf(){
        Scanner input = new Scanner(System.in);
        System.out.println("Student ID: ");
        student_id=input.nextLine();
        System.out.println("Name: ");
        name=input.nextLine();
        System.out.println("Date of birth: ");
        birthday=input.nextLine();
    }
}
