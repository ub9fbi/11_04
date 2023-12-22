import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


class FilledRectangle {
        String text;
        Color fillColor;

        public FilledRectangle(int x1, int y1, int x2, int y2, String text, Color fillColor) {
            super();
            this.text = text;
            this.fillColor = fillColor;
        }

        public int calculatePerimeterAndDiagonal(int x2, int x1, int y2, int y1) {
            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            int perimeter = 2 * (width + height);
            int diagonal = (int) Math.sqrt(width * width + height * height);
            return perimeter + diagonal;
        }

        public void drawFilledRectangle(int x2, int x1, int y2, int y1) {
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

