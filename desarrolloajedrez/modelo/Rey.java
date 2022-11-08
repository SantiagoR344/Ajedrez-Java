package co.edu.utp.misiontic2022.desarrolloajedrez.modelo;

public class Rey extends Ficha {

    public Rey(Color color) {
        super(color);
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar como se mueve el rey
        
        return true;
    }
    
    @Override
    public String toString() {
        return "R"+ (getColor() == Color.BLANCO ? "B" : "N");
    }
}
