package Modelo;

public class DatosCliente {
    private int CUIT;
    private String Nombre;

    public DatosCliente(int CUIT, String nombre) {
        this.CUIT = CUIT;
        Nombre = nombre;
    }
    //-------------------  Getters y Setters  ---------------------------
    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
