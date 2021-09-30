/******************************************************************
Ultima modificacion: 28/09/2021

Clase Manager
@file Manager.java
@author Joab y Montserrat
@version 1.0, 28/09/2021
******************************************************************/
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.File;

public class Manager<File><File> {
    
    public void ingresarUsuario(Usuario u){
        String s = u.userString();
        String path = "registro.txt";
        try{
            Files.writeString(Paths.get(path), s);
        } catch (Exception e){
            System.out.println("Error al ingresar usuario al file");
        }
    }

    //vaiables
    boolean error;

    //ruta
    String rutaAnimales = "animales.txt";//nombre de archivo donde se guardan los animales
    String rutaUsuarios = "usuarios.txt";

    //File
    File fileanimal = new File(rutaAnimales);


    //constructor
    Manager(){

    }

    //verificar existencia de archivo
    public boolean archivoExisteAnimales(){
        
        error = false;

        try{
            if(!fileanimal.exists()){
            
                fileanimal.createNewFile();
    
            }
        }
        catch(IOException e){

            error = true;

        }
        

        return error;
        
    }


    //ingresa animales
    public boolean ingresarAnimal(String nombre, String descripcion, String informacion){

        error = false;

        try{

            FileWriter fw = new FileWriter(fileanimal);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nombre);
            bw.write(descripcion);
            bw.write(informacion);
            bw.close();

        }catch(IOException e){

            error = true;

        }

        return error;
    }


}

}
