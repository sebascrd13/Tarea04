package Tarea04;
import javax.swing.JOptionPane;

public class cobros {

    private String cliente;
    private String subscripcion;
    private String registro;

    public cobros(String cliente, String subscripcion, String registro){
    this.cliente = cliente;
    this.subscripcion  = subscripcion;
    this.registro  = registro;
}

public String getCliente() {
return cliente;
}

public String getSubscripcion() {
return subscripcion;
}

public String getRegistro(){
return registro;
}

}
