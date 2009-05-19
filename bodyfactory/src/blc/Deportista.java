package blc;

import java.util.ArrayList; 
import java.util.Date; 
import java.util.Vector;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.895DBE61-090E-90F0-E4CE-67F126EE6FB2]
// </editor-fold> 
public class Deportista extends Usuario {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.00988670-02DA-708C-67FC-2D1770DE1645]
    // </editor-fold> 
    private String genero;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DC54364B-C965-222C-B912-CF90A452F918]
    // </editor-fold> 
    private Date fechaNacimiento;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AACAE7CB-7FF6-8098-A144-288CEFD56D6E]
    // </editor-fold> 
    private Perfil per;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FE52BEBC-1C1E-BCEE-91E8-351F5EA85ABB]
    // </editor-fold> 
    private ArrayList<Objetivo> objetivos;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B1067AC7-C0B2-B2E8-74FB-229BC7CE6EDA]
    // </editor-fold> 
    private AdaptarRutina ar;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9D6ECC55-0380-512C-4158-5E7799126C61]
    // </editor-fold> 
    private Rutina mRutina;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FC8A662B-D33D-D2E9-19D1-0615D99738FE]
    // </editor-fold> 
    public Deportista () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C73F233B-DDBE-2F00-736C-A51693DB1D9A]
    // </editor-fold> 
    public Deportista (String identificacion, String nombre, String apellido) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.70A2BBBF-0133-01AB-B435-8B659EA6FAB1]
    // </editor-fold> 
    public void almacenarRutina (Rutina rut) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C82683A4-F383-9E5D-91C2-09AE54BC305E]
    // </editor-fold> 
    public void modificarRutina (Vector<Ejercicio> lstEjercicios) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.336D5E1A-85A0-978F-7F77-509AA8431537]
    // </editor-fold> 
    public String obtenerCodigoNombre () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ACFA537A-E917-775D-190E-72205671D1B6]
    // </editor-fold> 
    public Deportista obtenerDeportista (String identificacion) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BE40D8FE-A363-FCDA-0526-953678DD4B18]
    // </editor-fold> 
    public void obtenerIdNombre () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B378201D-E1FA-33BC-3FD9-243C1BB09175]
    // </editor-fold> 
    public Vector<Objetivo> obtenerObjetivos () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F66E06A1-BB5B-74A0-3605-2BE73736C580]
    // </editor-fold> 
    public Perfil obtenerPerfil () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1956D5EA-BD51-E407-D126-E68FC18392E3]
    // </editor-fold> 
    public void obtenerRutina (Deportista dep) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D3A08E80-E5D2-18C9-36FE-FA1C19BCDE02]
    // </editor-fold> 
    public AdaptarRutina getAr () {
        return ar;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0897CCC2-7439-CF83-5817-DA691E9E24B0]
    // </editor-fold> 
    public void setAr (AdaptarRutina val) {
        this.ar = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.37E13450-1F3B-B19A-FA8F-20A955205EEF]
    // </editor-fold> 
    public Rutina getRutina () {
        return mRutina;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.81D92205-C3FB-E2B6-3448-6DF1F175EE8F]
    // </editor-fold> 
    public void setRutina (Rutina val) {
        this.mRutina = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AE2C1890-38F9-CCAE-AE12-81315E1F54BD]
    // </editor-fold> 
    public ArrayList<Objetivo> getObjetivos () {
        return objetivos;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B9E4ECC0-2AB3-E8FB-D8EE-6061EA5CED4D]
    // </editor-fold> 
    public void setObjetivos (ArrayList<Objetivo> val) {
        this.objetivos = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F92E38B7-BF08-4A8B-9728-AA6DAC9F4758]
    // </editor-fold> 
    public Perfil getPer () {
        return per;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.35E08E4F-D914-2AC1-D256-47ECB00CD493]
    // </editor-fold> 
    public void setPer (Perfil val) {
        this.per = val;
    }

}

