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

public class Ejercicio extends TipoEjercicio {

    private int duracion;
    private int series;
    private String regularidad;
    private String explicacionRealizacion;

    public Ejercicio(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public Ejercicio() {
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getExplicacionRealizacion() {
        return explicacionRealizacion;
    }

    public void setExplicacionRealizacion(String explicacionRealizacion) {
        this.explicacionRealizacion = explicacionRealizacion;
    }

    public String getRegularidad() {
        return regularidad;
    }

    public void setRegularidad(String regularidad) {
        this.regularidad = regularidad;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void modificarEjercicio(Ejercicio ejercicio) {
    }

    public void obtenerDatosEjercicio() {
    }

    public Vector<Maquina> obtenerMaquinas() {
        return null;

    }
}
