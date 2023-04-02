import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ventana extends JFrame {
    public JPanel panel;
    public Ventana(){
        //setSize(500, 500);
        setTitle("Conversor alura"); //titulo
        setBounds(250,250,900,900); //tamanio y posicion inicial de la ventana
        setLocationRelativeTo(null); //ventana en el centro
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarTextField();

    }

    private void colocarPaneles (){
        panel = new JPanel(); //instancia del panel

        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel); //se agrega panel a la ventana

    }

    private void colocarEtiquetas() {

        JLabel etiqueta = new JLabel();
        etiqueta.setText("Conversor de moneda");
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        etiqueta.setVerticalAlignment(JLabel.CENTER);

        etiqueta.setBounds(10,10, 200 ,50);
        etiqueta.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        panel.add(etiqueta);
    }

    private void colocarTextField (){

        JTextField texto1 = new JTextField();
        JTextField texto2 = new JTextField();
        JTextField texto3 = new JTextField();

        texto1.setBounds(100, 100, 100,30);
        panel.add(texto1);
    }



}
