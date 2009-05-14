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

public class Perfil {

    private float altura;
    private float peso;
    private float presionSanguinea;
    private float ritmoCardiaco;
    private float medidaCintura;
    private float medidaPiernas;
    private float medidaBrazos;

    public Perfil() {
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getMedidaBrazos() {
        return medidaBrazos;
    }

    public void setMedidaBrazos(float medidaBrazos) {
        this.medidaBrazos = medidaBrazos;
    }

    public float getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(float medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public float getMedidaPiernas() {
        return medidaPiernas;
    }

    public void setMedidaPiernas(float medidaPiernas) {
        this.medidaPiernas = medidaPiernas;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPresionSanguinea() {
        return presionSanguinea;
    }

    public void setPresionSanguinea(float presionSanguinea) {
        this.presionSanguinea = presionSanguinea;
    }

    public float getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(float ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }
}
