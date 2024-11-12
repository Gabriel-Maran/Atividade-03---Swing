import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtResultado;
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
    private JButton btnIgual;
    private JPanel panelMain;
    private Integer num1 = null;
    private Integer num2 = null;
    private Integer qualCalculo = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha calculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public Calculadora(){
        btn0.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText(txtResultado.getText() + "0");
                    }
                }
        );
        btn1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText(txtResultado.getText() + "1");
                    }
                }
        );
        btn2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText(txtResultado.getText() + "2");
                    }
                }
        );
        btn3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText(txtResultado.getText() + "3");
                    }
                }
        );
        btn4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText(txtResultado.getText() + "4");
                    }
                }
        );
        btn5.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText(txtResultado.getText() + "5");
                    }
                }
        );
        btn6.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText(txtResultado.getText() + "6");
                    }
                }
        );
        btn7.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText(txtResultado.getText() + "7");
                    }
                }
        );
        btn8.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText(txtResultado.getText() + "8");
                    }
                }
        );
        btn9.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText(txtResultado.getText() + "9");
                    }
                }
        );
        btnMais.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(qualCalculo == 0){
                            num1 = Integer.valueOf(txtResultado.getText());
                            txtResultado.setText(String.valueOf(num1));
                            qualCalculo = 1;
                            txtResultado.setText("");
                        }
                    }
                }
        );
        btnMenos.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(qualCalculo == 0){
                            num1 = Integer.valueOf(txtResultado.getText());
                            txtResultado.setText(String.valueOf(num1));
                            qualCalculo = 2;
                            txtResultado.setText("");
                        }

                    }
                }
        );
        btnDiv.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(qualCalculo == 0){
                            num1 = Integer.valueOf(txtResultado.getText());
                            txtResultado.setText(String.valueOf(num1));
                            qualCalculo = 3;
                            txtResultado.setText("");
                        }
                    }
                }
        );
        btnMulti.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(qualCalculo == 0){
                            num1 = Integer.valueOf(txtResultado.getText());
                            txtResultado.setText(String.valueOf(num1));
                            qualCalculo = 4;
                            txtResultado.setText("");
                        }

                    }
                }
        );
        btnIgual.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(num1 != null && qualCalculo != 0){
                            num2 = Integer.valueOf(txtResultado.getText());
                            if(qualCalculo == 1){
                                txtResultado.setText(String.valueOf(num1 + num2));
                            }else if(qualCalculo == 2){
                                txtResultado.setText(String.valueOf(num1 - num2));
                            }else if(qualCalculo == 3){
                                if(num2 == 0){
                                    txtResultado.setText("Divisão por 0");
                                }else{
                                    txtResultado.setText(String.valueOf(Double.valueOf(num1) / Double.valueOf(num2)));
                                }
                            }else if(qualCalculo == 4){
                                txtResultado.setText(String.valueOf(num1 * num2));
                            }
                        }

                    }
                }
        );
        btnC.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        txtResultado.setText("");
                        num1 = null;
                        num2 = null;
                        qualCalculo = 0;
                    }
                }
        );

    }

}