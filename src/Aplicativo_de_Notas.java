import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicativo_de_Notas {
    private JPanel panelMain;
    private JTextField txtResultado;
    private JButton btnAddNota;
    private JTextField txtNota;
    private JButton btnCalcular;
    private JButton btnLimpar;
    private JTextField txtTabelaNotas;
    private JLabel lblTabellNotas;
    private JLabel lblResultado;
    private Double nota = 0.0;
    private Integer contador = 0;

    public Aplicativo_de_Notas(){
        btnAddNota.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            // Tenta converter a nota
                            Double aux = Double.valueOf(txtNota.getText());
                            nota += aux;
                            contador++;
                            txtNota.setText(""); // Limpa o campo para nova entrada
                            txtTabelaNotas.setText(txtTabelaNotas.getText()+contador+"ª nota: "+aux+". ");
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(panelMain, "Por favor, insira um número válido.");
                        }
                    }
                }
        );
        btnCalcular.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(contador>0){
                            txtResultado.setText(String.valueOf(nota/contador));
                        }
                    }
                }
        );
        btnLimpar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nota = 0.0;
                        contador = 0;
                        txtResultado.setText("");
                        txtTabelaNotas.setText("");
                    }
                }
        );
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicativo de Notas");
        frame.setContentPane(new Aplicativo_de_Notas().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
