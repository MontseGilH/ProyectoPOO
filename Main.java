/******************************************************************
Ultima modificacion: 28/09/2021

Clase main
@file Main.java
@author Montserrat Gil
@version 1.0, 28/09/2021
******************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Manejador m = new Manejador();
        Controlador c = new Controlador();
        int opcion = 0;
        while (opcion !=5){
            System.out.println("\n\nBienvenido al programa que te informa acerca de animales en peligro de extincion.\nTambien puedes consultar a que organizaciones puedes ayudar.\nElige que quieres hacer.");
			System.out.println("1. Ver animales en peligro");
			System.out.println("2. Consultar organizaciones junto con su informacion de contacto");
			System.out.println("3. Conoce acerca de nosotros, nuestra mision y vision");
			System.out.println("4. Iniciar sesion (esta funcion es solo para administradores)");
			System.out.println("5. Salir\n\n");

            opcion = obtenerInt();

            if (opcion==1){
                ArrayList<Animal> animalesD = c.leerAnimalesDelArchivo();
                m.desplegarAnimales(animalesD);
            } else if (opcion ==2){

            }else if (opcion ==3){

            }else if (opcion==4){
                boolean seguir = false;
                ArrayList<Usuario> usuariosD = c.leerUsariosDelArchivo();
                System.out.println("Ingrese su usuario: ");
                String u = scan.nextLine();
                for (Usuario h:usuariosD){
                    if (h.revisarUsuario(u)){
                        seguir = true;
                        break;
                    }
                }
                if (seguir){
                    System.out.println("Ingrese contraseña: ");
                    String
                } else{
                    System.out.println("Nombre de usuario no encontrado");
                }
                //System.out.println("Ingrese el password: ");
                //String p = scan.nextLine();
                //for (Usuario l:usuariosD){

                //}

            }else if (opcion ==5){

            } else{
                System.out.println("\nPor favor ingrese una opcion valida.");
            }
        }

        scan.close();
    }










    public static int obtenerInt(){
        Scanner scan = new Scanner(System.in);
        boolean sies = false;
        int n = 0;
        while (!sies){
            try {
                n = scan.nextInt();
                scan.nextLine();
                sies = true;
            } catch (Exception e){
                System.out.println("Por favor ingrese un numero entero");
            }
        }
        scan.close();
        return n;
    }
}
