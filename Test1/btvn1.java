package Test1;

import java.util.ArrayList;
import java.util.Scanner;

public class btvn1 {
    public static void main(String[] args) {
        ArrayList<Student_in_DSA> studentList=new ArrayList<>();
        int choose;
        Scanner scan=new Scanner(System.in);
        do{
            menu();
            System.out.println("Choose: ");
            choose=scan.nextInt();
            switch (choose){
                case 1:
                    int n;
                    System.out.println("Number of students: ");
                    n=scan.nextInt();
                    for(int i=0;i<n;i++){
                        Student_in_DSA std=new Student_in_DSA();
                        std.InputInf();
                        studentList.add(std);
                    }
                    break;
                case 2:
                    for (Student_in_DSA student_in_dsa : studentList) {
                        student_in_dsa.OutputInf();
                    }
                    break;
                case 3:
                    System.err.println("Goodbye!!!");
                    break;
            }
        }while(choose!=3);
    }
    static void menu(){
        System.out.println("1.Enter number of students");
        System.out.println("2.Display student information");
        System.out.println("3.Exit");
    }
}
