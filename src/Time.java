import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Time {
    int hour;
    int min;
    int sec;

    public int sumTimeSecond() {
        return hour * 3600 + min * 30 + sec;
    }

    public void sumFiveSecond() {
        int sumFiveSecond = sumTimeSecond();
        sumFiveSecond += 5;
        System.out.println(sumFiveSecond);
    }
}
