import javax.swing.*;
import java.util.ArrayList;

public class Example_11_04 extends JFrame {
    ArrayList<Train> trainArrayList;
    private JPanel contentPane;
    private JButton buttonSec;
    private JButton buttonPlus5Sec;
    private JTextField textFieldHour;
    private JTextField textFieldMin;
    private JTextField textFieldSec;

    public Example_11_04() {
        initComponents();

    }
    private void initComponents(){

    }

    public static void main(String[] args) {
        Example_11_04 dialog = new Example_11_04();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
