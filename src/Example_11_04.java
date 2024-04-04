import javax.swing.*;
import java.util.ArrayList;

public class Example_11_04 extends JFrame {
    ArrayList<Train> trainArrayList;
    int currentInd;
    private JPanel contentPane;
    private JFormattedTextField JFormattedTextFieldSec;
    private JFormattedTextField JFormattedTextField;

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
    private JButton JButtonNewTime; // добавить новое время
    private JButton JbuttonDelTime; // удалить время

    public Example_11_04() {
        initComponents();
        trainArrayList = new ArrayList<Train>();
        currentInd = -1;
    }
    private void initComponents(){


    }
    protected void getTrain() {
        if (currentInd >= 0) {
            JtextFieldHour.setText(String.valueOf(trainArrayList.get(currentInd).hour));
            JtextFieldMin.setText(String.valueOf(trainArrayList.get(currentInd).min));
            JtextFieldSec.setText(String.valueOf(trainArrayList.get(currentInd).sec));
            JFormattedTextFieldSec.setText("" + trainArrayList.get(currentInd).sec);
            JFormattedTextField.setText("" + trainArrayList.get(currentInd).);

        }

    }

    public static void main(String[] args) {
        Example_11_04 dialog = new Example_11_04();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
