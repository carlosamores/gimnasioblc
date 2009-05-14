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

public class Rutina {

    private int codigo;

    public Rutina(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void eliminarEjercicios(Vector<Ejercicio> lstEjercicios) {
    }

    public void modificarDatosEjercicios(Vector<Ejercicio> lstEjercicios) {
    }

    public void obtenerEjerciciosRutina() {
    }

    public void validarEjercicios() {
    }
}
