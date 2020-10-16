import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Watch implements Runnable{

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            System.out.println(LocalDateTime.now().format(dtf));
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("I've been interrupted while i was zZzZz");
                return;
            }
        }

        System.out.println("EEEEEEEY, Who interrupted mee! (Im the secondary thread)");
    }
}
