package model;

import java.util.Objects;

/**
 *
 * @author XZeroMarx
 */
public class PersonalDeCabina {

    private String rut;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;

    protected PersonalDeCabina() {
    }

    protected PersonalDeCabina(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    protected PersonalDeCabina(String rut, String nombre, String apellido, String nacionalidad, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "PersonalDeCabina{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad=" + edad + '}';
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

    //metodo de impresion
    //javadoc
    
    
}
