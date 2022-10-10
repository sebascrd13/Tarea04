package Tarea04;

import javax.swing.JOptionPane;

// GIMNASIO

public class Main {
    public static void main(String[] args) {

        Sede SanPedro = new Sede("Detrás del Mall San Pedro",
        "De lunes a sábado (8am-10pm)", "Crossfit- Funcional "+
        "- Kickboxing","Entrenadores, fisioterapeutas y "+
        "nutricionistas","50 espacios de parqueo"); 
        
        byte op = 0;
        
        while (op != 5) {
            op = Byte.parseByte(JOptionPane.showInputDialog
            ("Bienvenido a GIMNASIO"+"\n"+
            "Digite el número de la sección: "+"\n"+
            "1. Sede"+"\n"+"2. Cobros"+"\n"+
            "3. Servicios"+"\n"+ "4. Usuarios" + "\n" + "5. Salir"));
            
            if (op == 1) {
                JOptionPane.showMessageDialog(null,
                "INFORMACIÓN DE LA SEDE SAN PEDRO"+"\n"+
                "Ubicación: "+SanPedro.getUbicacion()+"\n"+
                "Horario: "+ SanPedro.getHorario()+"\n"+
                "Áreas de Entrenamiento: "+ SanPedro.getAreasEntreno()+"\n"+
                "Personal: "+ SanPedro.getPersonal()+"\n"+
                "Parqueo: "+ SanPedro.getParqueo());

                byte opcion = Byte.parseByte(JOptionPane.showInputDialog
                ("Desea registrarse?" + "\n"+"1 = SI  2 = NO"));
                
                if (opcion == 1) {
                    SanPedro.registro();  
                }
            }
            if (op == 2) {
                    
            }
            if (op == 3) {
                    
            }
            if (op == 4) {
                
                JOptionPane.showMessageDialog(null,
                "Apartado de Usuarios");
                
                String Nombre;
                String Apellidos;
                String Cedula;
                String Correo;
                int Numero;
                
                Usuarios NuevoUsuario = new Usuarios( Nombre,Apellidos,Cedula,
                Correo_Elec,Numero_Tel );
                
                Nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                Apellidos = JOptionPane.showInputDialog("Ingrese sus apellidos:");
                Cedula = JOptionPane.showInputDialog("Ingrese su cedula:");
                Correo = JOptionPane.showInputDialog("Ingrese su correo: ");
                Numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese"
                                                                      + "su numero de telefono"));
                
                NuevoUsuario.setNombre(Nombre);
                NuevoUsuario.setApellidos(Apellidos);
                NuevoUsuario.setCedula(Cedula);
                NuevoUsuario.setCorreo_Elec(Correo);
                NuevoUsuario.setNumero_Tel(Numero);
                
            }
            if (op == 5) {
                JOptionPane.showMessageDialog(null,
                "Usted ha salido");
            }
            
            
        }


       
    }
    
}
