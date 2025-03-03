import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Carta {

    private int indice;

    // metodo constructor
    public Carta(Random r) {
        //generar un numero al azar entre 1 y 52
        indice = r.nextInt(52) + 1;
    }

    public void mostrar(JPanel pnl, int x, int y){
        String nombreArchivo = "/imagenes/CARTA" + indice + ".jpg";
        ImageIcon imgCarta = new ImageIcon(getClass().getResource(nombreArchivo));

        JLabel lbl=new JLabel();
        lbl.setBounds(x, y, imgCarta.getIconWidth(), imgCarta.getIconHeight());
        lbl.setIcon(imgCarta);

        pnl.add(lbl);
    }

}
