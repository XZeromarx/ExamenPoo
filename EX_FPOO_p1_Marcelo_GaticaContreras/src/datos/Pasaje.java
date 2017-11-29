package datos;

/**
 *
 * @author XZeroMarx
 */
public class Pasaje extends Cliente {

    private int numeroVuelo;
    private int fechaVuelo;
    private int horaVuelo;
    private int destinoVuelo;
    private int numeroAsiento;
    private int clase;
    private int valordeVuelo;

    public Pasaje() {
    }

    public Pasaje(int numeroVuelo, int fechaVuelo, int horaVuelo, int destinoVuelo, int numeroAsiento, int clase, int valordeVuelo) {
        this.numeroVuelo = numeroVuelo;
        this.fechaVuelo = fechaVuelo;
        this.horaVuelo = horaVuelo;
        this.destinoVuelo = destinoVuelo;
        this.numeroAsiento = numeroAsiento;
        this.clase = clase;
        this.valordeVuelo = valordeVuelo;
    }

    public Pasaje(int numeroVuelo, int numeroAsiento, int valordeVuelo) {
        this.numeroVuelo = numeroVuelo;
        this.numeroAsiento = numeroAsiento;
        this.valordeVuelo = valordeVuelo;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public int getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(int fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public int getHoraVuelo() {
        return horaVuelo;
    }

    public void setHoraVuelo(int horaVuelo) {
        this.horaVuelo = horaVuelo;
    }

    public int getDestinoVuelo() {
        return destinoVuelo;
    }

    public void setDestinoVuelo(int destinoVuelo) {
        this.destinoVuelo = destinoVuelo;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getValordeVuelo() {
        return valordeVuelo;
    }

    public void setValordeVuelo(int valordeVuelo) {
        this.valordeVuelo = valordeVuelo;
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

    @Override
    public String toString() {
        return "Pasaje{" + "numeroVuelo=" + numeroVuelo + ", fechaVuelo=" + fechaVuelo + ", horaVuelo=" + horaVuelo + ", destinoVuelo=" + destinoVuelo + ", numeroAsiento=" + numeroAsiento + ", clase=" + clase + ", valordeVuelo=" + valordeVuelo + '}';
    }

}
