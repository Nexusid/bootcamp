import java.util.*;
import java.text.*;

public class paradate{
    public static void main(String args[]) {
        List<Date> dates = new ArrayList<Date>();

String str_date ="17/11/2018";
String end_date ="23/11/2018";

DateFormat formatter ;

formatter = new SimpleDateFormat("dd/MM/yyyy");
try {
Date  startDate = (Date)formatter.parse(str_date);
Date  endDate = (Date)formatter.parse(end_date);
long interval = 24*1000 * 60 * 60;
long endTime =endDate.getTime() ;
long curTime = startDate.getTime();
while (curTime < endTime) {
    dates.add(new Date(curTime));
    curTime += interval;
}
for(int i=0;i<dates.size();i++){
    Date lDate =(Date)dates.get(i);
    String ds = formatter.format(lDate);
    System.out.println("Berikut adalah tanggal  " + ds);
}
}catch (Exception e) {

}
    }
}