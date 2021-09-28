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

    //Getters y Setters
    public void setNombre(String nom){

        nombre = nom;

    }

    public String getNombre(){

        return nombre;

    }

    public void setDescripcion(String des){

        nombre = des;

    }

    public String getDescripcion(){

        return descripcion;

    }

    public void setInformacion(String info){

        nombre = info;

    }

    public String getInformacion(){

        return informacion;

    }

}
