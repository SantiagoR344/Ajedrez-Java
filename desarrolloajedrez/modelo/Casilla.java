package co.edu.utp.misiontic2022.desarrolloajedrez.modelo;

public class Casilla {
    
    private Integer fila;
    private Character columna;
    private Color color;

    private Ficha ficha;

    public Casilla(Integer fila, Character columna, Color color) {
        this.fila = fila;
        this.columna = columna;
        this.color = color;
    }
    
    // Setter
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Boolean estaOcupada() {
        if (ficha != null) {
            return true;
        }
        return false;
    } 

    @Override
    public String toString() {
        return estaOcupada() ? ficha.toString() : " ";
    }
}
