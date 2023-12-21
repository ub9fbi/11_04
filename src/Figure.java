import java.awt.*;

public class Figure {
    public int x1, x2, y1, y2;


    //
    public boolean isQuadrato() {
        double lato = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double diagonale = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        if (lato == diagonale) {
            return true;
        } else {
            return false;
        }
    }
    public void draw (Graphics g) {

    }
}
