import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSeleccion extends JFrame {
    public JPanel panel;


    public VentanaSeleccion() {
        setTitle("Conversor alura"); //titulo
        setBounds(250,250,400,200); //tamanio y posicion inicial de la ventana
        setLocationRelativeTo(null); //ventana en el centro
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarEtiquetas();
        colocarRadioBoton();

    }

    private void colocarPaneles (){
        panel = new JPanel(); //instancia del panel

        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel); //se agrega panel a la ventana

    }
    private void colocarEtiquetas() {

        JLabel etiqueta = new JLabel();
        etiqueta.setText("Seleccione el Conversor a utilizar: ");
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        etiqueta.setVerticalAlignment(JLabel.CENTER);
        etiqueta.setBounds(10,10, 200 ,50);
        //etiqueta.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        panel.add(etiqueta);
    }

    private void colocarRadioBoton(){

        String [] conversores = {"Conversor de moneda", "Conversor de temperatura"};

        JComboBox l1 = new JComboBox(conversores);
        l1.setBounds(100,50,200,25);

        //evento para seleccionar la ventana de los tipos de conversores
        l1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){

                String selecteditem = l1.getSelectedItem().toString();

                if(selecteditem.equals("Conversor de moneda")){
                    VentanaMoneda ventanaMoneda = new VentanaMoneda();
                    ventanaMoneda.setVisible(true);
                }else if(selecteditem.equals("Conversor de temperatura")){
                    VentanaTemp ventanaTemperatura =  new VentanaTemp();
                }
            }

        });

        panel.add(l1);

    }


}
