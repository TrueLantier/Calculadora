import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Elementos_Básicos extends JFrame implements ActionListener{

    private JButton button_suma, button_resta, button_multiplicación, button_división, button_reiniciar, button_igual,
            button_salir, button_creador, button_cuadrado, button_raíz, button_módulo;
    private JLabel valoresLabel, resultadoLabel, historialLabel, imagenLabel;
    private JTextField entradajTextField, resultadojTextField;
    private JTextArea textarea_historial;
    private JScrollPane scroll1;

    String string_de_entrada = "";
    String string_de_resultado = "";
    String string_de_historial = "";
    double primer_número, segundo_número;
    double resultado = 0;
    String operación = "";
    char[] nums = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.'};
    boolean hay_error = true;

    public Elementos_Básicos() {

        JLabel fondo = new JLabel();
        fondo.setIcon(new ImageIcon(
                "/home/angel/Documentos/ESCUELA/Calculadora/image_calculadora/16038106_spiral-2-red.jpg"
        ));
        fondo.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CALCULADORA BÁSICA");
        getContentPane().setBackground(new Color(0,255,0));

        valoresLabel = new JLabel("Valores:");
        valoresLabel.setBounds(100,15,255,25);
        valoresLabel.setFont(new Font("Andale Mono", 3, 18));
        valoresLabel.setForeground(new Color(255,255,255));
        add(valoresLabel);

        resultadoLabel = new JLabel("Resultado:");
        resultadoLabel.setBounds(100,115,255,25);
        resultadoLabel.setFont(new Font("Andale Mono", 3, 18));
        resultadoLabel.setForeground(new Color(255,255,255));
        add(resultadoLabel);

        historialLabel = new JLabel("Historial");
        historialLabel.setBounds(20,310,255,25);
        historialLabel.setFont(new Font("Andale Mono", 3, 18));
        historialLabel.setForeground(new Color(255,255,255));
        add(historialLabel);

        entradajTextField = new JTextField();
        entradajTextField.setBounds(100,40,255,25);
        entradajTextField.setBackground(new Color(224,224,224));
        entradajTextField.setFont(new Font("Andale Mono", 1, 14));
        entradajTextField.setForeground(new Color(255,0,0));
        add(entradajTextField);

        resultadojTextField = new JTextField();
        resultadojTextField.setEditable(false); //Para que no lo puedan modificar.
        resultadojTextField.setBounds(100,140,255,25);
        resultadojTextField.setBackground(new Color(224,224,224));
        resultadojTextField.setFont(new Font("Andale Mono", 1, 14));
        resultadojTextField.setForeground(new Color(255,0,0));
        add(resultadojTextField);

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
        button_resta.addActionListener(this);
        add(button_resta);

        button_multiplicación = new JButton("*");
        button_multiplicación.setBounds(20,140,50,50);
        button_multiplicación.setBackground(new Color(0,0,0));
        button_multiplicación.setFont(new Font("Andale Mono", 1, 20));
        button_multiplicación.setForeground(new Color(255,255,255));
        button_multiplicación.addActionListener(this);
        add(button_multiplicación);

        button_división = new JButton("/");
        button_división.setBounds(20,190,50,50);
        button_división.setBackground(new Color(0,0,0));
        button_división.setFont(new Font("Andale Mono", 1, 20));
        button_división.setForeground(new Color(255,255,255));
        button_división.addActionListener(this);
        add(button_división);

        button_igual = new JButton("=");
        button_igual.setBounds(20,240,50,50);
        button_igual.setBackground(new Color(0,0,0));
        button_igual.setFont(new Font("Andale Mono", 1, 20));
        button_igual.setForeground(new Color(255,255,255));
        button_igual.addActionListener(this);
        add(button_igual);

        button_cuadrado = new JButton("2");
        button_cuadrado.setBounds(20,450, 50,50);
        button_cuadrado.setBackground(new Color(0,0,0));
        button_cuadrado.setFont(new Font("Andale Mono",1,20));
        button_cuadrado.setForeground(new Color(255,255,255));
        button_cuadrado.addActionListener(this);
        add(button_cuadrado);

        button_raíz = new JButton("√");
        button_raíz.setBounds(70,450, 50,50);
        button_raíz.setBackground(new Color(0,0,0));
        button_raíz.setFont(new Font("Andale Mono",1,20));
        button_raíz.setForeground(new Color(255,255,255));
        button_raíz.addActionListener(this);
        add(button_raíz);

        button_módulo= new JButton("%");
        button_módulo.setBounds(120,450, 50,50);
        button_módulo.setBackground(new Color(0,0,0));
        button_módulo.setFont(new Font("Andale Mono",1,18));
        button_módulo.setForeground(new Color(255,255,255));
        button_módulo.addActionListener(this);
        add(button_módulo);

        button_reiniciar = new JButton("Reiniciar");
        button_reiniciar.setBounds(390,40,120,50);
        button_reiniciar.setBackground(new Color(0,0,0));
        button_reiniciar.setFont(new Font("Andale Mono", 1, 14));
        button_reiniciar.setForeground(new Color(255,255,255));
        button_reiniciar.addActionListener(this);
        add(button_reiniciar);

        button_salir = new JButton("Salir");
        button_salir.setBounds(390,140,120,50);
        button_salir.setBackground(new Color(0,0,0));
        button_salir.setFont(new Font("Andale Mono", 1, 14));
        button_salir.setForeground(new Color(255,255,255));
        button_salir.addActionListener(this);
        add(button_salir);

        button_creador = new JButton("Creador");
        button_creador.setBounds(390,240,120,50);
        button_creador.setBackground(new Color(0,0,0));
        button_creador.setFont(new Font("Andale Mono", 1, 14));
        button_creador.setForeground(new Color(255,255,255));
        button_creador.addActionListener(this);
        add(button_creador);

        textarea_historial = new JTextArea();
        textarea_historial.setEditable(false);
        textarea_historial.setOpaque(false); // Esto funciona?
        textarea_historial.setFont(new Font("Andale Mono",1,13 ));
        textarea_historial.setForeground(new Color(255,0,0));
        scroll1 = new JScrollPane(textarea_historial);
        scroll1.setBounds(20,335,350,90);
        add(scroll1);

        add(fondo);
    }

    public void actionPerformed( ActionEvent evento){

        string_de_entrada = entradajTextField.getText();
        string_de_resultado = resultadojTextField.getText();

        if (evento.getSource() == button_suma) {
            if ( !(string_de_resultado.isEmpty()) && string_de_entrada.isEmpty() ) {
                primer_número = Double.parseDouble(string_de_resultado);
                resultadojTextField.setText("");
                operación = "+";
            }   else {
                if (string_de_entrada.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un número");
                }   else {

                    int cont_puntos = 0;
                    for_suma:    for ( int i = 0; i<string_de_entrada.length(); i++) {
                        if (string_de_entrada.charAt(i) == '.') ++cont_puntos;
                        for ( int j = 0; j< nums.length; j++) {
                            if ( (string_de_entrada.charAt(i) == nums[j]) ||
                                    string_de_entrada.charAt(0) == '-' ) {
                                hay_error = false;
                                continue for_suma;
                            }   else {
                                hay_error = true;
                            }
                        }
                        if (hay_error) break ;
                    }

                    if ( hay_error || (cont_puntos>1) || (string_de_entrada.charAt(0) == '.')
                            || (string_de_entrada.charAt( string_de_entrada.length()-1 ) == '.') ||
                            ( (string_de_entrada.charAt(0) == '-') && (string_de_entrada.charAt(1) == '.') ) ) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar el número correctamente.");
                    }   else {
                        primer_número = Double.parseDouble(string_de_entrada);
                        entradajTextField.setText("");
                        operación = "+";
                    }
                }
            }
        }

        if (evento.getSource() == button_resta) {
            if ( !(string_de_resultado.isEmpty()) && string_de_entrada.isEmpty() ) {
                primer_número = Double.parseDouble(string_de_resultado);
                resultadojTextField.setText("");
                operación = "-";
            }   else {
                if (string_de_entrada.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un número");
                }   else {

                    int cont_puntos = 0;
                    for_resta:    for ( int i = 0; i<string_de_entrada.length(); i++) {
                        if (string_de_entrada.charAt(i) == '.') ++cont_puntos;
                        for ( int j = 0; j< nums.length; j++) {
                            if ( string_de_entrada.charAt(i) == nums[j] ||
                                    string_de_entrada.charAt(0) == '-' ) {
                                hay_error = false;
                                continue for_resta;
                            }   else {
                                hay_error = true;
                            }
                        }
                        if (hay_error) break ;
                    }

                    if ( hay_error || (cont_puntos>1) || (string_de_entrada.charAt(0) == '.')
                            || (string_de_entrada.charAt( string_de_entrada.length()-1 ) == '.') ||
                            ( (string_de_entrada.charAt(0) == '-') && (string_de_entrada.charAt(1) == '.') ) ) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar el número correctamente.");
                    }   else {
                        primer_número = Double.parseDouble(string_de_entrada);
                        entradajTextField.setText("");
                        operación = "-";
                    }
                }
            }
        }

        if (evento.getSource() == button_multiplicación) {
            if ( !(string_de_resultado.isEmpty()) && string_de_entrada.isEmpty() ) {
                primer_número = Double.parseDouble(string_de_resultado);
                resultadojTextField.setText("");
                operación = "*";
            }   else {
                if (string_de_entrada.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un número");
                }   else {

                    int cont_puntos = 0;
                    for_mult:    for ( int i = 0; i<string_de_entrada.length(); i++) {
                        if (string_de_entrada.charAt(i) == '.') ++cont_puntos;
                        for ( int j = 0; j< nums.length; j++) {
                            if ( string_de_entrada.charAt(i) == nums[j] ||
                                    string_de_entrada.charAt(0) == '-' ) {
                                hay_error = false;
                                continue for_mult;
                            }   else {
                                hay_error = true;
                            }
                        }
                        if (hay_error) break ;
                    }

                    if ( hay_error || (cont_puntos>1) || (string_de_entrada.charAt(0) == '.')
                            || (string_de_entrada.charAt( string_de_entrada.length()-1 ) == '.') ||
                            ( (string_de_entrada.charAt(0) == '-') && (string_de_entrada.charAt(1) == '.') ) ) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar el número correctamente.");
                    }   else {
                        primer_número = Double.parseDouble(string_de_entrada);
                        entradajTextField.setText("");
                        operación = "*";
                    }
                }
            }
        }

        if (evento.getSource() == button_división) {
            if ( !(string_de_resultado.isEmpty()) && string_de_entrada.isEmpty() ) {
                primer_número = Double.parseDouble(string_de_resultado);
                resultadojTextField.setText("");
                operación = "/";
            }   else {
                if (string_de_entrada.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un número");
                }   else {

                    int cont_puntos = 0;
                    for_div:    for ( int i = 0; i<string_de_entrada.length(); i++) {
                        if (string_de_entrada.charAt(i) == '.') ++cont_puntos;
                        for ( int j = 0; j< nums.length; j++) {
                            if ( string_de_entrada.charAt(i) == nums[j] ||
                                    string_de_entrada.charAt(0) == '-' ) {
                                hay_error = false;
                                continue for_div;
                            }   else {
                                hay_error = true;
                            }
                        }
                        if (hay_error) break ;
                    }

                    if ( hay_error || (cont_puntos>1) || (string_de_entrada.charAt(0) == '.')
                            || (string_de_entrada.charAt( string_de_entrada.length()-1 ) == '.') ||
                            ( (string_de_entrada.charAt(0) == '-') && (string_de_entrada.charAt(1) == '.') ) ) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar el número correctamente.");
                    }   else {
                        primer_número = Double.parseDouble(string_de_entrada);
                        entradajTextField.setText("");
                        operación = "/";
                    }
                }
            }
        }

        if (evento.getSource() == button_módulo) {
            if ( !(string_de_resultado.isEmpty()) && string_de_entrada.isEmpty() ) {
                primer_número = Double.parseDouble(string_de_resultado);
                resultadojTextField.setText("");
                operación = "%";
            }   else {
                if (string_de_entrada.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un número");
                }   else {

                    int cont_puntos = 0;
                    for_mod:    for ( int i = 0; i<string_de_entrada.length(); i++) {
                        if (string_de_entrada.charAt(i) == '.') ++cont_puntos;
                        for ( int j = 0; j< nums.length; j++) {
                            if ( string_de_entrada.charAt(i) == nums[j] ||
                                    string_de_entrada.charAt(0) == '-' ) {
                                hay_error = false;
                                continue for_mod;
                            }   else {
                                hay_error = true;
                            }
                        }
                        if (hay_error) break ;
                    }

                    if ( hay_error || (cont_puntos>1) || (string_de_entrada.charAt(0) == '.')
                            || (string_de_entrada.charAt( string_de_entrada.length()-1 ) == '.') ||
                            ( (string_de_entrada.charAt(0) == '-') && (string_de_entrada.charAt(1) == '.') ) ) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar el número correctamente.");
                    }   else {
                        primer_número = Double.parseDouble(string_de_entrada);
                        entradajTextField.setText("");
                        operación = "%";
                    }
                }
            }
        }

        if (evento.getSource() == button_cuadrado) {
            if ( !(string_de_resultado.isEmpty()) && string_de_entrada.isEmpty() ) {
                primer_número = Double.parseDouble(string_de_resultado);
                BigDecimal bd1 = new BigDecimal(String.valueOf(primer_número));
                resultado = bd1.multiply(bd1).doubleValue();
                resultadojTextField.setText(String.valueOf(resultado));
                string_de_historial = "\n" + "  " + String.valueOf(primer_número) + " * " +
                        String.valueOf(primer_número) + " = " + String.valueOf(resultado);
                textarea_historial.insert(string_de_historial,0);
                textarea_historial.setCaretPosition(0);
            }   else {
                if (string_de_entrada.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Debes ingresar un número.");
                }   else {

                    int cont_puntos = 0;
                    for_cuadrado:    for ( int i = 0; i<string_de_entrada.length(); i++) {
                        if (string_de_entrada.charAt(i) == '.') ++cont_puntos;
                        for ( int j = 0; j< nums.length; j++) {
                            if ( string_de_entrada.charAt(i) == nums[j] ||
                                    string_de_entrada.charAt(0) == '-' ) {
                                hay_error = false;
                                continue for_cuadrado;
                            }   else {
                                hay_error = true;
                            }
                        }
                        if (hay_error) break ;
                    }

                    if ( hay_error || (cont_puntos>1) || (string_de_entrada.charAt(0) == '.')
                            || (string_de_entrada.charAt( string_de_entrada.length()-1 ) == '.') ||
                            ( (string_de_entrada.charAt(0) == '-') && (string_de_entrada.charAt(1) == '.') ) ) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar el número correctamente.");
                    }   else {
                        primer_número = Double.parseDouble(string_de_entrada);
                        BigDecimal bd1 = new BigDecimal(String.valueOf(primer_número));
                        resultado = bd1.multiply(bd1).doubleValue();
                        resultadojTextField.setText(String.valueOf(resultado));
                        string_de_historial = "\n" + "  " + String.valueOf(primer_número) + " * " +
                                String.valueOf(primer_número) + " = " + String.valueOf(resultado);
                        textarea_historial.insert(string_de_historial,0);
                        textarea_historial.setCaretPosition(0);
                        entradajTextField.setText("");
                    }
                }
            }
        }

        if (evento.getSource() == button_raíz) {
            if ( !(string_de_resultado.isEmpty()) && string_de_entrada.isEmpty() ) {
                primer_número = Double.parseDouble(string_de_resultado);
                if (primer_número<0) {
                    JOptionPane.showMessageDialog(null, "Aquí no están definidas " +
                            "las operaciones con complejos.");
                    resultadojTextField.setText("");
                }   else {
                    resultado = Math.sqrt(primer_número);
                    resultadojTextField.setText(String.valueOf(resultado));
                    string_de_historial = "\n" + "  " + "√" +
                            String.valueOf(primer_número) + " = " + String.valueOf(resultado);
                    textarea_historial.insert(string_de_historial,0);
                    textarea_historial.setCaretPosition(0);
                }
            }   else {
                if (string_de_entrada.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Debes ingresar un número.");
                }   else {

                    int cont_puntos = 0;
                    for_raíz:    for ( int i = 0; i<string_de_entrada.length(); i++) {
                        if (string_de_entrada.charAt(i) == '.') ++cont_puntos;
                        for ( int j = 0; j< nums.length; j++) {
                            if ( string_de_entrada.charAt(i) == nums[j] ||
                                    string_de_entrada.charAt(0) == '-' ) {
                                hay_error = false;
                                continue for_raíz;
                            }   else {
                                hay_error = true;
                            }
                        }
                        if (hay_error) break ;
                    }

                    if ( hay_error || (cont_puntos>1) || (string_de_entrada.charAt(0) == '.')
                            || (string_de_entrada.charAt( string_de_entrada.length()-1 ) == '.') ||
                            ( (string_de_entrada.charAt(0) == '-') && (string_de_entrada.charAt(1) == '.') ) ) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar el número correctamente.");
                    }   else {
                        primer_número = Double.parseDouble(string_de_entrada);
                        if (primer_número<0) {
                            JOptionPane.showMessageDialog(null, "Aquí no están definidas " +
                                    "las operaciones con complejos.");
                            entradajTextField.setText("");
                        }   else {
                            resultado = Math.sqrt(primer_número);
                            resultadojTextField.setText(String.valueOf(resultado));
                            string_de_historial = "\n" + "  " + "√" +
                                    String.valueOf(primer_número) + " = " + String.valueOf(resultado);
                            textarea_historial.insert(string_de_historial,0);
                            textarea_historial.setCaretPosition(0);
                            entradajTextField.setText("");
                        }
                    }
                }
            }
        }

        if (evento.getSource() == button_igual) {
            if (string_de_entrada.isEmpty() || (operación == "") ){
                JOptionPane.showMessageDialog(null, "Debes ingresar un número" +
                        " u operación");
            }   else {

                int cont_puntos = 0;
                for_igual:    for ( int i = 0; i<string_de_entrada.length(); i++) {
                    if (string_de_entrada.charAt(i) == '.') ++cont_puntos;
                    for ( int j = 0; j< nums.length; j++) {
                        if ( string_de_entrada.charAt(i) == nums[j] ||
                                string_de_entrada.charAt(0) == '-' ) {
                            hay_error = false;
                            continue for_igual;
                        }   else {
                            hay_error = true;
                        }
                    }
                    if (hay_error) break ;
                }

                if ( hay_error || (cont_puntos>1) || (string_de_entrada.charAt(0) == '.')
                        || (string_de_entrada.charAt( string_de_entrada.length()-1 ) == '.') ||
                        ( (string_de_entrada.charAt(0) == '-') && (string_de_entrada.charAt(1) == '.') ) ) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar el número correctamente.");
                }   else {
                    segundo_número = Double.parseDouble(string_de_entrada);
                    entradajTextField.setText("");
                    BigDecimal bd1 = new BigDecimal(String.valueOf(primer_número));
                    BigDecimal bd2 = new BigDecimal(String.valueOf(segundo_número));

                    switch (operación) {
                        case "+":
                            resultado = bd1.add(bd2).doubleValue();
                            break;
                        case "-":
                            resultado = bd1.subtract(bd2).doubleValue();
                            break;
                        case "*":
                            resultado = bd1.multiply(bd2).doubleValue();
                            break;
                        case "/":
                            if ( segundo_número == 0) {
                                JOptionPane.showMessageDialog(null, "No está definida " +
                                        "la división por cero.");
                                hay_error = true;
                            }   else {
                                resultado = bd1.divide(bd2,10, RoundingMode.HALF_UP).doubleValue();
                            }
                            break;
                        case "%":
                            if ( ((int) primer_número < primer_número) || ((int) segundo_número < segundo_número) ) {
                                JOptionPane.showMessageDialog(null,"La operación de módulo" +
                                        " solo trabaja con enteros.");
                                hay_error = true;
                            }   else {
                                resultado = primer_número % segundo_número;
                            }
                            break;
                    }

                    if ( hay_error ) {
                        primer_número = 0;
                        segundo_número = 0;
                        resultado = 0;
                        operación = "";
                        entradajTextField.setText("");
                        resultadojTextField.setText("");
                    }   else {
                        string_de_historial = "\n" + "  " + String.valueOf(primer_número) + " " + operación +
                                " " + String.valueOf(segundo_número) + " = " + String.valueOf(resultado);
                        resultadojTextField.setText(String.valueOf(resultado));
                        textarea_historial.insert(string_de_historial,0);
                        textarea_historial.setCaretPosition(0);
                        operación = "";
                    }
                }
            }
        }

        if (evento.getSource() == button_reiniciar) {
            primer_número = 0;
            segundo_número = 0;
            resultado = 0;
            operación = "";
            entradajTextField.setText("");
            resultadojTextField.setText("");
        }
        if (evento.getSource() == button_salir) {
            System.exit(0);
        }
        if (evento.getSource() == button_creador) {
            JOptionPane.showMessageDialog(null, "Desarrollado por Angel Eduardo Pedraza Ordoñez.");
        }

    }

    public static void main(String[] args) {
        Elementos_Básicos elementos_básicos = new Elementos_Básicos();
        elementos_básicos.setBounds(0, 0, 600, 600);
        elementos_básicos.setVisible(true);
        elementos_básicos.setResizable(false);
        elementos_básicos.setLocationRelativeTo(null);
    }
}