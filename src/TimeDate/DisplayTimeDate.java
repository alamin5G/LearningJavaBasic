package TimeDate;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class DisplayTimeDate {
    public static void main(String[] args){

        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter = new Formatter();
        formatter.format("%tB %tb %tm", calendar, calendar, calendar); // January Jan 01
        System.out.println(formatter);

        /**For the current time show*/

        Formatter format = new Formatter();
        Calendar cal = Calendar.getInstance();
        format = new Formatter();
        format.format("%tl:%tM", cal, cal); //3:26
        System.out.println(format);


        /**For Details current time and date*/

        format = new Formatter();
        format.format("%tc", cal); //Wed Dec 21 03:28:45 BDT 2022
        System.out.println(format);

        /**Current Date Format */
        Date date = new Date(); ////Wed Dec 21 03:28:45 BDT 2022
        System.out.println(date);

        /**Display Week Days*/
        String[] weekDays = new DateFormatSymbols().getWeekdays();
        for (int i = 2; i < weekDays.length; i++) {
            String weekDay = weekDays[i];
            System.out.println(weekDay);
        }
    }
}
