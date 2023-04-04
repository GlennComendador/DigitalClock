import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DigitalClock {

    public static void main(String[] args) {
        
        //INITIALIZATIONS
        ClockGUI clockGUI = new ClockGUI();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");

        //GUI SETUP
        clockGUI.setGUI();

        //TIME
        while(true) {
            //TIME
            String currentTime = timeFormat.format(Calendar.getInstance().getTime());
            clockGUI.setTime(currentTime);

            //DAY
            String currentDay = dayFormat.format(Calendar.getInstance().getTime());
            clockGUI.setDay(currentDay);

            //DATE
            String currentDate = dateFormat.format(Calendar.getInstance().getTime());
            clockGUI.setDate(currentDate);

            try {
                //UPDATE EVERY 1 SECOND
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
