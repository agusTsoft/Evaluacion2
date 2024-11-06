package Modelo;

public class DatosCliente {
    private int DNI;
    private String Nombre;

    public DatosCliente(int DNI, String nombre) {
        this.DNI = DNI;
        Nombre = nombre;
    }
    //-------------------  Getters y Setters  ---------------------------
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
