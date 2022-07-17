/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pande
 */
public class persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String provincia;
    private String ciudad;
    private String fechaNac;
    private String nacionalidad;
    private String sexo;
    private String estadoCivil;

    public persona(String cedula, String nombre, String apellido, String provincia, String ciudad, String fechaNac, String nacionalidad, String sexo, String estadoCivil) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", provincia=" + provincia + ", ciudad=" + ciudad + ", fechaNac=" + fechaNac + ", nacionalidad=" + nacionalidad + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
    
    
}
