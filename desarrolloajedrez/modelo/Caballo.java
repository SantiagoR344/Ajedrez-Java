package co.edu.utp.misiontic2022.desarrolloajedrez.modelo;

public class Caballo extends Ficha {
    
    public Caballo(Color color) {
        super(color);
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar como se mueve el caballo
        
        return true;
    }

    @Override
    public String toString() {
        return "C"+ (getColor() == Color.BLANCO ? "B" : "N");
    }
}
