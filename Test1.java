import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

class Test1
{
  public static void main (String[] args)
  {
   Date d  = new Date();
   
   SimpleDateFormat sdf =
    new SimpleDateFormat("yyyy'�N'M'��'dd'��'k'��'mm'��'");

   TimeZone tz =TimeZone.getTimeZone("Pacific/Honolulu");
   sdf.setTimeZone(tz);

   System.out.println("���݂̃n���C�̎�����"+sdf.format(d));

   }
}
