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
    
    /** 
     * Este metodo sirve para introducir informacion en un archivo
     * @param nombreArchivo  se necesita el path relativo
     * @param texto  texto que se agregara
     * @param append determina si la informacion va al final
     * @throws IOException
     * @return funciona 
     * true = funciona
     * false = no funciona
     */
    public static boolean guardarEnFile(String nombreArchivo, String texto, boolean append) throws IOException{
        try{
        File file1 = new File(nombreArchivo);
        FileWriter fw = new FileWriter(file1,append);
        PrintWriter pw = new PrintWriter(fw);
        pw.write(texto);
        pw.close();
        return true;
        }catch(Exception e){
            return false;
        }
    }

    
    /** 
     * Este metodo sirve para ingresar animales al file de animales
     * @param a animal
     * @return funciona
     */
    public static boolean agregarAnimal(Animal a){
        try{
            guardarEnFile("animalesFile.txt", a.animalString(), true); 
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
    /** 
     * Este metodo agrega usuarios a el file
     * @param u usuario
     * @return funciona
     */
    public static boolean agregarUsuario(Usuario u){
        try{
            guardarEnFile("registro.txt", u.userString(), true); 
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
    /** 
     * Este metodo agrega organizaciones con todo y su informacion al file
     * @param o organizacion
     * @return funciona
     */
    public static boolean agregarOrganizacion(Organizaciones o){
        try{
            guardarEnFile("organizacionesFile.txt", o.organizacionesString(), true); 
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    
    /** 
     * Este metodo lee el archivo y devuelve un array de animales
     * Sirve para poder utilizar los animales como objetos junto a sus metodos
     * @return ArrayList<Animal>
     */
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
            
        }
        return listaAnimales;
        
    }

    
    /** 
     * Este metodo lee el archivo y devuelve un array de usuarios
     * Sirve para poder utilizar los usuarios como objetos junto a sus metodos
     * @return ArrayList<Usuario>
     */
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
            
        }
        return listaUsuarios;
    }

    
    /** 
     * Este metodo lee el archivo y devuelve un array de organizaciones
     * Sirve para poder utilizar las organizaciones como objetos junto a sus metodos
     * @return ArrayList<Organizaciones>
     */
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
            
        }
        return listaOrganizaciones;
        
    }


}
