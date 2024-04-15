import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JTextField jTextNumbTrain;
    private JFormattedTextField jFormattedTextHourDepartTrain;
    private JFormattedTextField jFormattedTextMinDepartTrain;
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
    private javax.swing.JPanel JPanel;
    private JTextField jTextFieldMinutesBeforeTrainDeparts;
    private JLabel jLabelDepart;
    private JLabel jLabelTrainDepartureTime;
    private JTextField jTextDirectTrain;

    public Example_11_04() {
        initComponents();
        trainArrayList = new ArrayList<Train>();
        currentInd = trainArrayList.size() -1;
    }

    private void initComponents() {
        jTextFieldTimeHour = new javax.swing.JTextField();
        jTextFieldTimeMin = new javax.swing.JTextField();
        jTextFieldTimeSec = new javax.swing.JTextField();
        jTextNumbTrain = new javax.swing.JTextField();
        jTextDirectTrain = new javax.swing.JTextField();
        jFormattedTextHourDepartTrain = new javax.swing.JFormattedTextField();
        jFormattedTextMinDepartTrain = new javax.swing.JFormattedTextField();
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
        jTextFieldCount = new javax.swing.JTextField();
        jSpinnerCrn = new javax.swing.JSpinner();
        jTextFieldMinutesBeforeTrainDeparts = new javax.swing.JTextField();
        jLabelDepart = new javax.swing.JLabel();
        jLabelTrainDepartureTime = new javax.swing.JLabel();

        jTextFieldCount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        jButtonNewTrain.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewTrainActionPerformed(evt);
            }
        });

        jButtonDeleteTrain.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteTrainActoinPerformed(evt);
            }
        });
        jButtonCalcTimeSeconds.addActionListener(new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcTimeSeconds(evt);
            }
        });
        jSpinnerCrn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCrnStateChanged(evt);
            }

        });

    }
    // метод для копирования из обьекта в поля формы
    protected void getTrain() {
        if (currentInd >= 0) {
            jTextFieldTimeHour.setText(String.valueOf(trainArrayList.get(currentInd).hour));
            jTextFieldTimeMin.setText(String.valueOf(trainArrayList.get(currentInd).min));
            jTextFieldTimeSec.setText("" + trainArrayList.get(currentInd).sec);
            jTextNumbTrain.setText("" + trainArrayList.get(currentInd).trainNumber);
            jTextDirectTrain.setText("" + trainArrayList.get(currentInd).directionTrain);
            jFormattedTextHourDepartTrain.setText("" + trainArrayList.get(currentInd).departureHour);
            jFormattedTextMinDepartTrain.setText("" + trainArrayList.get(currentInd).departureMin);
        }
    }
    // метод для записи в поля обьекта из текстовых полей формы
    protected void setTrain() {
        if ((currentInd >= 0) && ((jTextFieldTimeHour.getText() != null) && (jTextFieldTimeMin.getText() != null))) {
            trainArrayList.get(currentInd).hour = Integer.parseInt(jTextFieldTimeHour.getText());
            trainArrayList.get(currentInd).min = Integer.parseInt(jTextFieldTimeMin.getText());
            try {
                trainArrayList.get(currentInd).sec = new Integer(jTextFieldTimeSec.getText());
            } catch (Exception e) {
                trainArrayList.get(currentInd).sec = 0;
                jTextFieldTimeSec.setText(null);
            }
            try {
                trainArrayList.get(currentInd).trainNumber = new Integer(jTextNumbTrain.getText());
            } catch (Exception e) {
                trainArrayList.get(currentInd).trainNumber = 0;
                jTextNumbTrain.setText(null);
            }
        }
    }
    //  обработчик для кнопки "Новое"
    public void jButtonNewTrainActionPerformed(ActionEvent e) {
        setTrain();
        trainArrayList.add(new Train());
        currentInd = trainArrayList.size()-1;
        getTrain();
        jTextFieldCount.setText("" + (currentInd + 1));
        jSpinnerCrn.setValue(currentInd);
    }
    //  обработчик для кнопки удаления
    private void jButtonDeleteTrainActoinPerformed (ActionEvent evt) {
        trainArrayList.remove(currentInd);
        currentInd = trainArrayList.size()-1;
        if (currentInd == trainArrayList.size()) {
            currentInd--;
            jSpinnerCrn.setValue(currentInd);
        } else {
            getTrain();
        }
        jTextFieldCount.setText("" + trainArrayList.size());
    }
    // обработчик для кнопки расчета времени в секундах
    private void jButtonCalcTimeSeconds (ActionEvent evt) {
        setTrain();
        for (int i = 0; i < trainArrayList.size(); i++) {
            trainArrayList.get(i).sumTimeSecond();
        }
        getTrain();
    }
    public void jSpinnerCrnStateChanged(ChangeEvent e) {
        setTrain();
        currentInd = (int) jSpinnerCrn.getValue();
        if (currentInd > trainArrayList.size() - 1) {
            currentInd = trainArrayList.size() - 1;
            jSpinnerCrn.setValue(currentInd);

        } else if (currentInd < 0) {
            currentInd = 0;
            jSpinnerCrn.setValue(currentInd);
        }
        getTrain();

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example_11_04");
        frame.setContentPane(new Example_11_04().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
