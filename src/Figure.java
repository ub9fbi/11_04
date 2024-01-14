import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Figure {
    int x1, y1, x2, y2;

    public Figure () {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean isSquare() {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        if (width == height) {
            return true;
        } else {
            return false;
        }

    }

    public void drawGreenRectangle() {

            JFrame frame = new JFrame("Прямоугольник");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = image.createGraphics();

            g2d.setColor(Color.GREEN);
            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            g2d.fillRect(x1, y1, width, height);
            g2d.setColor(Color.BLACK);
            g2d.drawRect(x1, y1, width, height);
            g2d.drawString("Rectangle #" + hashCode(), x1, y1 + height + 15);

            ImageIcon icon = new ImageIcon(image);
            JLabel label = new JLabel(icon);

            frame.getContentPane().add(label);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

    }
}
