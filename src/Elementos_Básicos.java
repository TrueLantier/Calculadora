import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Elementos_Básicos extends JFrame implements ActionListener{

    private JButton button_suma, button_resta, button_multiplicación, button_división, button_reiniciar, button_igual,
            button_salir, button_creador;
    private JLabel valoresLabel, resultadoLabel;
    private JTextField entradajTextField, resultadojTextField;

    String string_de_entrada = "";
    double primer_número, segundo_número;
    double resultado = 0;
    String operación;
    char[] nums = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    char[] caracteres = { '+', '-', '*', '/'};

    public Elementos_Básicos() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(0,255,0));

        valoresLabel = new JLabel("Valores:");
        valoresLabel.setBounds(90,15,255,25);
        valoresLabel.setFont(new Font("Andale Mono", 3, 18));
        valoresLabel.setForeground(new Color(0,0,0));
        add(valoresLabel);

        resultadoLabel = new JLabel("Resultado:");
        resultadoLabel.setBounds(90,115,255,25);
        resultadoLabel.setFont(new Font("Andale Mono", 3, 18));
        resultadoLabel.setForeground(new Color(0,0,0));
        add(resultadoLabel);

        entradajTextField = new JTextField();
        entradajTextField.setBounds(90,40,255,25);
        entradajTextField.setBackground(new Color(224,224,224));
        entradajTextField.setFont(new Font("Andale Mono", 1, 14));
        entradajTextField.setForeground(new Color(255,0,0));
        add(entradajTextField);

        resultadojTextField = new JTextField();
        resultadojTextField.setBounds(90,140,255,25);
        resultadojTextField.setBackground(new Color(224,224,224));
        resultadojTextField.setFont(new Font("Andale Mono", 1, 14));
        resultadojTextField.setForeground(new Color(255,0,0));
        add(resultadojTextField);

        button_reiniciar = new JButton("Reiniciar");
        button_reiniciar.setBounds(370,40,120,50);
        button_reiniciar.setBackground(new Color(0,0,0));
        button_reiniciar.setFont(new Font("Andale Mono", 1, 14));
        button_reiniciar.setForeground(new Color(255,255,255));
        button_reiniciar.addActionListener(this);
        add(button_reiniciar);

        button_salir = new JButton("Salir");
        button_salir.setBounds(370,140,120,50);
        button_salir.setBackground(new Color(0,0,0));
        button_salir.setFont(new Font("Andale Mono", 1, 14));
        button_salir.setForeground(new Color(255,255,255));
        button_salir.addActionListener(this);
        add(button_salir);

        button_creador = new JButton("Creador");
        button_creador.setBounds(370,240,120,50);
        button_creador.setBackground(new Color(0,0,0));
        button_creador.setFont(new Font("Andale Mono", 1, 14));
        button_creador.setForeground(new Color(255,255,255));
        button_creador.addActionListener(this);
        add(button_creador);

        button_suma = new JButton("+");
        button_suma.setBounds(20,40,50,50);
        button_suma.setBackground(new Color(0,0,0));
        button_suma.setFont(new Font("Andale Mono", 1, 20));
        button_suma.setForeground(new Color(255,255,255));
        button_suma.addActionListener(this);
        add(button_suma);

        button_resta = new JButton("-");
        button_resta.setBounds(20,90,50,50);
        button_resta.setBackground(new Color(0,0,0));
        button_resta.setFont(new Font("Andale Mono", 1, 20));
        button_resta.setForeground(new Color(255,255,255));
        //button_resta.addActionListener(this);
        add(button_resta);

        button_multiplicación = new JButton("*");
        button_multiplicación.setBounds(20,140,50,50);
        button_multiplicación.setBackground(new Color(0,0,0));
        button_multiplicación.setFont(new Font("Andale Mono", 1, 20));
        button_multiplicación.setForeground(new Color(255,255,255));
        //button_multiplicación.addActionListener(this);
        add(button_multiplicación);

        button_división = new JButton("/");
        button_división.setBounds(20,190,50,50);
        button_división.setBackground(new Color(0,0,0));
        button_división.setFont(new Font("Andale Mono", 1, 20));
        button_división.setForeground(new Color(255,255,255));
        //button_división.addActionListener(this);
        add(button_división);

        button_igual = new JButton("=");
        button_igual.setBounds(20,240,50,50);
        button_igual.setBackground(new Color(0,0,0));
        button_igual.setFont(new Font("Andale Mono", 1, 20));
        button_igual.setForeground(new Color(255,255,255));
        button_igual.addActionListener(this);
        add(button_igual);
    }

    public void actionPerformed( ActionEvent evento){

        string_de_entrada = entradajTextField.getText().trim();

        if (evento.getSource() == button_suma) {
            if (string_de_entrada.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar un número");
            }   else {
                primer_número = Integer.parseInt(entradajTextField.getText().trim());
                entradajTextField.setText("");

                //resultadojTextField.setText(String.valueOf(num1+num2));

            }
        }

        if (evento.getSource() == button_igual) {
            segundo_número = Integer.parseInt(entradajTextField.getText().trim());
            entradajTextField.setText("");
            resultado = primer_número + segundo_número;
            resultadojTextField.setText(String.valueOf(resultado));
        }

        if (evento.getSource() == button_salir) {
            System.exit(0);
        }
        if (evento.getSource() == button_creador) {
            JOptionPane.showMessageDialog(null, "Desarrollado por Angel Eduardo Pedraza Ordoñez.");
        }
        /*
        if (ingreso_nombre.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
            }
         */
    }

    public static void main(String[] args) {
        Elementos_Básicos elementos_básicos = new Elementos_Básicos();
        elementos_básicos.setBounds(0, 0, 550, 550);
        elementos_básicos.setVisible(true);
        elementos_básicos.setResizable(false);
        elementos_básicos.setLocationRelativeTo(null);
    }
}