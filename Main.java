/******************************************************************
Ultima modificacion: 30/09/2021

Clase main
@file Main.java
@author Montserrat Gil
@version 1.0, 30/09/2021
******************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //variables de apoyo
        Scanner scan = new Scanner(System.in);
        Manejador m = new Manejador();
        int opcion = 0;

        //menu principal del programa
        while (opcion !=5){
            System.out.println("\n\nBienvenido al programa que te informa acerca de animales en peligro de extincion.\nTambien puedes consultar a que organizaciones puedes ayudar.\nElige que quieres hacer: ");
			System.out.println("1. Ver animales en peligro");
			System.out.println("2. Consultar organizaciones junto con su informacion de contacto");
			System.out.println("3. Conoce acerca de nosotros, nuestra mision y vision");
			System.out.println("4. Iniciar sesion (esta funcion es solo para administradores)");
			System.out.println("5. Salir\n\n");

            opcion = scan.nextInt();
            scan.nextLine();

            if (opcion==1){
                //desplegar los animales
                ArrayList<Animal> animalesD = Controlador.leerAnimalesDelArchivo();
                m.desplegarAnimales(animalesD);

            } else if (opcion ==2){
                // desplegar las organizaciones
                ArrayList<Organizaciones> organizacionesD = Controlador.leerOrganizacionesDelArchivo();
                m.desplegarOrganizaciones(organizacionesD);

            }else if (opcion ==3){
                // desplegar la mision y vision
                System.out.println("-------- Vision -------");
                System.out.println("Lograr la concientizacion de la importancia de la biodiversidad y su cuidado.");
                System.out.println("-------- Mision -------");
                System.out.println("Difundir informacion de los animales, para un mayor entendimiento de su aporte a la biodiversidad.");

            }else if (opcion==4){
                //iniciar sesion
                //parte solo para administradores con usuario y password
                boolean seguir = false;
                boolean seguir2 = false;
                ArrayList<Usuario> usuariosD = Controlador.leerUsariosDelArchivo();
                System.out.println("Ingrese su usuario: ");
                String u = scan.nextLine();
                
                for (Usuario h:usuariosD){
                    if (h.revisarUsuario(u)){
                        seguir = true;
                        break;
                    }
                }
                if (seguir){
                    System.out.println("Ingrese password: ");
                    String p = scan.nextLine();
                    for (Usuario k:usuariosD){
                        if (k.revisarUsuarioYPassword(u, p)){
                            seguir2 = true;
                            break;
                        }
                    }
                } else{
                    System.out.println("Nombre de usuario no encontrado");
                }
                if (seguir2){
                    int opcion2 = 0;
                    while (opcion2 !=4){
                        System.out.println("\nBienvenido. Seleccione la opcion a realizar: ");
                        System.out.println("1. Ingresar nuevo Usuario");
                        System.out.println("2. Ingresar nuevo Animal");
                        System.out.println("3. Ingresar nueva Organizacion");
                        System.out.println("4. Salir");
                        opcion2 = scan.nextInt();
                        scan.nextLine();
                        if (opcion2==1){
                            // Ingresar usuario
                            System.out.println("A continuacion ingrese el nuevo usuario: ");
                            String nU = scan.nextLine();
                            System.out.println("A continuacion ingrese el password: ");
                            String nP = scan.nextLine();
                            Usuario nUP = new Usuario(nU, nP);
                            Controlador.agregarUsuario(nUP);
                            
                        } else if (opcion2==2){
                            // Ingresar animal
                            System.out.println("A continuacion ingrese el nombre del animal: ");
                            String nombr = scan.nextLine();
                            System.out.println("A continuacion ingrese la descripcion del animal: ");
                            String descr = scan.nextLine();
                            System.out.println("A continuacion ingrese informacion del animal: ");
                            String inf = scan.nextLine();
                            Animal nA = new Animal(nombr,descr,inf);
                            Controlador.agregarAnimal(nA);

                        } else if (opcion2==3){
                            //Ingresar organizacion
                            System.out.println("A continuacion ingrese el nombre de la organizacion: ");
                            String nO = scan.nextLine();
                            System.out.println("A continuacion ingrese el año de creacion de la organizacion: ");
                            String anio = scan.nextLine();
                            System.out.println("A continuacion ingrese la ubicacion de la organizacion: ");
                            String lug = scan.nextLine();
                            System.out.println("A continuacion ingrese la informacion de contacto de la organizacion: ");
                            String infC = scan.nextLine();
                            System.out.println("A continuacion ingrese la informacion general de la organizacion: ");
                            String infG = scan.nextLine();
                            Organizaciones nOrg = new Organizaciones(nO, anio, lug, infC, infG);
                            Controlador.agregarOrganizacion(nOrg);

                        } else if (opcion2==4){
                            //Salir
                            System.out.println("Saliendo de la sesion de administrador");
                        } else{
                            System.out.println("\nPorfavor ingrese una opcion valida.");
                        }
                    }
                } 
                if (seguir){
                    if (!seguir2){
                        System.out.println("Usuario o password incorrectos");
                    }
                }
                

            }else if (opcion ==5){
                //Salir
            } else{
                System.out.println("\nPor favor ingrese una opcion valida.");
            }
        }

        scan.close();
    }

}