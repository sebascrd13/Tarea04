package Tarea04;
import javax.swing.JOptionPane;

public class Servicios {
    private String plan_nutri;
    private String spa;
    private String lockers;
    
    public Servicios(String plan_nutri, String spa,
    String lockers){
        this.plan_nutri = plan_nutri;
        this.lockers = lockers;
        this.spa = spa;
    }

    public String getPlan(){
        return plan_nutri;
    }
    public String getSpa(){
        return spa;
    }
    public String getLockers(){
        return lockers;
    }

    public void spa(){
        String reserva = JOptionPane.showInputDialog(
            "RESERVA DE SPA" + "\n" +
            "Inserte día y hora en la que desea reservar" +
            "el spa ");
        JOptionPane.showMessageDialog(null,"Horario "+
        "de spa reservado: "+"\n" + reserva); 
    }

    public void nutri(){
        String reserva = JOptionPane.showInputDialog(
            "NUTRICIONISTA" + "\n" +
            "Inserte día y hora en la que desea su cita con " +
            "el nutricionista: "); 
        JOptionPane.showMessageDialog(null, "Su cita con el "+
        "nutricionista: "+ "\n" + reserva);
    }

    public void lockers(){
        short reserva = Short.parseShort(JOptionPane.showInputDialog(
            "ALQUILER DE LOCKERS" + "\n" +
            "Precio del locker por día: 500 colones" + "\n" +
            "Cantidad de días al mes que " + 
            "ocupará locker: "));
        int precio = reserva*500;
        
        JOptionPane.showMessageDialog(null,
         "Cantidad de días con locker: " + reserva + "\n" + 
         "Total por cancelar: " + precio);
    }
}
