/******************************************************************
Ultima modificacion: 30/09/2021

Clase manejador maneja todas las funcionalidades en si del programa.
Estas funciones estan enfocadas a el controlador del programa
@file Manejador.java
@author Montserrat
@version 1.0, 30/09/2021
******************************************************************/

import java.util.ArrayList;

public class Manejador {
    public void desplegarAnimales(ArrayList<Animal> a){
        try{
            int i = 1;
            System.out.println("\nLos animales en peligro son los siguientes: ");
            for (Animal l:a){
                System.out.println("\n------------ Animal "+i+" ------------");
                System.out.println("Nombre: "+l.getNombre());
                System.out.println("Descripcion: "+l.getDescripcion());
                System.out.println("Informacion: "+l.getInformacion());
                i+=1;
            }
        } catch(Exception e){
            System.out.println("Error al desplegar animales");
        }
    }

    public void desplegarOrganizaciones(ArrayList<Organizaciones> o){
        try{
            int i = 1;
            System.out.println("\nLas organizaciones a las que te puedes contactar para donar son: ");
            for (Organizaciones l:o){
                System.out.println("\n------------ Organizacion "+i+" ------------");
                System.out.println("Nombre: "+l.getNombre());
                System.out.println("Fecha en la que iniciaron: "+l.getAnnioDeCreacion());
                System.out.println("Ubicacion: "+l.getLugar());
                System.out.println("Informacion de contacto: "+l.getInformacionDeContacto());
                System.out.println("Acerca de ellos: "+l.getInformacion());
                i+=1;
            }
        }catch(Exception e){
            System.out.println("Error al desplegar organizaciones");
        }
    }

}
