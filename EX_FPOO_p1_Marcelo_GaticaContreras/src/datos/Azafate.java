package datos;

/**
 * Clase heredada de "PersonalDeCabina". Contiene métodos heredados y datos
 * propios. Esta clase se encarga de dar valores a los/las azafates respondiendo
 * con valores booleanos los idiomas que, puede o no, hablar el mismo/a.
 *
 * @author XZeroMarx
 */
public class Azafate extends PersonalDeCabina {

    private boolean otrosIdiomas;
    private boolean ingles;

    /**
     * Constructor de la clase Azafate, vacio para solo instanciarlo.
     */
    public Azafate() {
    }

    /**
     * Contructor de la clase Azafate. Recibe parametro boolean para saber si el
     * azafate habla o no otro idioma.
     *
     * @param otrosIdiomas
     */
    public Azafate(boolean otrosIdiomas) {
        this.otrosIdiomas = otrosIdiomas;
    }

    /**
     * Constructorde la clase Azafate. Recibe dos parametros boolean para se el
     * azafate habla o no otros idiomas, y si habla ingles o no.
     *
     * @param otrosIdiomas
     * @param ingles
     */
    public Azafate(boolean otrosIdiomas, boolean ingles) {
        this.otrosIdiomas = otrosIdiomas;
        this.ingles = ingles;
    }

    /**
     *
     * @return boolean que determina si habla otros idiomas .
     */
    public boolean isIdiomas() {
        return otrosIdiomas;
    }

    /**
     * setea un valor boolean si habla o no, otros idiomas.
     *
     * @param idiomas
     */
    public void setIdiomas(boolean idiomas) {
        this.otrosIdiomas = idiomas;
    }

    /**
     *
     * @return boolean si habla ingles.
     */
    public boolean isIngles() {
        return ingles;
    }

    /**
     * Setea un valor boolean si habla o no, ingles.
     *
     * @param ingles
     */
    public void setIngles(boolean ingles) {
        this.ingles = ingles;
    }

    /**
     *
     * @return String con el contenido de los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Azafate{" + "otrosIdiomas=" + otrosIdiomas + ", ingles=" + ingles + '}';
    }

    /**
     *
     * @return int para comparacion de Objetos
     */
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    /**
     * Metodo sobreescrito que compara objetos
     *
     * @param obj
     * @return boolean si los objetos son iguales o no.
     */
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

    /**
     * Retorna Texto explicitando el contenido de los atributos de la clase
     */
    @Override
    public void Impresion() {
        System.out.println("===================");
        System.out.println("Azafate:");
        System.out.println("===================");

        if (ingles == true) {
            System.out.println("Maneja ingles");
        } else {
            System.out.println("No maneja ingles");
        }
        if (otrosIdiomas == true) {
            System.out.println("Maneja otros idiomas");
        } else {
            System.out.println("No maneja otros idiomas");
        }

    }

}
