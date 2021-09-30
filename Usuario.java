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
    private String correoElectronico;

    public Usuario(String user, String password, String correoElectronico){
        this.setUser(user);
        this.setPassword(password);
        this.setCorreoElectronico(correoElectronico);
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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
        String devolver = this.getUser()+" "+this.getPassword()+" "+this.getCorreoElectronico();
        return devolver;
    }
    
}

