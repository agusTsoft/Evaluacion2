package Modelo;

public class Carpa extends MedioDeAlojamiento{
    private int cantPersonas;

    public Carpa(double valorBaseNoche, String tipoTemporada, DatosCliente datosCliente, int cantNoches, int cantPersonas) {
        super(valorBaseNoche, tipoTemporada, datosCliente, cantNoches);
        this.cantPersonas = cantPersonas;
    }

    //-------------------  Getters y Setters  ---------------------------
    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }
}
