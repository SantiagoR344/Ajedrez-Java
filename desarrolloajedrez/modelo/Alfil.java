package co.edu.utp.misiontic2022.desarrolloajedrez.modelo;

public class Alfil extends Ficha {

    public Alfil(Color color) {
        super(color);
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar como se mueve el alfil

        return true;
    }

    @Override
    public String toString() {
        return "A" + (getColor() == Color.BLANCO ? "B" : "N");
    }
}
