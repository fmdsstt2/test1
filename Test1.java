import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

class Test1
{
  public static void main (String[] args)
  {
   Date d  = new Date();
   
   SimpleDateFormat sdf =
    new SimpleDateFormat("yyyy'”N'M'Œ'dd'“ú'k''mm'•ª'");

   TimeZone tz =TimeZone.getTimeZone("Pacific/Honolulu");
   sdf.setTimeZone(tz);

   System.out.println("Œ»İ‚ÌƒnƒƒC‚Ì‚Í"+sdf.format(d));

   }
}
