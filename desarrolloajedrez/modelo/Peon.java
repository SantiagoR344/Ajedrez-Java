package co.edu.utp.misiontic2022.desarrolloajedrez.modelo;

public class Peon extends Ficha {
    
    public Peon(Color color) {
        super(color);
    }

    public Boolean coronar() {
        return false;
    }

    @Override
    public Boolean comer() {
        // TODO Auto-generated method stub
        return super.comer();
    }

    public Boolean comerAlPaso() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar como se mueve el peon
        
        return true;
    }

    @Override
    public String toString() {
        return "P"+ (getColor() == Color.BLANCO ? "B" : "N");
    }
}
