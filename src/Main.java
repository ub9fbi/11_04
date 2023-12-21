import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

class Rectangle {
    int x1, y1, x2, y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

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

class FilledRectangle extends Rectangle {
    String text;
    Color fillColor;

    public FilledRectangle(int x1, int y1, int x2, int y2, String text, Color fillColor) {
        super(x1, y1, x2, y2);
        this.text = text;
        this.fillColor = fillColor;
    }

    public int calculatePerimeterAndDiagonal() {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        int perimeter = 2 * (width + height);
        int diagonal = (int) Math.sqrt(width * width + height * height);
        return perimeter + diagonal;
    }

    public void drawFilledRectangle() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Filled Rectangle");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = image.createGraphics();

            g2d.setColor(fillColor);
            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            g2d.fillRect(x1, y1, width, height);
            g2d.setColor(Color.BLACK);
            g2d.drawRect(x1, y1, width, height);
            g2d.drawString(text, x1, y1 + height + 15);

            ImageIcon icon = new ImageIcon(image);
            JLabel label = new JLabel(icon);

            frame.getContentPane().add(label);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

public class Main {
    public static void main(String[] args) {
        int x1, y1, x2, y2;

        // Ввод координат с клавиатуры
        JPanel panel = new JPanel();
        JTextField x1Field = new JTextField(5);
        JTextField y1Field = new JTextField(5);
        JTextField x2Field = new JTextField(5);
        JTextField y2Field = new JTextField(5);
        panel.add(new JLabel("x1:"));
        panel.add(x1Field);
        panel.add(new JLabel("y1:"));
        panel.add(y1Field);
        panel.add(new JLabel("x2:"));
        panel.add(x2Field);
        panel.add(new JLabel("y2:"));
        panel.add(y2Field);

        int result = JOptionPane.showConfirmDialog(null, panel, "Введите координаты", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            // Получение введенных значений
            x1 = Integer.parseInt(x1Field.getText());
            y1 = Integer.parseInt(y1Field.getText());
            x2 = Integer.parseInt(x2Field.getText());
            y2 = Integer.parseInt(y2Field.getText());

            Rectangle rectangle = new Rectangle(x1, y1, x2, y2);
            FilledRectangle filledRectangle = new FilledRectangle(x1, y1, x2, y2, "Filled Rectangle", Color.GREEN);

            rectangle.drawRectangle();
            filledRectangle.drawFilledRectangle();
        } else {
            System.exit(0);
        }
    }
}
