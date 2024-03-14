import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Time {
    int hour, min, sec;

    public int sumTimeSecond() {
        int sumTimeSecond = (hour * 3600) + (min * 30) + sec;
        return sumTimeSecond;
    }

    public void sumFiveSecond() {
        int sumFiveSecond = sumTimeSecond() + 5;
    }
}
