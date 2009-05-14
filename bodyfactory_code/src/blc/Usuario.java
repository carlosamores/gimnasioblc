/**
 *  Este proyecto es desarrollado en el contexto
 *  del modulo Análisis y diseño orientado a objetos
 *  de la Maestría en gestión y desarrollo de software
 *  de la Universidad Autónoma de Manizales
 * 
 *  @ Project : BodyFactory
 *  @ Date : 13/05/2009
 *  @ author BLC Ltda.
 */
package blc;

public class Usuario {

    private String identificacion;
    private String nombre;
    private String apellido;
    private String login;
    private String password;

    public Usuario() {
    }

    public Usuario(String identificacion, String nombre, String apellido) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
