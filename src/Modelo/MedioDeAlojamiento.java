package Modelo;

public class MedioDeAlojamiento {
    protected double valorBaseNoche;
    protected String tipoTemporada;
    protected DatosCliente datosCliente;
    protected int cantNoches;

    public MedioDeAlojamiento(double valorBaseNoche, String tipoTemporada, DatosCliente datosCliente, int cantNoches) {
        this.valorBaseNoche = valorBaseNoche;
        this.tipoTemporada = tipoTemporada;
        this.datosCliente = datosCliente;
        this.cantNoches = cantNoches;
    }

    //-------------------  Metodos  ---------------------------
    public double subtotal(){
        return getCantNoches()*getValorBaseNoche();
    }
    public double bonoDescuento(){
        if (getTipoTemporada().equalsIgnoreCase("Baja")){
            return subtotal()*(25.0/100);
        } else if (getTipoTemporada().equalsIgnoreCase("Media")) {
            return subtotal()*(12.5/100);
        }else{
            return 0;
        }
    }
    public double valorACancelar(){
        return 0;
    }


    //-------------------  Getters y Setters  ---------------------------
    public double getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(double valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
    }

    public String getTipoTemporada() {
        return tipoTemporada;
    }

    public void setTipoTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }

    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(DatosCliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public int getCantNoches() {
        return cantNoches;
    }

    public void setCantNoches(int cantNoches) {
        this.cantNoches = cantNoches;
    }
}
