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

public class Manager {
    
    public void ingresarUsuario(Usuario u){
        String s = u.userString();
        String path = "registro.txt";
        try{
            Files.writeString(Paths.get(path), s);
        } catch (Exception e){
            System.out.println("Error al ingresar usuario al file");
        }
    }
}
