import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

class Test1
{
  public static void main (String[] args)
  {
   Date d  = new Date();
   
   SimpleDateFormat sdf =
    new SimpleDateFormat("yyyy'年'M'月'dd'日'k'時'mm'分'");

   TimeZone tz =TimeZone.getTimeZone("Pacific/Honolulu");
   sdf.setTimeZone(tz);

   System.out.println("現在のハワイの時刻は"+sdf.format(d));

   }
}
