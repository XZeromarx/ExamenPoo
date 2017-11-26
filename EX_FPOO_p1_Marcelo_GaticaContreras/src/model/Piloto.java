package model;
/**
 *
 * @author XZeroMarx
 */
public class Piloto extends PersonalDeCabina{

    private int horasDeVuelo;

    //constructor

    public Piloto() {
    }
    

    public Piloto(int horasDeVuelo) {
        this.horasDeVuelo = horasDeVuelo;
    }

    public Piloto(int horasDeVuelo, String rut, String nombre) {
        super(rut, nombre);
        this.horasDeVuelo = horasDeVuelo;
    }
    
    
    
    public int getHorasDeVuelo() {
        return horasDeVuelo;
    }

    public void setHorasDeVuelo(int horasDeVuelo) {
        this.horasDeVuelo = horasDeVuelo;
    }

    @Override
    public String toString() {
        return "Piloto{" + "horasDeVuelo=" + horasDeVuelo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Piloto other = (Piloto) obj;
        if (this.horasDeVuelo != other.horasDeVuelo) {
            return false;
        }
        return true;
    }
    
    
    //javadoc
    //metodo de impresion
    //falta constructor
    
}
