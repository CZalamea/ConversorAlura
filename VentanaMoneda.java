import javax.swing.*;
import java.awt.*;

public class VentanaMoneda extends JFrame {
    public JPanel panel;
    public VentanaMoneda(){
        //setSize(500, 500);
        setTitle("Conversor de moneda"); //titulo
        setBounds(250,250,500,500); //tamanio y posicion inicial de la ventana
        setLocationRelativeTo(null); //ventana en el centro
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarTextField();
        colocarComboBox();
        colocarBotones();

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

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("Ingrese el valor a convertir en x");
        etiqueta2.setHorizontalAlignment(JLabel.CENTER);
        etiqueta2.setVerticalAlignment(JLabel.CENTER);

        etiqueta2.setBounds(0,150, 300 ,50);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("El resultado de x a y es: ");
        etiqueta3.setHorizontalAlignment(JLabel.CENTER);
        etiqueta3.setVerticalAlignment(JLabel.CENTER);

        etiqueta3.setBounds(0,350, 300 ,50);



        panel.add(etiqueta);
        panel.add(etiqueta2);
        panel.add(etiqueta3);
    }

    private void colocarComboBox (){

        String [] opciones = {"De dolares a pesos colombianos", "De dolares a soles","De dolares a pesos argentinos", "De dolares a bolivares (Venezuela)", "De dolares a Euros", "De dolares a Yen", "De dolares a Libras", "De dolares a Yenes"};

        JComboBox conversiones = new JComboBox<>(opciones);
        conversiones.setBounds(50,100,250,30);
        panel.add(conversiones);


    }

    private void colocarTextField (){

        JTextField texto1 = new JTextField();
        //JTextField texto2 = new JTextField();
        //JTextField texto3 = new JTextField();
        texto1.setBounds(50, 200, 200,30);

        JTextField texto2 = new JTextField();
        texto2.setBounds(50,400, 200,30);


        panel.add(texto1);
        panel.add(texto2);
    }

    private void colocarBotones (){

        JButton boton = new JButton();
        boton.setBounds(350,50,100,40);
        ImageIcon alura = new ImageIcon("alura boton.png");
        boton.setIcon(new ImageIcon(alura.getImage().getScaledInstance(boton.getWidth(),boton.getHeight(), Image.SCALE_SMOOTH )));

        panel.add(boton);
    }

}
