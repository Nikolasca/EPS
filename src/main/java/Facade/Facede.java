/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Composite.EPS;
import Adapter.Adaptador;
import Adapter.Medico;
import Adapter.Paciente;
import Adapter.Usuario;
import java.util.HashMap;

public class Facede {

    private static Facede singleton;
    private HashMap<String, Usuario> usuarios;
    private HashMap<String, EPS> eps1;
    
    
    public static Facede rConstructora() {
        if (singleton == null) {
            singleton = new Facede();
            
        }
        return singleton;
    }

    public Facede() {
        this.usuarios = new HashMap<>();
        this.eps1 = new HashMap<>();
        this.addMedico("nikolas", "123");
        this.addPaciente("minichip", "123");
        this.addAdministrador("ballesgod", "123");
    }

    public void addMedico(String login, String password) {
        usuarios.put(login, new Medico(login, password));
    }

    public void addPaciente(String login, String password) {
        usuarios.put(login, new Paciente(login, password));
    }

    public void addAdministrador(String login, String password) {
        usuarios.put(login, new Adaptador(login, password));
    }

    public void addEPS(String nombre) {
        eps1.put(nombre, new EPS(nombre));
    }

    public Usuario login(String login, String password) {
        Usuario log = usuarios.get(login);
        if (log != null && log.Acceder(login, password)) {
            return log;
        }
        return null;
    }
    public String verContratos(String name){
        EPS eps = eps1.get(name);
        String m=null;
        if(eps!=null){
            m=eps.mostrarDatos();
        }
        return m;
    }
    public String verContrarosCodigo(String name,String codigo){
        EPS eps = eps1.get(name);
        String m=null;
        if(eps!=null){
            m=eps.mostrar(codigo);
        }
        return m;
    }
    
    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public HashMap<String, EPS> getEps1() {
        return eps1;
    }
}
