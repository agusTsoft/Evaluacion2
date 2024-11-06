package Modelo;

public class Hotel extends Hospederia{
    private boolean conDesayuno;

    public Hotel(double valorBaseNoche, String tipoTemporada, DatosCliente datosCliente, int cantNoches, int capacidad, boolean esFumador, boolean conDesayuno) {
        super(valorBaseNoche, tipoTemporada, datosCliente, cantNoches, capacidad, esFumador);
        this.conDesayuno = conDesayuno;
    }

    //-------------------  Metodos  ---------------------------
    private double adicional(){
        if(isConDesayuno() && isEsFumador()){
            return subtotal()*(30/100);
        }else{
            return 0;
        }
    }

    @Override
    public double valorACancelar() {
        return subtotal() + adicional() - bonoDescuento();
    }

    //-------------------  Getters y Setters  ---------------------------
    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }
}
