import javax.swing.* ;
import java.awt.event.* ;
import java.awt.* ;
// implements ActionListener
public class Elementos_Básicos extends JFrame {
    // ⊕
    private JButton suma, resta, multiplicación, división;
    //private JLabel ;
    //private JTextField ;

    public Elementos_Básicos() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(0,255,0));

        suma = new JButton("+");
        suma.setBounds(20,20,50,50);
        suma.setBackground(new Color(0,0,0));
        suma.setFont(new Font("Andale Mono", 1, 14));
        suma.setForeground(new Color(255,255,255));
        //suma.addActionListener(this);
        add(suma);

        resta = new JButton("-");
        resta.setBounds(10,150,50,30);
        resta.setBackground(new Color(255,255,255));
        resta.setFont(new Font("Andale Mono", 1, 14));
        resta.setForeground(new Color(255,0,0));
        //suma.addActionListener(this);
        add(resta);

        multiplicación = new JButton("*");
        multiplicación.setBounds(10,200,50,30);
        multiplicación.setBackground(new Color(255,255,255));
        multiplicación.setFont(new Font("Andale Mono", 1, 14));
        multiplicación.setForeground(new Color(255,0,0));
        //suma.addActionListener(this);
        add(multiplicación);

        división = new JButton("/");
        división.setBounds(20,280,100,30);
        división.setBackground(new Color(255,255,255));
        división.setFont(new Font("Andale Mono", 1, 14));
        división.setForeground(new Color(255,0,0));
        //suma.addActionListener(this);
        add(división);


    }

    public static void main(String args[]) {
        Elementos_Básicos elementos_básicos = new Elementos_Básicos();
        elementos_básicos.setBounds(0, 0, 550, 550);
        elementos_básicos.setVisible(true);
        elementos_básicos.setResizable(false);
        elementos_básicos.setLocationRelativeTo(null);
    }
}