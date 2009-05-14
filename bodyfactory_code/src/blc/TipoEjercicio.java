/**
 *  Este proyecto es desarrollado en el contexto
 *  del modulo Análisis y diseño orientado a objetos
 *  de la Maestría en gestión y desarrollo de software
 *  de la Universidad Autónoma de Manizales
 *
 *  @ Project : BodyFactory
 *  @ Date : 13/05/2009
 *  @author BLC Ltda.
 */
package blc;

public class TipoEjercicio {

    private String nombre;
    private String descripcion;

    public TipoEjercicio() {
    }

    public TipoEjercicio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
