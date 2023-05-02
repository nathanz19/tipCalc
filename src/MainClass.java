import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;

public class MainClass extends JFrame implements ActionListener, KeyListener {
    private JPanel TipCalculator;
    private JLabel BillLabel;
    private JTextField answerBL;
    private JTextField answerTipL;
    private JTextField answerNP;
    private JButton subtractTip;
    private JButton addTip;
    private JButton subtractPpl;
    private JButton addPpl;
    private JLabel TipLabel;
    private JLabel NPLabel;
    private JTextField resultTip;
    private JLabel totalTipLabel;
    private JLabel totalLabel;
    private JTextField resultTotal;
    private JButton calculateButton;

    private TipCalculator tipC;
    private double numOfPeople;
    private double tipPercentage;
    private double bill;

    public MainClass() {
        createUIComponents();
    }

    public void createUIComponents() {
        setContentPane(TipCalculator);
        setTitle("My GUI!");
        setSize(600, 400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        subtractTip.addActionListener(this);
        addTip.addActionListener(this);
        subtractPpl.addActionListener(this);
        addPpl.addActionListener(this);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String text = button.getText();
            if (button.equals(addTip)) {
                double value = Double.parseDouble(answerTipL.getText());
                value+=0.5;
                answerTipL.setText(value + "");
                tipPercentage = Double.parseDouble(answerTipL.getText());

            }
            if (button.equals(subtractTip)) {
                double value = Double.parseDouble(answerTipL.getText());
                if (value >= 0.5) {
                    value -= 0.5;
                    answerTipL.setText(value + "");
                }
                tipPercentage = Double.parseDouble(answerTipL.getText());
            }
            if (button.equals(addPpl)) {
                double value = Double.parseDouble(answerNP.getText());
                value+=0.5;
                answerNP.setText(value + "");
                numOfPeople = Double.parseDouble(answerNP.getText());
            }
            if (button.equals(subtractPpl)) {
                double value = Double.parseDouble(answerNP.getText());
                if (value >= 0.5) {
                    value -= 0.5;
                    answerNP.setText(value + "");
                }
                numOfPeople = Double.parseDouble(answerNP.getText());
            }
            if (button.equals(calculateButton)) {
                bill = Double.parseDouble(answerBL.getText());
                tipC = new TipCalculator(bill, tipPercentage, numOfPeople);
                resultTip.setText(tipC.calculateTip() + "");
                resultTotal.setText(tipC.totalBill() + "");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
