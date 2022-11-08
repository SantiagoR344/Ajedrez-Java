package co.edu.utp.misiontic2022.desarrolloajedrez;

import co.edu.utp.misiontic2022.desarrolloajedrez.modelo.Casilla;
import co.edu.utp.misiontic2022.desarrolloajedrez.modelo.Color;
import co.edu.utp.misiontic2022.desarrolloajedrez.modelo.Jugador;
import co.edu.utp.misiontic2022.desarrolloajedrez.modelo.Tablero;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        var tablero = new Tablero("Cesar Diaz", "Brayan Valencia");

        tablero.imprimirTablero();
    }
}
