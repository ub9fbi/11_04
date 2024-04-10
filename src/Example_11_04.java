import javax.swing.*;
import java.util.ArrayList;

public class Example_11_04 extends JFrame {
    //  массив для хранения поездов
    ArrayList<Train> trainArrayList;
    //  переменная хранит номер текущего обьекта из списка trainArrayList
    private int currentInd;
    //  поля ввода
    private JTextField jTextFieldTimeHour;
    private JTextField jTextFieldTimeMin;
    private JTextField jTextFieldTimeSec;
    private JTextField jTextFieldNumbTrain;
    private JTextField jTextFieldDirectTrain;
    private JTextField jTextFieldHourDepartTrain;
    private JTextField jTextFieldMinDepartTrain;
    private JTextField jTextFieldCount;
    private JButton jButtonNewTrain;
    private JButton jButtonDeleteTrain;
    private JButton jButtonCalcTimeSeconds;
    private JButton jButtonPlus_5_sec;
    private JButton jButtonCalcDeparTime;
    private JLabel jLabelTitleTime;
    private JLabel jLabelHour;
    private JLabel jLabelMin;
    private JLabel jLabelSec;
    private JLabel jLabelDepartureTime;
    private JLabel jLabelNumbTrain;
    private JLabel jLabelDirect;
    private JLabel jLabelDepartHour;
    private JLabel jLabelDepartMin;
    private JSpinner jSpinnerCrn;

    public Example_11_04() {
        initComponents();
        trainArrayList = new ArrayList<Train>();
        currentInd=-1;
    }

    private void initComponents() {
        jTextFieldTimeHour = new javax.swing.JTextField();
        jTextFieldTimeMin = new javax.swing.JTextField();
        jTextFieldTimeSec = new javax.swing.JTextField();
        jTextFieldNumbTrain = new javax.swing.JTextField();
        jTextFieldDirectTrain = new javax.swing.JTextField();
        jTextFieldHourDepartTrain = new javax.swing.JTextField();
        jTextFieldMinDepartTrain = new javax.swing.JTextField();
        jTextFieldCount = new javax.swing.JTextField();
        jButtonNewTrain = new javax.swing.JButton();
        jButtonDeleteTrain = new javax.swing.JButton();
        jButtonCalcTimeSeconds = new javax.swing.JButton();
        jButtonPlus_5_sec = new javax.swing.JButton();
        jButtonCalcDeparTime = new javax.swing.JButton();
        jLabelTitleTime = new javax.swing.JLabel();
        jLabelHour = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelSec = new javax.swing.JLabel();
        jLabelDepartureTime = new javax.swing.JLabel();
        jLabelNumbTrain = new javax.swing.JLabel();
        jLabelDirect = new javax.swing.JLabel();
        jLabelDepartHour = new javax.swing.JLabel();
        jLabelDepartMin = new javax.swing.JLabel();
        jSpinnerCrn = new javax.swing.JSpinner();
    }


}
