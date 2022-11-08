package co.edu.utp.misiontic2022.desarrolloajedrez.modelo;

public class Tablero {

    private static final String COLUMNAS = "abcdefgh";

    private Jugador jugador1;
    private Jugador jugador2;

    private Casilla[][] casillas;

    public Tablero(Jugador j1, Jugador j2) {
        this.jugador1 = j1;
        this.jugador2 = j2;

        // Cargar las casillas con su color
        inicializarCasillas();

        // Ubicar fichas en su posicion inicial
        ubicarFichas();
    }

    public Tablero(String nombre1, String nombre2) {
        this(new Jugador(nombre1, Color.BLANCO), new Jugador(nombre2, Color.NEGRO));
    }

    private void ubicarFichas() {
        casillas[0][0].setFicha(new Torre(Color.BLANCO));
        casillas[0][1].setFicha(new Caballo(Color.BLANCO));
        casillas[0][2].setFicha(new Alfil(Color.BLANCO));
        casillas[0][3].setFicha(new Reina(Color.BLANCO));
        casillas[0][4].setFicha(new Rey(Color.BLANCO));
        casillas[0][5].setFicha(new Alfil(Color.BLANCO));
        casillas[0][6].setFicha(new Caballo(Color.BLANCO));
        casillas[0][7].setFicha(new Torre(Color.BLANCO));

        for (var i = 0; i < 8; i++) {
            casillas[1][i].setFicha(new Peon(Color.BLANCO));
            casillas[6][i].setFicha(new Peon(Color.NEGRO));
        }

        casillas[7][0].setFicha(new Torre(Color.NEGRO));
        casillas[7][1].setFicha(new Caballo(Color.NEGRO));
        casillas[7][2].setFicha(new Alfil(Color.NEGRO));
        casillas[7][3].setFicha(new Reina(Color.NEGRO));
        casillas[7][4].setFicha(new Rey(Color.NEGRO));
        casillas[7][5].setFicha(new Alfil(Color.NEGRO));
        casillas[7][6].setFicha(new Caballo(Color.NEGRO));
        casillas[7][7].setFicha(new Torre(Color.NEGRO));

    }

    private void inicializarCasillas() {
        casillas = new Casilla[8][8];

        for (var fila = 0; fila < 8; fila++) {
            for (var columna = 0; columna < 8; columna++) {
                var color = (fila + columna) % 2 == 0 ? Color.NEGRO : Color.BLANCO;
                casillas[fila][columna] = new Casilla(fila, letraDeColumna(columna), color);
            }
        }
    }

    private Character letraDeColumna(Integer columna) {
        return COLUMNAS.charAt(columna);
    }

    private Character letraDeColumna2(Integer columna) {
        switch (columna) {
            case 0:
                return 'a';
            case 1:
                return 'b';
            case 2:
                return 'c';
            case 3:
                return 'd';
            case 4:
                return 'e';
            case 5:
                return 'f';
            case 6:
                return 'g';
            case 7:
            default:
                return 'h';
        }

    }

    public void enroque() {
        // TODO: Falta implementar este método
    }

    public void jaque() {
        // TODO: Falta implementar este método
    }

    public void jaqueMate() {
        // TODO: Falta implementar este método
    }

    public void imprimirTablero() {
        for (var i = 7; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                System.out.print(casillas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    
}
