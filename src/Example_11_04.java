import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Example_11_04 extends JFrame{
    ArrayList<Train> trainArrayList;
    private int currentInd;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton jButtonNew;
    private JButton jButtonDelete;
    private JButton jButtonCalcTimeSeconds;
    private JButton jButtonPlus_5_sec;
    private JTextField textField4;
    private JSpinner spinner1;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField8;
    private JTextField textField9;
    private JButton jButtonCalcDeparTime;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;

    public Example_11_04() {
        initComponents();
        trainArrayList = new ArrayList<Train>();
        currentInd=-1;
    }

    private void initComponents() {

    }
}
