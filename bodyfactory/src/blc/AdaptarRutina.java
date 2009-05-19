package blc;

import java.util.ArrayList; 
import java.util.Map; 
import java.util.Vector;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.31BE4A18-E3DA-8992-5077-85C906B41403]
// </editor-fold> 
public class AdaptarRutina {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C6BE113E-8B60-FBC7-F16E-5B4A745F219A]
    // </editor-fold> 
    private Rutina rut;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BEC3F84B-84C8-7F8C-2861-63FB186BCBD5]
    // </editor-fold> 
    private ArrayList<Ejercicio> ejer;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.806538F2-CFE5-3B5F-41BE-278B1AF39AE9]
    // </editor-fold> 
    private CategoriaEjercicio cateje;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F22D6876-044C-56C0-E4CA-8D4836F85276]
    // </editor-fold> 
    public AdaptarRutina () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1B849267-D9F8-1FA5-85CD-E25393D6D73A]
    // </editor-fold> 
    public void almacenarRutina (Deportista selectDeportista, Rutina rut) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.26C07D10-81AE-DAB8-4A08-0130658823C0]
    // </editor-fold> 
    public Deportista buscarDeportista (String identificador) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.83B03543-F986-A7B6-F0FD-460B4F6268D7]
    // </editor-fold> 
    public void eliminarEjercicios (Vector<Ejercicio> lstEjercicios) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E41C59B9-C314-BD10-C81B-02E33754BD28]
    // </editor-fold> 
    public Map listarDeportistas () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1EB28961-6D64-5F5C-7CCE-FB8D6BC9F753]
    // </editor-fold> 
    public void modificarDatosEjercicios (Vector<Ejercicio> lstEjercicios) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F8A315FC-814B-54AD-629F-A4BBF728267F]
    // </editor-fold> 
    public void modificarEjercicio (Deportista selectDeportista, Ejercicio selectEjercicio) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0BDA9EA7-A2C3-9C28-4182-33818C373439]
    // </editor-fold> 
    public void modificarRutina (Deportista dep, Vector<Ejercicio> lstEjercicios) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7E69B893-FF2E-F93F-73AE-1D675FDA86C5]
    // </editor-fold> 
    public Vector<CategoriaEjercicio> obtenerCategorias () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.97FAB74B-B72E-824A-1AD4-5CC4E34641B9]
    // </editor-fold> 
    public void obtenerEjerciciosCategoria (CategoriaEjercicio selectCategoria) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FE4B7FD6-1DDE-A319-8685-1BBE04834D25]
    // </editor-fold> 
    public void obtenerMaquinasEjercicio (Ejercicio selectEjercicio) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.65086A0A-0296-07EB-0F43-8697183A55E6]
    // </editor-fold> 
    public Vector<Objetivo> obtenerObjetivos (Deportista dep) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.40CCB9AA-7F73-52B3-6932-85A0B8325095]
    // </editor-fold> 
    public Perfil obtenerPerfil (Deportista dep) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3AB3667B-C0D0-4F10-CB98-6AFDE1C1BD8B]
    // </editor-fold> 
    public Rutina obtenerRutina (Deportista dep) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7F05D419-8F0C-1DE6-A5CB-F83AE609777B]
    // </editor-fold> 
    public void validarInformacionEjercicios () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0BD9D432-05A7-66F9-486E-1EB4C38BAE08]
    // </editor-fold> 
    public void validarRutina (Rutina rut) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3A868593-9B39-C358-4D79-2C3391DCEC85]
    // </editor-fold> 
    public CategoriaEjercicio getCateje () {
        return cateje;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.598BB4C3-1182-9EF9-3A47-4EBBE20258CA]
    // </editor-fold> 
    public void setCateje (CategoriaEjercicio val) {
        this.cateje = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.78F5A419-C027-26D7-056A-609F0BF346E4]
    // </editor-fold> 
    public ArrayList<Ejercicio> getEjer () {
        return ejer;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0A9DC51A-CD9B-7485-FEF9-8F79F57540A6]
    // </editor-fold> 
    public void setEjer (ArrayList<Ejercicio> val) {
        this.ejer = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.07B5F54F-AEB9-EE95-B705-21DFBEC5FB7A]
    // </editor-fold> 
    public Rutina getRut () {
        return rut;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3FC359FB-909A-D066-C22D-73FF776973E8]
    // </editor-fold> 
    public void setRut (Rutina val) {
        this.rut = val;
    }

}

