import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        File file = new File("abc.txt");

//        checking if file exists otherwise createing it

//        if(!file.exists())
//        {
//            try {
//
//                boolean status=file.createNewFile();
//                if(status==true)
//                {
//                    System.out.println("File Created");
//                }
//                else
//                {
//                    System.out.println("Some Problem");
//                }
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        else
//        {
//            System.out.println("File already present");
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter name");
//        String name= scanner.next();
//
//        System.out.println("Enter Age");
//        int age= scanner.nextInt();
//
//        if(age<18)
//        {
//            try {
//
//
////                Writing and appending file
//
//                FileWriter fwriter=new FileWriter("abc.txt",true);
//
//                fwriter.append(name);
//
//                fwriter.close();
//
//
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        else{
//            System.out.println("all Good");
//        }


//        reading a file

        File rfile=new File("abc.txt");

        try {


            rfile.createNewFile();

            rfile.setReadOnly();




        } catch (IOException e) {
            throw new RuntimeException(e);
        }



   /*     File nfile=new File("C:/Users/SAURABH/Desktop/xyz.txt");

        nfile.delete();*/

//        System.out.println(rfile.getPath());
//        System.out.println(rfile.getAbsolutePath());
//        System.out.println(rfile.getTotalSpace());
//        System.out.println(rfile.getFreeSpace());
//        System.out.println(rfile.length());





//        rfile.renameTo(nfile);

//        try {
//
//            Scanner sc=new Scanner(rfile);
//
//
//            while(sc.hasNextLine())
//            {
//                System.out.println(sc.nextLine());
//            }
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


    }
}