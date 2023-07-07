import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo {


    public static void main(String args[])
    {


        LocalDate ld=LocalDate.now();

        System.out.println(ld);

        LocalTime lt=LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        System.out.println(ldt.getYear());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getDayOfWeek());

        LocalDate l=LocalDate.of(2023,2,6);

        System.out.println(l);





//        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:s");
//
//        System.out.println(formatter.format(ldt));








    }
}
