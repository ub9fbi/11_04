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
    private JTextField jTextFieldMinDepartTrain;
    private JTextField jTextFieldHourDepartTrain;

    public Example_11_04() {
        trainArrayList = new ArrayList<Train>();
        currentInd = trainArrayList.size() -1;

        jLabelTitleTime = new javax.swing.JLabel();//

        jLabelHour = new javax.swing.JLabel();//
        jLabelMin = new javax.swing.JLabel();//
        jLabelSec = new javax.swing.JLabel();//
        jTextFieldTimeHour = new javax.swing.JTextField();//
        jTextFieldTimeMin = new javax.swing.JTextField();//
        jTextFieldTimeSec = new javax.swing.JTextField();//
        jSpinnerCrn = new javax.swing.JSpinner();//
        jTextFieldCount = new javax.swing.JTextField();//
        jButtonNewTrain = new javax.swing.JButton();//
        jButtonDeleteTrain = new javax.swing.JButton();//
        jButtonCalcTimeSeconds = new javax.swing.JButton();//
        jButtonPlus_5_sec = new javax.swing.JButton();//

        jLabelNumbTrain = new javax.swing.JLabel();//
        jLabelDirect = new javax.swing.JLabel();//
        jTextNumbTrain = new javax.swing.JTextField();//
        jTextDirectTrain = new javax.swing.JTextField();//

        jLabelTrainDepartureTime = new javax.swing.JLabel();//

        jLabelDepartHour = new javax.swing.JLabel();//
        jLabelDepartMin = new javax.swing.JLabel();//
        jTextFieldHourDepartTrain = new javax.swing.JTextField();//
        jTextFieldMinDepartTrain = new javax.swing.JTextField();//

        jLabelDepartureTime = new javax.swing.JLabel();//

        jLabelDepart = new javax.swing.JLabel();//

        jTextFieldMinutesBeforeTrainDeparts = new javax.swing.JTextField();//
        jButtonCalcDeparTime = new javax.swing.JButton();//



        // слушатель для кнопки + 5 сек
        jButtonPlus_5_sec.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlus_5_sec(evt);
            }
        });
        /*//слушатель окна часа
        jTextFieldTimeHour.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {


            }
        });*/
        /*// слушатель окна минут
        jTextFieldTimeMin.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });*/
        /*// слушатель окна секунд
        jTextFieldTimeSec.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });*/
        // слушатель счетчика JSpinnerCrn
        jSpinnerCrn.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
        /*// слушатель окна вывода количества элементов в списке
        jTextFieldCount.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });*/
        // слушатель кнопки New
        jButtonNewTrain.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewTrainActionPerformed(evt);
            }
        });
        // слушатель кнопки Del
        jButtonDeleteTrain.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteTrainActoinPerformed(evt);
            }
        });
        // слушатель кнопки расчета секунд
        jButtonCalcTimeSeconds.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        // слушатель окна ввода номера поезда
        jTextNumbTrain.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        // слушатель окна ввода направления поезда
        jTextDirectTrain.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        // слушатель окна ввода отправления поезда часах
        jTextFieldHourDepartTrain.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        // слушатель окна ввода отправления поезда в минутах
        jTextFieldMinDepartTrain.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        // слушатель окна вывода минут до отправления поезда
        jTextFieldMinutesBeforeTrainDeparts.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMinutesBeforeTrainDeparts(evt);
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
        if ((currentInd >= 0) && (jTextFieldTimeHour.getText() != null)) {
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
    //  обработчик для кнопки "New"
    public void jButtonNewTrainActionPerformed(ActionEvent e) {
        setTrain();
        trainArrayList.add(new Train());
        currentInd = trainArrayList.size()-1;
        getTrain();
        jTextFieldCount.setText("" + (currentInd + 1));
        jSpinnerCrn.setValue(currentInd);
    }
    //  обработчик для кнопки Delete
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
    // вызов метода из класса Train
    public void jTextFieldMinutesBeforeTrainDeparts(ActionEvent evt) {
        setTrain();
        for (int i = 0; i < trainArrayList.size(); i++) {
            trainArrayList.get(i).calculateMinutesToDeparture();
        }
    }

    public void jButtonPlus_5_sec(ActionEvent e) {
        setTrain();
        for (int i = 0; i < trainArrayList.size(); i++) {
            trainArrayList.get(i).sumFiveSecond();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example_11_04");
        frame.setContentPane(new Example_11_04().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
