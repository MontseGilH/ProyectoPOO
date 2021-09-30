/******************************************************************
Ultima modificacion: 30/09/2021

Clase controlador maneja todos los arhivos del programa
@file Controlador.java
@author Montserrat
@version 1.0, 30/09/2021
******************************************************************/

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    public static void guardarEnFile(String nombreArchivo, String texto, boolean append) throws IOException{
        File file1 = new File(nombreArchivo);
        FileWriter fw = new FileWriter(file1,append);
        PrintWriter pw = new PrintWriter(fw);
        pw.write(texto);
        pw.close();
    }

    public static void agregarAnimal(Animal a){
        try{
            guardarEnFile("animalesFile.txt", a.animalString(), true); 
        } catch (IOException e) {
            System.out.println("Error al agregar Animal");
        }
    }
    public static void agregarUsuario(Usuario u){
        try{
            guardarEnFile("registro.txt", u.userString(), true); 
        } catch (IOException e) {
            System.out.println("Error al agregar usuario");
        }
    }
    public static void agregarOrganizacion(Organizaciones o){
        try{
            guardarEnFile("organizacionesFile.txt", o.organizacionesString(), true); 
        } catch (IOException e) {
            System.out.println("Error al agregar usuario");
        }
    }

    public static ArrayList<Animal> leerAnimalesDelArchivo(){
        ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
        try{
            File file = new File("animalesFile.txt");
            Scanner s = new Scanner(file);
            
            while (s.hasNextLine()){
                String linea = s.nextLine();
                String[] items = linea.split("\\|");
                
                String nombre = items[0];
                String descripcion = items[1];
                String informacion = items[2];

                Animal nuevoAnimal = new Animal(nombre, descripcion, informacion);
                listaAnimales.add(nuevoAnimal);
            }
            s.close();
        } catch (Exception e){
            System.out.println("Error al leer animales");
        }
        return listaAnimales;
        
    }

    public static ArrayList<Usuario> leerUsariosDelArchivo(){
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
        try{
            File file = new File("registro.txt");
            Scanner s = new Scanner(file);
            
            while (s.hasNextLine()){
                String linea = s.nextLine();
                String[] items = linea.split("\\|");
                
                String user = items[0];
                String password = items[1];

                Usuario nuevoUsuario = new Usuario(user, password);
                listaUsuarios.add(nuevoUsuario);
            }
            s.close();
        } catch (Exception e){
            System.out.println("Error al leer Usuarios");
        }
        return listaUsuarios;
    }

    public static ArrayList<Organizaciones> leerOrganizacionesDelArchivo(){
        ArrayList<Organizaciones> listaOrganizaciones = new ArrayList<Organizaciones>();
        try{
            File file = new File("organizacionesFile.txt");
            Scanner s = new Scanner(file);
            
            while (s.hasNextLine()){
                String linea = s.nextLine();
                String[] items = linea.split("\\|");
                
                String nombre = items[0];
                String annioDeCreacion = items[1];
                String lugar= items[2];
                String informacionDeContacto= items[3];
                String informacion= items[4];

                Organizaciones nuevaOrganizaciones = new Organizaciones(nombre, annioDeCreacion, lugar, informacionDeContacto, informacion);
                listaOrganizaciones.add(nuevaOrganizaciones);
            }
            s.close();
        } catch (Exception e){
            System.out.println("Error al leer Organizaciones");
        }
        return listaOrganizaciones;
        
    }
}
