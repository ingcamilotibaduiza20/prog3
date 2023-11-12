import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    private JButton btnTragamonedas;

    public MenuPrincipal() {
        super("Menú Principal");

        // Crear un JLabel para el fondo
        JLabel fondo = new JLabel(new ImageIcon("fondo.jpg"));
        fondo.setBounds(0, 0, 2000, 1900); 
        add(fondo);

        JLabel lblTitulo = new JLabel("BIENVENIDO AL CASINO");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(0, 10, 300, 30);
        fondo.add(lblTitulo);

        btnTragamonedas = new JButton("TRAGAMONEDAS :D");

        btnTragamonedas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tragamonedas tragamonedas = new Tragamonedas();
                tragamonedas.setVisible(true);
            }
        });

        
        fondo.setLayout(null);
        
        btnTragamonedas.setBounds(50, 75, 200, 50);

        // Agregar los botones al fondo en lugar del JFrame
        fondo.add(btnTragamonedas);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuPrincipal();
    }
}
