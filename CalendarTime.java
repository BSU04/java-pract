import java.util.*;

public class CalendarTime {
  public static void main(String[] args) throws InterruptedException{
    
    Calendar Cal1 = Calendar.getInstance();
    System.out.println("Date and Time now is: " + Cal1.getTime());
    Thread.sleep(5000);// delay of 5 secs
    Calendar Cal2 = Calendar.getInstance();
    System.out.println("Date and Time after 5 secs is: " + Cal2.getTime());    
  }
}