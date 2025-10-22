import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Elementos_Básicos extends JFrame implements ActionListener{

    private JButton button_suma, button_resta, button_multiplicación, button_división, button_reiniciar;
    //private JLabel ;
    private JTextField entradas;

    int num1 = 0;
    int num2 = 0;
    int result = 0;

    public Elementos_Básicos() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(0,255,0));

        entradas = new JTextField();
        entradas.setBounds(130,40,255,25);
        entradas.setBackground(new Color(224,224,224));
        entradas.setFont(new Font("Andale Mono", 1, 14));
        entradas.setForeground(new Color(255,0,0));
        add(entradas);

        button_suma = new JButton("+");
        button_suma.setBounds(20,20,50,50);
        button_suma.setBackground(new Color(0,0,0));
        button_suma.setFont(new Font("Andale Mono", 1, 18));
        button_suma.setForeground(new Color(255,255,255));
        button_suma.addActionListener(this);
        add(button_suma);

        button_resta = new JButton("-");
        button_resta.setBounds(20,70,50,50);
        button_resta.setBackground(new Color(0,0,0));
        button_resta.setFont(new Font("Andale Mono", 1, 18));
        button_resta.setForeground(new Color(255,255,255));
        //suma.addActionListener(this);
        add(button_resta);

        button_multiplicación = new JButton("*");
        button_multiplicación.setBounds(20,120,50,50);
        button_multiplicación.setBackground(new Color(0,0,0));
        button_multiplicación.setFont(new Font("Andale Mono", 1, 18));
        button_multiplicación.setForeground(new Color(255,255,255));
        //suma.addActionListener(this);
        add(button_multiplicación);

        button_división = new JButton("/");
        button_división.setBounds(20,170,50,50);
        button_división.setBackground(new Color(0,0,0));
        button_división.setFont(new Font("Andale Mono", 1, 18));
        button_división.setForeground(new Color(255,255,255));
        //suma.addActionListener(this);
        add(button_división);


    }

    public void actionPerformed( ActionEvent evento){
        if (evento.getSource() == button_suma) {
            if (entradas.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar un número");
            }   else {
                num1 = Integer.parseInt(entradas.getText().trim());
                entradas.setText("");

            }
        }
    }

    public static void main(String args[]) {
        Elementos_Básicos elementos_básicos = new Elementos_Básicos();
        elementos_básicos.setBounds(0, 0, 550, 550);
        elementos_básicos.setVisible(true);
        elementos_básicos.setResizable(false);
        elementos_básicos.setLocationRelativeTo(null);
    }
}