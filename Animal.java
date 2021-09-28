/******************************************************************
Ultima modificacion: 28/09/2021

Clase animal
@file Animal.java
@author Lourdes
@version 1.0, 28/09/2021
******************************************************************/

public class Animal {
 
    private String nombre;
    private String descripcion;
    private String informacion;


    public Animal(String nombre, String descripcion, String informacion){
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setInformacion(informacion);
    }

    /**
     * 
     * @param nom the nombre to set
     */
    public void setNombre(String nom){
        this.nombre = nom;
    }

    /**
     * 
     * @return the nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * 
     * @param des the descripcion to set
     */
    public void setDescripcion(String des){
        this.descripcion = des;
    }

    /**
     * 
     * @return the descripcion
     */
    public String getDescripcion(){
        return descripcion;
    }

    /**
     * 
     * @param info the informacion to set
     */
    public void setInformacion(String info){
        this.informacion = info;
    }

    /**
     * 
     * @return the informacion
     */
    public String getInformacion(){
        return informacion;
    }

}
