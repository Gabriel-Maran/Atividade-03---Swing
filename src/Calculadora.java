import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JLabel lblResultado;
    private JButton btn1;
    private JButton btn4;
    private JButton btn7;
    private JButton btn2;
    private JButton btn3;
    private JButton btn5;
    private JButton btn6;
    private JButton btnMulti;
    private JButton btn8;
    private JButton btn9;
    private JButton btnMais;
    private JButton btnMenos;
    private JButton btnDiv;
    private JButton btn0;
    private JButton btnC;
    private JButton btn1Igual;
    private JPanel panelMain;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
    public Calculadora(){
        final Integer[] num1 = {0};
        final Integer[] qualCalculo = {0};

        btn0.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblResultado.setText(lblResultado.getText() + "0");
                    }
                }
        );
        btn1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblResultado.setText(lblResultado.getText() + "1");
                    }
                }
        );
        btn2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblResultado.setText(lblResultado.getText() + "2");
                    }
                }
        );
        btn3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblResultado.setText(lblResultado.getText() + "3");
                    }
                }
        );
        btn4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblResultado.setText(lblResultado.getText() + "4");
                    }
                }
        );
        btn5.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblResultado.setText(lblResultado.getText() + "5");
                    }
                }
        );
        btn6.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblResultado.setText(lblResultado.getText() + "6");
                    }
                }
        );
        btn7.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblResultado.setText(lblResultado.getText() + "7");
                    }
                }
        );
        btn8.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblResultado.setText(lblResultado.getText() + "8");
                    }
                }
        );
        btn9.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        lblResultado.setText(lblResultado.getText() + "9");
                    }
                }
        );
        btnMais.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        num1[0] = Integer.valueOf(lblResultado.getText());
                        lblResultado.setText(String.valueOf(num1[0]));
                        qualCalculo[0] = 1;
                    }
                }
        );
        btnMenos.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        num1[0] = Integer.valueOf(lblResultado.getText());
                        lblResultado.setText(String.valueOf(num1[0]));
                        qualCalculo[0] = 2;
                    }
                }
        );
        btnDiv.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        num1[0] = Integer.valueOf(lblResultado.getText());
                        lblResultado.setText(String.valueOf(num1[0]));
                        qualCalculo[0] = 3;
                    }
                }
        );
        btnMulti.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                            num1[0] = Integer.valueOf(lblResultado.getText());
                            lblResultado.setText(String.valueOf(num1[0]+"0"));
                            qualCalculo[0] = 4;

                    }
                }
        );

    }

}

