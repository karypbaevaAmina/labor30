import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Journal {
    public int time;
    public int autoNum;

    public Journal(int time, int autoNum) {
        this.time = time;
        this.autoNum = autoNum;
    }

    public static void recordTime(){
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd: hh-mm-ss");

        for (LocalDateTime i=ldt; i.isBefore(ldt.plusDays(30)); i=i.plusMinutes(5)){
            System.out.println(formatter.format(i));
        }
    }


}












