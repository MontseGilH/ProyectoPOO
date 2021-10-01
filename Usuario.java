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
     * @return boolean
     */
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

    
    /** 
     * verifica si el usuario conincide con la contraseña
     * @param usuario
     * @param pass
     * @return boolean
     */
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

