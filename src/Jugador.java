import java.util.Random;

import javax.swing.JPanel;

public class Jugador {

    private int TOTAL_CARTAS = 10;
    private int MARGEN = 10;
    private int DISTANCIA = 40;

    private Carta[] cartas = new Carta[TOTAL_CARTAS];
    private Random r = new Random();

    public void repartir() {
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = new Carta(r);
        }
    }

    public void mostrar(JPanel pnl) {
        pnl.removeAll();
        int posicionHorizontal = MARGEN + cartas.length * DISTANCIA;
        for (Carta c : cartas) {
            c.mostrar(pnl, posicionHorizontal, MARGEN);
            posicionHorizontal -= DISTANCIA;
        }
        pnl.repaint();
    }
}
