package co.edu.utp.misiontic2022.desarrolloajedrez.modelo;

public abstract class Ficha {

    private Color color;
    private Casilla origen;

    public Ficha(Color color) {
        this(color, null);
    }

    public Ficha(Color color, Casilla origen) {
        this.color = color;
        this.origen = origen;
    }


    public Boolean comer() {
        // TODO: Falta implementar este método
        return true;
    }

    public abstract Boolean mover(Casilla destino);

    // Getter
    public Color getColor() {
        return color;
    }

    public Casilla getOrigen() {
        return origen;
    }
}
