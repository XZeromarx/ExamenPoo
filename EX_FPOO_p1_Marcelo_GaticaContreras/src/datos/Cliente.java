package datos;

import java.util.Objects;

/**
 * Clase que da valores a los clientes que utilizan el servicio. cuenta con
 * atributos tales como el nombre y Rut. Esta clase es hija de la clase
 * "PersonalDeCabina" y a la vez, es padre de la clase "Pasaje".
 *
 * @author XZeroMarx
 */
public class Cliente {

    private String rut;
    private String nombre;

    //constructores
    public Cliente() {
    }

    public Cliente(String rut) {
        this.rut = rut;
    }

    public Cliente(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + '}';
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.rut, other.rut)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public void Impresion() {
        System.out.println("===================");
        System.out.println("Cliente:");
        System.out.println("===================");
        System.out.println("Rut: " + rut);
        System.out.println("Nombre: " + nombre);

    }

}
