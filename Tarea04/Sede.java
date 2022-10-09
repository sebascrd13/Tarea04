package Tarea04;
import javax.swing.JOptionPane;

public class Sede {
    private String ubicacion;
    private String horario;
    private String areasEntreno;
    private String personal;
    private String parqueo;

    public Sede(String ubicacion, String horario,
    String areasEntreno, String personal, String parqueo ){
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.areasEntreno = areasEntreno;
        this.personal = personal;
        this.parqueo = parqueo;

    }

    public String getUbicacion(){
        return ubicacion;
    }

    public String getHorario(){
        return horario;
    }

    public String getAreasEntreno(){
        return areasEntreno;
    }

    public String getPersonal(){
        return personal;
    }

    public String getParqueo(){
        return parqueo;
    }
    
    public void registro(){

        String nombre = JOptionPane.showInputDialog
        ("Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog
        ("Ingrese su apellido: ");
        String hora = JOptionPane.showInputDialog
        ("Ingrese horario deseado:");

        JOptionPane.showMessageDialog(null,
        "Nombre: "+ nombre + apellido + "\n" + 
        "Horario seleccionado: "+ hora );
    }
}
