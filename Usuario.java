/******************************************************************
Ultima modificacion: 30/09/2021

Clase Usuario, maneja el login
@file Usuario.java
@author Montserrat y Joab
@version 1.0, 30/09/2021
******************************************************************/


public class Usuario{
    private String user;
    private String password;

    /**
     * Método constructor
     * @param user
     * @param password
     */
    public Usuario(String user, String password){
        this.setUser(user);
        this.setPassword(password);
        
    }

    /** 
     * regresa la variable password
     * @return String
     */
    public String getPassword() {
        return password;
    }

    
    /** 
     * inserta el valor a la variable password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    
    /** 
     * regresa la variable user
     * @return String
     */
    public String getUser() {
        return user;
    }

    
    /** 
     * inserta la variable user
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    
    /** 
     * regresa el usuario y contraseña en un String
     * Sirve para luego pasarlo a archivos
     * @return String
     */
    public String userString(){
        String devolver = "\n"+this.getUser()+"|"+this.getPassword();
        return devolver;
    }

    
    /** 
     * verifica si el usuario existe
     * @param usuario
     * @return int
     * 0 = existe
     * 1 = no existe o error
     */
    public int revisarUsuario(String usuario){
        int es = 1;
        try{
            if (this.getUser().equalsIgnoreCase(usuario)){
                es = 0;
            }
        } catch(Exception e){
            
        }
        return es;
    }

    
    /** 
     * verifica si el usuario conincide con la contraseña
     * @param usuario usuario
     * @param pass contraseña
     * @return int
     * 0 = si existe
     * 1 = no existe o error
     */
    public int revisarUsuarioYPassword(String usuario,String pass){
        int es = 1;
        try{
            if (this.revisarUsuario(usuario)==0){
                if (this.getPassword().equalsIgnoreCase(pass)){
                    es = 0;
                }
            }
        } catch(Exception e){
            
        }
        return es;
    }
    
}

