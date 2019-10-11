/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

public class Administrador {

    private String tipousuario;
    private String usuario;
    private String contrasena;
    public Administrador(String usuario, String password) {
        this.tipousuario = "Administrador";
        this.usuario = usuario;
        this.contrasena = password;
    }
    public boolean Ingresar(String usuario, String contrasena) {
        return (usuario.equals(this.getUsuario()) && contrasena.equals(this.getContrasena()));
    }

    public String obtenerUsuario() {
        return usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usaurio) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

}
