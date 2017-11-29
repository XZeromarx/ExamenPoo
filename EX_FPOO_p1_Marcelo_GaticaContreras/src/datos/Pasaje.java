package datos;

/**
 * Clase que entrega valores del pasaje. Esta clase hereda de la clase "Cliente"
 * quien compra el pasaje. sus datos son acordes al cliente que los compró.
 * debido a esto, la clase cliente debería ser instanciada desde esta clase ya
 * que los datos del cliente puede ser accesados desde esta misma clase.
 *
 * @author XZeroMarx
 *
 *
 */
public class Pasaje extends Cliente {

    private int numeroVuelo;
    private int fechaVuelo;
    private int horaVuelo;
    private int destinoVuelo;
    private int numeroAsiento;
    private String clase;
    private int valordeVuelo;

    /**
     * Constructor vacio para la clase Pasaje.
     */
    public Pasaje() {
    }

    /**
     * Constructor que recibe algunos parametros más importantes para la clase
     * Pasaje.
     *
     * @param numeroVuelo
     * @param numeroAsiento
     * @param valordeVuelo
     */
    public Pasaje(int numeroVuelo, int numeroAsiento, int valordeVuelo) {
        this.numeroVuelo = numeroVuelo;
        this.numeroAsiento = numeroAsiento;
        this.valordeVuelo = valordeVuelo;
    }

    /**
     * Constructor que recibe todos los atributos de la clase Pasaje.
     *
     * @param numeroVuelo
     * @param fechaVuelo
     * @param horaVuelo
     * @param destinoVuelo
     * @param numeroAsiento
     * @param clase
     * @param valordeVuelo
     */
    public Pasaje(int numeroVuelo, int fechaVuelo, int horaVuelo, int destinoVuelo, int numeroAsiento, String clase, int valordeVuelo) {
        this.numeroVuelo = numeroVuelo;
        this.fechaVuelo = fechaVuelo;
        this.horaVuelo = horaVuelo;
        this.destinoVuelo = destinoVuelo;
        this.numeroAsiento = numeroAsiento;
        this.clase = clase;
        this.valordeVuelo = valordeVuelo;
    }

    /**
     *
     * @return numero de vuelo.
     */
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * Setea el numero de vuelo.
     *
     * @param numeroVuelo
     */
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    /**
     *
     * @return la fecha de vuelo.
     */
    public int getFechaVuelo() {
        return fechaVuelo;
    }

    /**
     * setea la fecha de vuelo.
     *
     * @param fechaVuelo
     */
    public void setFechaVuelo(int fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    /**
     *
     * @return la hora de vuelo.
     */
    public int getHoraVuelo() {
        return horaVuelo;
    }

    /**
     * Setea la hora de vuelo.
     *
     * @param horaVuelo
     */
    public void setHoraVuelo(int horaVuelo) {
        this.horaVuelo = horaVuelo;
    }

    /**
     *
     * @return el destino del vuelo .
     */
    public int getDestinoVuelo() {
        return destinoVuelo;
    }

    /**
     * Setea el destino del vuelo.
     *
     * @param destinoVuelo
     */
    public void setDestinoVuelo(int destinoVuelo) {
        this.destinoVuelo = destinoVuelo;
    }

    /**
     *
     * @return el numero del asiento.
     */
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * Setea el numero del asiento.
     *
     * @param numeroAsiento
     */
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    /**
     *
     * @return la clase del vuelo (Economica / Ejecutiva).
     */
    public String getClase() {
        return clase;
    }

    /**
     * Setea la clase en la que viaja.
     *
     * @param clase
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     *
     * @return el valor del vuelo
     */
    public int getValordeVuelo() {
        return valordeVuelo;
    }

    /**
     * Setea el valor del vuelo
     *
     * @param valordeVuelo
     */
    public void setValordeVuelo(int valordeVuelo) {
        this.valordeVuelo = valordeVuelo;
    }

    /**
     *
     * @return int para comparacion de objetos
     */
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /**
     * Metodo sobreescrito para comparación de objetos.
     *
     * @param obj
     * @return boolean para saber si el objeto es igual o no al que se compara.
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
        final Pasaje other = (Pasaje) obj;
        if (this.numeroVuelo != other.numeroVuelo) {
            return false;
        }
        if (this.fechaVuelo != other.fechaVuelo) {
            return false;
        }
        if (this.horaVuelo != other.horaVuelo) {
            return false;
        }
        if (this.destinoVuelo != other.destinoVuelo) {
            return false;
        }
        if (this.numeroAsiento != other.numeroAsiento) {
            return false;
        }
        if (this.clase != other.clase) {
            return false;
        }
        if (this.valordeVuelo != other.valordeVuelo) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return String con los datos que contienen los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Pasaje{" + "numeroVuelo=" + numeroVuelo + ", fechaVuelo=" + fechaVuelo + ", horaVuelo=" + horaVuelo + ", destinoVuelo=" + destinoVuelo + ", numeroAsiento=" + numeroAsiento + ", clase=" + clase + ", valordeVuelo=" + valordeVuelo + '}';
    }

    /**
     *
     * Retorna Texto explicitando el contenido de los atributos de la clase.
     *
     */
    @Override
    public void Impresion() {
        System.out.println("===================");
        System.out.println("Personal de Cabina");
        System.out.println("===================");
        System.out.println("Numero de vuelo: " + numeroVuelo);
        System.out.println("Fecha de vuelo: " + fechaVuelo);
        System.out.println("Hora del vuelo: " + horaVuelo);
        System.out.println("Destino del vuelo: " + destinoVuelo);
        System.out.println("Numero Asiento: " + numeroAsiento);
        System.out.println("Clase: " + clase);
        System.out.println("Valor del vuelo: " + valordeVuelo);
    }
}
