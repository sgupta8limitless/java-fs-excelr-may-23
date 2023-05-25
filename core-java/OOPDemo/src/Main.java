import java.util.Scanner;


public class Main {
    public static void main(String[] args) {







//        Student s1=new Student();
//        Student s2=new Student();
//        Student s3=new Student();


        Student[] students={new Student(),new Student(),new Student()};


        for(int i=0;i<students.length;i++)
        {
            students[i].getDetails();
        }



        for(int i=0;i<students.length;i++)
        {
            students[i].printDetails();
        }

        System.out.println(students[1].calculateAge())


























    }
}