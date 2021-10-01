/******************************************************************
Ultima modificacion: 28/09/2021

Clase organizaciones
@file Organizaciones.java
@author Jose
@version 1.0, 29/09/2021
******************************************************************/


public class Organizaciones {

    private String nombre;
    private String annioDeCreacion;
    private String lugar;
    private String informacionDeContacto;
    private String informacion;

    public Organizaciones(String nombre, String annioDeCreacion, String lugar, String informacionDeContacto, String informacion) {
        this.setNombre(nombre);
        this.setAnnioDeCreacion(annioDeCreacion);
        this.setLugar(lugar);
        this.setInformacionDeContacto(informacionDeContacto);
        this.setInformacion(informacion);
    }
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setAnnioDeCreacion(String annio){
        this.annioDeCreacion=annio;
    }
    public String getAnnioDeCreacion(){
        return annioDeCreacion;
    }
    public void setLugar(String lug){
        this.lugar=lug;
    }
    public String getLugar(){
        return lugar;
    }
    public void setInformacionDeContacto(String infoC){
        this.informacionDeContacto=infoC;
    }
    public String getInformacionDeContacto() {
        return informacionDeContacto;
    }
    public void setInformacion(String info){
        this.informacion=info;
    }
    public String getInformacion(){
        return informacion;
    }

    public String organizacionesString(){
        String s = "\n"+this.getNombre()+"|"+this.getAnnioDeCreacion()+"|"+this.getLugar()+"|"+this.getInformacionDeContacto()+"|"+this.getInformacion();
        return s;
    }

    }
