/******************************************************************
Ultima modificacion: 28/09/2021

Clase organizaciones
@file Organizaciones.java
@author Jose
@version 1.0, 29/09/2021
******************************************************************/


public class Organizaciones {

    private String Nombre;
    private String AnnioDeCreacion;
    private String Lugar;
    private String InformacionDeContacto;
    private String Informacion;

    public Organizaciones(String Nombre, String AnnioDeCreacion, String Lugar, String InformacionDeContacto, String Informacion) {
        this.setNombre(Nombre);
        this.setAnnioDeCreacion(AnnioDeCreacion);
        this.setLugar(Lugar);
        this.setInformacionDeContacto(InformacionDeContacto);
        this.setInformacion(Informacion);
    }
    public void setNombre(String nom){
        this.Nombre=nom;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setAnnioDeCreacion(String Annio){
        this.AnnioDeCreacion=Annio;
    }
    public String getAnnioDeCreacion(){
        return AnnioDeCreacion;
    }
    public void setLugar(String Lug){
        this.Lugar=Lug;
    }
    public String getLugar(){
        return Lugar;
    }
    public void setInformacionDeContacto(String InfoC){
        this.InformacionDeContacto=InfoC;
    }
    public String getInformacionDeContacto() {
        return InformacionDeContacto;
    }
    public void setInformacion(String Info){
        this.Informacion=Info;
    }
    public String getInformacion(){
        return Informacion;
    }

    }
