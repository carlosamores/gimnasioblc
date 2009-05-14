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

public class Objetivo {

    private int codigo;
    private String nombre;
    private String descripcion;

    public Objetivo() {
    }

    public Objetivo(int codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
