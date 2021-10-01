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
     * Asigna el valor a la variable nombre
     * @param nom the nombre to set
     */
    public void setNombre(String nom){
        this.nombre = nom;
    }

    /**
     * Devuelve el valor de la variable nombre
     * @return the nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Asigna el valor a la variable descripcion
     * @param des the descripcion to set
     */
    public void setDescripcion(String des){
        this.descripcion = des;
    }

    /**
     * Devuelve el valor de la variable descripcion
     * @return the descripcion
     */
    public String getDescripcion(){
        return descripcion;
    }

    /**
     * Asigna el valor de la variable informacion
     * @param info the informacion to set
     */
    public void setInformacion(String info){
        this.informacion = info;
    }

    /**
     * Devuelve el valor de la variable informacion
     * @return the informacion
     */
    public String getInformacion(){
        return informacion;
    }

    /**
     * Devuelve el valor de las tres variables
     * @return string
     */
    public String animalString(){
        String s = "\n"+this.getNombre()+"|"+this.getDescripcion()+"|"+this.getInformacion();
        return s;
    }

}
