/******************************************************************
Ultima modificacion: 28/09/2021

Clase Usuario, maneja el login
@file Usuario.java
@author Montserrat
@version 1.0, 30/09/2021
******************************************************************/


public class Usuario{
    private String user;
    private String password;

    public Usuario(String user, String password){
        this.setUser(user);
        this.setPassword(password);
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String userString(){
        String devolver = "\n"+this.getUser()+"|"+this.getPassword();
        return devolver;
    }

    public boolean revisarUsuario(String usuario){
        boolean es = false;
        try{
            if (this.getUser().equalsIgnoreCase(usuario)){
                es = true;
            }
        } catch(Exception e){
            System.out.println("Error al revisar existencia de usuario");
        }
        return es;
    }

    public boolean revisarUsuarioYPassword(String usuario,String pass){
        boolean es = false;
        try{
            if (this.revisarUsuario(usuario)){
                if (this.getPassword().equalsIgnoreCase(pass)){
                    es = true;
                }
            }
        } catch(Exception e){
            System.out.println("Error al revisar existencia de usuario y password");
        }
        return es;
    }
    
}

