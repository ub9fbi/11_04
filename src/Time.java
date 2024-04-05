import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.time.LocalTime;

public class Time {
    int hour;
    int min;
    int sec;
    LocalTime localTime = LocalTime.of(hour,min);

    public void sumTimeSecond() {
         sec = (hour * 3600) + (min * 60);
    };

    public void sumFiveSecond() {
        localTime.plusSeconds(5);
    }
}
