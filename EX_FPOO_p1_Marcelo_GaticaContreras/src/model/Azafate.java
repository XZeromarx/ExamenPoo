package model;
/**
 *
 * @author XZeroMarx
 */
public class Azafate extends PersonalDeCabina{
    private boolean otrosIdiomas;
    private boolean ingles;
    
    
    
    public boolean isIdiomas() {
        return otrosIdiomas;
    }

    public void setIdiomas(boolean idiomas) {
        this.otrosIdiomas = idiomas;
    }

    public boolean isIngles() {
        return ingles;
    }

    public void setIngles(boolean ingles) {
        this.ingles = ingles;
    }

    @Override
    public String toString() {
        return "Azafate{" + "otrosIdiomas=" + otrosIdiomas + ", ingles=" + ingles + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Azafate other = (Azafate) obj;
        if (this.otrosIdiomas != other.otrosIdiomas) {
            return false;
        }
        if (this.ingles != other.ingles) {
            return false;
        }
        return true;
    }
    
    //metodo de impresion
    //javadoc

    
}
