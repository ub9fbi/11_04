import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Rectangle {
    public int x1, x2, y1, y2;

    //  Метод определяющий является ли прямоугольник квадратом
    public boolean isSquare() {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        return width == height;
    }
    public void drawRectangle() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Rectangle");
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
        });
    }
}
