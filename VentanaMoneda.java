import javax.swing.*;
import java.awt.*;

public class VentanaMoneda extends JFrame {
    public JPanel panel;
    public VentanaMoneda(){
        //setSize(500, 500);
        setTitle("Conversor de moneda"); //titulo
        setBounds(250,250,900,900); //tamanio y posicion inicial de la ventana
        setLocationRelativeTo(null); //ventana en el centro
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarTextField();
        colocarComboBox();

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

    private void colocarComboBox (){

        String [] opciones = {"De dolares a pesos colombianos", "De dolares a soles","De dolares a pesos argentinos", "De dolares a bolivares (Venezuela)", "De dolares a Euros", "De dolares a Yen", "De dolares a Libras", "De dolares a Yenes"};

        JComboBox conversiones = new JComboBox<>(opciones);
        conversiones.setBounds(50,100,200,25);
        panel.add(conversiones);


    }

    private void colocarTextField (){

        JTextField texto1 = new JTextField();
        //JTextField texto2 = new JTextField();
        //JTextField texto3 = new JTextField();

        texto1.setBounds(50, 200, 200,30);
        panel.add(texto1);
    }



}
