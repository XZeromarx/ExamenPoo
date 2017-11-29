package datos;

import java.util.Objects;

/**
 * Clase que será heredada a Azafate y Piloto. Contiene todos los atributos y
 * métodos que usarán las clases que hereden de esta. Esta clase no puede ser
 * instanciada, ya que los constructores están con accesibilidad
 * protegida(protected) y la clase es abstracta. Por lo tanto, solo las clases
 * hijas de esta pueden ver estos constructores. Además, esta clase entrega
 * valores predefinidos para que los atributos y variables no se encuentren
 * vacíos al momento de asignarse.
 *
 * @author XZeroMarx
 *
 *
 */
public abstract class PersonalDeCabina {

    private String rut;
    private String nombre = "sinNombre";
    private String apellido = "sin Apellido";
    private String nacionalidad;
    private int edad = 21;

    /**
     * @return el rut que se le asigne al atributo
     */
    public String getRut() {
        return rut;
    }

    /**
     * setea el rut.
     *
     * @param rut
     *
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     *
     * @return el nombre asignado al atributo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setea el nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el apellido asignado al atributo.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Setea el apellido
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return la nacionalidad asignada al atributo
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Setea la nacionalidad
     *
     * @param nacionalidad
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     *
     * @return la edad asignada al atributo
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setea la edad
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return String con los datos de el personal de cabina
     */
    @Override
    public String toString() {
        return "PersonalDeCabina{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad=" + edad + '}';
    }

    /**
     *
     * @return int para comparacion de Objetos
     */
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /**
     *
     * @return boolean para verificar la comparacion de los objetos
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
        final PersonalDeCabina other = (PersonalDeCabina) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.rut, other.rut)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        return true;
    }

    /**
     * Retorna Texto explicitando el contenido de los atributos de la clase
     */
    public void Impresion() {
        System.out.println("===================");
        System.out.println("Personal de Cabina");
        System.out.println("===================");
        System.out.println("Rut: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Edad: " + edad);
    }

}
