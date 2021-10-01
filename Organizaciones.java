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
    /* Asigna el valor a la variable nombre
     * @Param nom the nombre to set
     */

    public void setNombre(String nom){
        this.nombre=nom;
    }
    /* Devuelve el valor de la variable nombre
    * @return the nombre
    */
    public String getNombre(){
        return nombre;
    }
    /* Asigna valor a la variable AnnioDeCreacion
    * @Param annio the annioDeCreacion to set
     */
    public void setAnnioDeCreacion(String annio){
        this.annioDeCreacion=annio;
    }
    /* Devuelve el valor de la variable annioDeCreacion
    * @return the annioDeCreacion
     */
    public String getAnnioDeCreacion(){
        return annioDeCreacion;
    }
    /* Asigna el valor a la variable lugar
    * @Param lug the lugar to set
     */
    public void setLugar(String lug){
        this.lugar=lug;
    }
    /* Devuelve el valor de la variable lugar
    *@return the lugar
     */
    public String getLugar(){
        return lugar;
    }
    /* Asigna el valor a la variable informacionDeContacto
    *@Param infoC the informacionDeContacto to set
     */
    public void setInformacionDeContacto(String infoC){
        this.informacionDeContacto=infoC;
    }
    /* Devuelve el valor de la variable informacionDeContacto
    *@return othe informacionDeContacto
     */
    public String getInformacionDeContacto() {
        return informacionDeContacto;
    }
    /* Asigna el valor de la variable informacion
    *@Param info the informacion to set
     */
    public void setInformacion(String info){
        this.informacion=info;
    }
    /* Devuelve el valor de la variable informacion
    *@return the informacion
     */
    public String getInformacion(){
        return informacion;
    }

    /* Asigna valor a la variable s
    @return the s
     */
    public String organizacionesString(){
        String s = "\n"+this.getNombre()+"|"+this.getAnnioDeCreacion()+"|"+this.getLugar()+"|"+this.getInformacionDeContacto()+"|"+this.getInformacion();
        return s;
    }

    }
