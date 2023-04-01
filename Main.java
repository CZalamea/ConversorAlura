import javax.swing.JFrame;
public class Main {
        public static void main(String[] args) {
            JFrame ventana = new JFrame();
            ventana.setSize(900, 900);
            ventana.setTitle("Mi ventana");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setLocationRelativeTo(null); // Establece la ubicación de la ventana en el centro de la pantalla
            ventana.setVisible(true);



        }


}
