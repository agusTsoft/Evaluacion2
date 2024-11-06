package Modelo;

public abstract class Hospederia extends MedioDeAlojamiento{
    protected int Capacidad;
    protected boolean esFumador;

    public Hospederia(double valorBaseNoche, String tipoTemporada, DatosCliente datosCliente, int cantNoches, int capacidad, boolean esFumador) {
        super(valorBaseNoche, tipoTemporada, datosCliente, cantNoches);
        Capacidad = capacidad;
        this.esFumador = esFumador;
    }

    public abstract double valorACancelar();

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }


}
