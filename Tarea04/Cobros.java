package Tarea04;
import javax.swing.JOptionPane;

public class Cobros {

    private String cliente;
    private String subscripcion;
    private String registro;

    public Cobros(String cliente, String subscripcion, String registro){
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

    public static void pago(){

        int opcion1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese la cantidad a cancelar :"));
      
        byte opcion2 = Byte.parseByte(JOptionPane.showInputDialog(
                "Pago en Tarjeta = 1"+"\n"+
                "Pago Efectivo =2"+
                "\n"+"Cancelar Pago = 3"+
                "\n"+
                "Arreglo de Pago = 4"));
        if (opcion2 == 1) {
            JOptionPane.showInputDialog(
                    "Usted esta pagando:" + opcion1 + "colones" + "\n"
                    + "en Tarjeta");
        }

        if (opcion2 == 2) {
            JOptionPane.showInputDialog(
                    "Usted esta pagando:" + opcion1 + "colones" + "\n"
                    + "en Efectivo");
        }
        
        if (  opcion2 == 4) {
             JOptionPane.showMessageDialog(null,
                    "Usted ingreso:" + opcion1 + "colones de arreglo de pago");
            }
        else {
            JOptionPane.showMessageDialog(null,
                    "Usted Canceló el pago");
        }

    }

}
