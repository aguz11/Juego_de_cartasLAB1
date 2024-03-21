
package juego_de_cartaslab1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ferrando Carlos
 */
public class Baraja {
    private List<Carta> cartas;
    private List<Carta> monton;

    public Baraja() {
        this.cartas = new ArrayList<>();
        this.monton = new ArrayList<>();
        inicializarBaraja();
    }

    /* Inicializa la baraja de manera secuencial */
    private void inicializarBaraja() {
        String[] palos = { "Espadas", "Bastos", "Oros", "Copas" };
        for (int numero = 1; numero <= 12; numero++) {
            if (numero != 8 && numero != 9) {
                for (String palo : palos) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }

    /* Solo un metodo de prueba para que muestra todas las cartas */
    public void mostrarPrueba() {
        int cant = 0;
        for (Carta cart : cartas) {
            System.out.println(cart);
            cant++;
        }
        System.out.println("Cantidad:" + cant);

    }
    // cartanMonton

}
