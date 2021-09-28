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


    public Animal(){

        nombre = "";
        descripcion = "";
        informacion = "";

    }

    /**
     * 
     * @param nom the nombre to set
     */
    public void setNombre(String nom){

        nombre = nom;

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

        nombre = des;

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

        nombre = info;

    }

    /**
     * 
     * @return the informacion
     */
    public String getInformacion(){

        return informacion;

    }

}
