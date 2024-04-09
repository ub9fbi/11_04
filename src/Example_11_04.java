import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.ArrayList;

public class Example_11_04 extends JFrame {
    ArrayList<Train> trainArrayList;
    int currentInd;
    private JPanel contentPane;
    private JFormattedTextField JFormattedTextFieldSec;
    private JFormattedTextField JFormattedTextFieldTrainNumb;
    private JButton JbuttonSec; // кнопка вызова метода sumTimeSecond, производит расчет времени в секундах
    private JButton JbuttonPlus5Sec; // кнопка вызова метода sumFiveSecond, добавляет 5 секунд к введенному времмени
    private JButton JbuttonDepartureTime;    // расчет количества минут до отправления поезда
    private JTextField JtextFieldHour;      // окно ввода часов
    private JTextField JtextFieldMin;   // окно ввода минут
    private JTextField JtextFieldSec;    // окно ввода секунд
    private JTextField JtextFieldNumbTrain;     // окно ввода номера поезда
    private JTextField JtextFieldDirection;     // окно ввода направления
    private JTextField JtextFieldDepartureTime;     // время отправления
    private JSpinner JSpinnerCrn;
    private JTextField JTextFieldCount;     // вывод номера
    private JButton JButtonNewTrain;    // добавить новый поезд
    private JButton JbuttonDelTrain;    // удалить поезд

    public Example_11_04() {
        initComponents();
        trainArrayList = new ArrayList<Train>();
        currentInd = -1;

        // действие при нажатий на кнопку "новый"
        JButtonNewTrain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTrain();
                trainArrayList.add(new Train());
                currentInd = trainArrayList.size()-1;
                getTrain();
                JTextFieldCount.setText(""+(currentInd+1));
                JSpinnerCrn.setValue(currentInd);
            }
        });

        //  действие при нажатий "Удалить"
        JbuttonDelTrain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trainArrayList.remove(currentInd);
                currentInd=trainArrayList.size()-1;
                if (currentInd==trainArrayList.size()){
                    currentInd--;
                    JSpinnerCrn.setValue(currentInd);
                } else {
                    getTrain();
                }
                JTextFieldCount.setText(""+trainArrayList.size());

            }
        });

        //  Реакция на изменение счетчика в списке
        //  Для управления списком нужно также запрограммировать реакцию на изменение в счетчике   JSpinnerCrn,
        //  счетчик указывает номер текущего элемента в списке.
        JSpinnerCrn.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                setTrain(); //  •	Выполняется метод setPerson(), чтобы  записать в поля текущего объекта списка данные из текстовых полей формы.
                currentInd = (int) JSpinnerCrn.getValue();  //  Присвоим новое значение переменной currentInd, которая хранит номер текущего объекта, значение. Значение берется из компонента jSpinnerCrn
                if (currentInd >= trainArrayList.size()) {  /*•	Проверяем значение переменной currentInd на ее допустимость:
                                                                номер текущего объекта не может быть больше или равен  количеству элементов  в списке
                                                                номер текущего объекта не может быть меньше нуля */
                    currentInd = trainArrayList.size()-1;
                    JSpinnerCrn.setValue(currentInd);
                } else if (currentInd < 0) {
                    currentInd = 0;
                    JSpinnerCrn.setValue(currentInd);
                }
                getTrain(); //  Выполняется метод getPerson(), чтобы скопировать  данных из текущего объекта списка в поля формы.

            }
        });

        //  привязка выполнениия метода sumTimeSecond к нажатию кнопки
        JbuttonSec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTrain(); //  Выполняется метод setTrain для  копирования  в поля текущего объекта данных из текстовых полей формы.
                for (int i = 0; i < trainArrayList.size(); i++) {   //  В цикле для каждого элемента списка выполняем метод sumTimeSecond (перевод времени в секнды)
                    trainArrayList.get(i).sumTimeSecond();
                }
                getTrain(); //  Выполняется метод getTrain, чтобы показать измененное время

            }
        });

        // привязка выполнения sumFiveSecond при нажатий на кнопку
        JbuttonPlus5Sec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < trainArrayList.size(); i++) {
                    trainArrayList.get(i).sumFiveSecond();
                }

            }
        });
    }
    private void initComponents(){
        JFormattedTextFieldSec = new JFormattedTextField();
        JFormattedTextFieldTrainNumb = new JFormattedTextField();
        JtextFieldHour = new JTextField();
        JtextFieldMin = new JTextField();
        JtextFieldSec = new JTextField();
        JtextFieldNumbTrain = new JTextField();
        JtextFieldDirection = new JTextField();
        JtextFieldDepartureTime = new JTextField();
        JTextFieldCount = new JTextField();
        JSpinnerCrn = new JSpinner();
        JbuttonSec = new JButton();
        JbuttonPlus5Sec = new JButton();
        JbuttonDepartureTime = new JButton();
        JButtonNewTrain = new JButton();
        JbuttonDelTrain = new JButton();
    }
    // возврат данных из текущего обьекта списка в поля формы
    protected void getTrain() {
        if (currentInd >= 0) {
            JtextFieldHour.setText(String.valueOf(trainArrayList.get(currentInd).hour));
            JtextFieldMin.setText(String.valueOf(trainArrayList.get(currentInd).min));
            JFormattedTextFieldSec.setText("" + trainArrayList.get(currentInd).sec);
            JtextFieldDirection.setText("" + trainArrayList.get(currentInd).directionTrain);
            JFormattedTextFieldTrainNumb.setText("" + trainArrayList.get(currentInd).trainNumber);
        }
    }
    //  запись в поля текущего обьекта данные из текстовых полей формы
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
        JFrame frame = new JFrame("Example_11_04");
        frame.setContentPane(new Example_11_04().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
