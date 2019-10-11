
package Adapter;


public class Adaptador extends Usuario {
    private Administrador Administrador;
   
    public Adaptador(String login, String password) {
        super();
        this.Administrador=new Administrador(login, password);
        super.setTipouser(Administrador.getTipousuario());
    }

    public Adaptador() {
        super();
        this.Administrador = Administrador;
    }

    @Override
    public void tipouser() {
        this.Administrador.obtenerUsuario();
    }

    @Override
    public boolean Acceder(String login, String password) {
          return this.Administrador.Ingresar(login, password);
    }
}
