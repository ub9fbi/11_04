import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.time.LocalTime;

public class Time {
    int hour;
    int min;
    int sec;

    public int sumTimeSecond() {
        return (hour * 3600) + (min * 60) + sec;
    }

    public void sumFiveSecond() {
        LocalTime localTime = LocalTime.of(hour,min,sec);
        System.out.println(localTime.plusSeconds(5));
    }
}
