import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;

public class mainPanel extends JFrame implements ActionListener, KeyListener {
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

    public mainPanel() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("My GUI!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
