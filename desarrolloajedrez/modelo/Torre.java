package co.edu.utp.misiontic2022.desarrolloajedrez.modelo;

public class Torre extends Ficha {
   
    public Torre(Color color) {
        super(color);
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar como se mueve la torre
        
        return true;
    }

    @Override
    public String toString() {
        return "T"+ (getColor() == Color.BLANCO ? "B" : "N");
    }
}
