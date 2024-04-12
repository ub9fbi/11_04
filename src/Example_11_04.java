import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
    private JFormattedTextField jFormattedTextTimeSec;
    private JFormattedTextField jFormattedTextNumbTrain;
    private JFormattedTextField jFormattedTextDirectTrain;
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

    public Example_11_04() {
        initComponents();
        trainArrayList = new ArrayList<Train>();
        currentInd = trainArrayList.size() -1;



    }

    private void initComponents() {
        jTextFieldTimeHour = new javax.swing.JTextField();
        jTextFieldTimeMin = new javax.swing.JTextField();
        jFormattedTextTimeSec = new javax.swing.JFormattedTextField();
        jFormattedTextNumbTrain = new javax.swing.JFormattedTextField();
        jFormattedTextDirectTrain = new javax.swing.JFormattedTextField();
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
    protected void getTrain() {
        if (currentInd >= 0) {
            jTextFieldTimeHour.setText(String.valueOf(trainArrayList.get(currentInd).hour));
            jTextFieldTimeMin.setText(String.valueOf(trainArrayList.get(currentInd).min));
            jFormattedTextTimeSec.setText("" + trainArrayList.get(currentInd).sec);
            jFormattedTextNumbTrain.setText("" + trainArrayList.get(currentInd).trainNumber);
            jFormattedTextDirectTrain.setText("" + trainArrayList.get(currentInd).directionTrain);
            jFormattedTextHourDepartTrain.setText("" + trainArrayList.get(currentInd).departureHour);
            jFormattedTextMinDepartTrain.setText("" + trainArrayList.get(currentInd).departureMin);
        }
    }
    protected void setTrain() {
        if ((currentInd >= 0) && ((jTextFieldTimeHour.getText() != null) && (jTextFieldTimeMin.getText() != null))) {
            trainArrayList.get(currentInd).hour = Integer.parseInt(jTextFieldTimeHour.getText());
            trainArrayList.get(currentInd).min = Integer.parseInt(jTextFieldTimeMin.getText());
            try {
                trainArrayList.get(currentInd).sec = new Integer(jFormattedTextTimeSec.getText());
            } catch (Exception e) {
                trainArrayList.get(currentInd).sec = 0;
                jFormattedTextTimeSec.setText(null);
            }
            try {
                trainArrayList.get(currentInd).trainNumber = new Integer(jFormattedTextNumbTrain.getText());
            } catch (Exception e) {
                trainArrayList.get(currentInd).trainNumber = 0;
                jFormattedTextNumbTrain.setText(null);
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
