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

import java.util.Vector;

public class CategoriaEjercicio {

    private int codigo;
    private String nombre;

    public void CategoriaEjercicio() {
    }

    public CategoriaEjercicio(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaEjercicio obtenerCategoria() {
        return null;
    }

    public Vector<Ejercicio> obtenerEjercicios() {
        return null;
    }
}
