import javax.swing.*;
import java.util.ArrayList;

public class Example_11_04 extends JFrame {
    ArrayList<Train> trainArrayList;
    int currentInd;
    private JPanel contentPane;
    private JFormattedTextField JFormattedTextFieldSec;
    private JFormattedTextField JFormattedTextFieldDir;
    private JFormattedTextField JFormattedTextFieldTrainNumb;
    private JButton buttonSec; // кнопка вызова метода sumTimeSecond, производит расчет времени в секундах
    private JButton buttonPlus5Sec; // кнопка вызова метода sumFiveSecond, добавляет 5 секунд к введенному времмени
    private JButton buttonDepartureTime;    // расчет количества минут до отправления поезда
    private JTextField JtextFieldHour;   // окно ввода часов
    private JTextField JtextFieldMin;    // окно ввода минут
    private JTextField JtextFieldSec;    // окно ввода секунд
    private JTextField JtextFieldNumbTrain; // окно ввода номера поезда
    private JTextField JtextFieldDirection;  // окно ввода направления
    private JTextField JtextFieldDepartureTime;  // время отправления
    private JSpinner JSpinnerCrn;
    private JTextField JTextFieldCount; // вывод номера
    private JButton JButtonNewTrain; // добавить новый поезд
    private JButton JbuttonDelTrain; // удалить поезд

    public Example_11_04() {
        initComponents();
        trainArrayList = new ArrayList<Train>();
        currentInd = -1;
    }
    private void initComponents(){


    }
    // копирование данных из текущего обьекта списка в поля формы и обратно
    protected void getTrain() {
        if (currentInd >= 0) {
            JtextFieldHour.setText(String.valueOf(trainArrayList.get(currentInd).hour));
            JtextFieldMin.setText(String.valueOf(trainArrayList.get(currentInd).min));
            JFormattedTextFieldSec.setText("" + trainArrayList.get(currentInd).sec);
            JFormattedTextFieldDir.setText("" + trainArrayList.get(currentInd).directionTrain);
            JFormattedTextFieldTrainNumb.setText("" + trainArrayList.get(currentInd).trainNumber);
        }

    }
    protected void setTrain () {
        if (((currentInd >= 0) && JtextFieldHour.getText() != null ) && ((currentInd >= 0) && JtextFieldMin.getText() != null)
                && ((currentInd >= 0) && JtextFieldSec.getText() != null)) {
            trainArrayList.get(currentInd).hour = Integer.parseInt(JtextFieldHour.getText());
            trainArrayList.get(currentInd).min = Integer.parseInt(JtextFieldMin.getText());
            try {
                trainArrayList.get(currentInd).sec = new Integer(JtextFieldSec.getText());
            } catch (Exception e) {
                trainArrayList.get(currentInd).sec = 0;
                JtextFieldHour.setText(null);
            }
            try {
                trainArrayList.get(currentInd).trainNumber = new Integer(JFormattedTextFieldTrainNumb.getText());

            } catch (Exception e) {
                trainArrayList.get(currentInd).trainNumber = 0;
                JFormattedTextFieldTrainNumb.setText(null);
            }
            try {
                trainArrayList.get(currentInd).directionTrain = String.valueOf(new Integer(JtextFieldDirection.getText()));
            }
            catch (Exception e) {
                trainArrayList.get(currentInd).directionTrain = String.valueOf(0);
                JtextFieldDirection.setText(null);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Задание_11_04");
        frame.setContentPane(new Example_11_04().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
