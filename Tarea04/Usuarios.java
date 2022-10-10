package Tarea04;

public class Usuarios {
    
    private String Nombre;
    private String Apellidos;
    private String Cedula;
    private String Correo_Elec;
    private int Numero_Tel;

    public Usuarios( String Nombre, String Apellidos, String Cedula,
                    String Correo_Elec, int Numero_Tel ) {
        
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Correo_Elec = Correo_Elec;
        this.Numero_Tel = Numero_Tel;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCorreo_Elec() {
        return Correo_Elec;
    }

    public void setCorreo_Elec(String Correo_Elec) {
        this.Correo_Elec = Correo_Elec;
    }

    public int getNumero_Tel() {
        return Numero_Tel;
    }

    public void setNumero_Tel(int Numero_Tel) {
        this.Numero_Tel = Numero_Tel;
    }
    
}
