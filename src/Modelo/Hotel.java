package Modelo;

public class Hotel extends Hospederia{
    private boolean conDesayuno;

    public Hotel(double valorBaseNoche, String tipoTemporada, DatosCliente datosCliente, int cantNoches, int capacidad, boolean esFumador, boolean conDesayuno) {
        super(valorBaseNoche, tipoTemporada, datosCliente, cantNoches, capacidad, esFumador);
        this.conDesayuno = conDesayuno;
    }

    //-------------------  Metodos  ---------------------------
    public double adicional(){
        if(conDesayuno && esFumador){
            return subtotal()*(30.0/100);
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
