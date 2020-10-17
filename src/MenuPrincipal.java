import javax.swing.*;


public class MenuPrincipal extends JFrame{

    public MenuPrincipal() {

        JButton EditarPerfil = new JButton("Editar Perfil");
        JButton Alquilar = new JButton("Alquilar");
        JButton Entregar = new JButton("Entregar");
        JButton Gestionar = new JButton("Gestionar");

        EditarPerfil.addActionListener(Usuario./*etc*/);
        Alquilar.addActionListener(Usuario./*etc*/);
        Entregar.addActionListener(Usuario./*etc*/);
        Gestionar.addActionListener(Usuario./*etc*/);

    };


}
