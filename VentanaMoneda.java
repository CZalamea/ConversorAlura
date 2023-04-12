import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DecimalFormat;

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

    public JComboBox<String> conversiones; //variable publica para que otro metodos puedan acceder a la misma

    private void colocarComboBox() {

        String[] opciones = {"De dolares a pesos colombianos", "De dolares a soles","De dolares a pesos argentinos",
                "De dolares a bolivares (Venezuela)", "De dolares a Euros", "De dolares a Yen",
                "De dolares a Libras", "De dolares a Yenes"};

        conversiones = new JComboBox<>(opciones);
        conversiones.setBounds(50,100,250,30);
        panel.add(conversiones);
    }

    public JTextField texto1 = new JTextField();
    public JTextField texto2 = new JTextField();


    private void colocarTextField (){

        JTextField texto1 = new JTextField();
        //JTextField texto2 = new JTextField();
        //JTextField texto3 = new JTextField();
        texto1.setBounds(50, 200, 200,30);

        texto1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                try {
                    double valor = Double.parseDouble(texto1.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Por favor ingrese un valor numérico válido en el campo de texto.");
                    texto1.setText("");
                    texto1.requestFocus();
                }
            }
        });

        JTextField texto2 = new JTextField();
        texto2.setBounds(50,400, 200,30);
        texto2.setEditable(false);

        panel.add(texto1);
        panel.add(texto2);
    }

    private void colocarBotones (){

        JButton boton = new JButton();
        boton.setBounds(350,50,100,40);
        ImageIcon alura = new ImageIcon("alura boton.png");
        boton.setIcon(new ImageIcon(alura.getImage().getScaledInstance(boton.getWidth(),boton.getHeight(), Image.SCALE_SMOOTH )));

        boton.addActionListener(new ActionListener(){

            public void actionPerformed (ActionEvent e){

                String opcionSeleccionada = (String) conversiones.getSelectedItem();

                double tasaConversion = 0; // variable para guardar la tasa de conversión

                if (opcionSeleccionada.equals("De dolares a pesos colombianos")) {
                    tasaConversion = 3967.50;
                } else if (opcionSeleccionada.equals("De dolares a soles")) {
                    tasaConversion = 4.01;
                } else if (opcionSeleccionada.equals("De dolares a pesos argentinos")) {
                    tasaConversion = 97.72;
                } else if (opcionSeleccionada.equals("De dolares a bolivares (Venezuela)")) {
                    tasaConversion = 2012000;
                } else if (opcionSeleccionada.equals("De dolares a Euros")) {
                    tasaConversion = 0.82;
                } else if (opcionSeleccionada.equals("De dolares a Yen")) {
                    tasaConversion = 108.42;
                } else if (opcionSeleccionada.equals("De dolares a Libras")) {
                    tasaConversion = 0.72;
                } else if (opcionSeleccionada.equals("De dolares a Yenes")) {
                    tasaConversion = 110.36;
                }

                double valorConvertido = 0;

                try {
                    double valor = Double.parseDouble(texto1.getText());
                    valorConvertido = valor * tasaConversion;
                    DecimalFormat formatoDecimal = new DecimalFormat("#,###.##");
                    String valorFormateado = formatoDecimal.format(valorConvertido);
                    texto2.setText(valorFormateado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Por favor ingrese un valor numérico válido en el campo de texto.");
                    texto1.setText("");
                    texto1.requestFocus();
                }

                /*if (!texto1.getText().isEmpty()) {
                    double valor = Double.parseDouble(texto1.getText().trim());
                    double valorConvertido = valor * tasaConversion;
                    texto2.setText(String.valueOf(valorConvertido));
                    System.out.println(valor);
                    System.out.println(valorConvertido);
                } else {
                    double valor = Double.parseDouble(texto1.getText().trim());
                    double valorConvertido = valor * tasaConversion;
                    texto2.setText(String.valueOf(valorConvertido));
                    System.out.println(valor);
                    System.out.println(valorConvertido);
                }*/

            /*double valorConvertido = Double.parseDouble(texto1.getText()) * tasaConversion;
            System.out.println("Valor convertido: " + valorConvertido);
            texto2.setText(String.valueOf(valorConvertido));
            System.out.println("Texto2: " + texto2.getText());*/


                //double valorConvertido = Double.parseDouble(texto1.getText()) * tasaConversion;
                //texto2.setText(String.valueOf(valorConvertido));

            /*if (!texto1.getText().isEmpty()) {
                int cantidad = (int) Double.parseDouble(texto1.getText());
            }

            double valor = 0;
            String valorString = texto1.getText().trim();
            if (!valorString.isEmpty()) {
                valor = Double.parseDouble(valorString);
            }

            double valorConvertido = Double.parseDouble(texto1.getText()) * tasaConversion;
            texto2.setText(String.valueOf(valorConvertido));*/
            }
        });

        panel.add(boton);
    }
}
