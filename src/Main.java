import java.awt.*;
import javax.swing.*;


public class Example11_09JFrame extends javax.swing.JFrame {
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

        } else {
            System.exit(0);
        }
    }
}
