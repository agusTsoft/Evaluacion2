package Modelo;

public class Cabagna extends Hospederia{
    private boolean chimenea;

    public Cabagna(double valorBaseNoche, String tipoTemporada, DatosCliente datosCliente, int cantNoches, int capacidad, boolean esFumador, boolean chimenea) {
        super(valorBaseNoche, tipoTemporada, datosCliente, cantNoches, capacidad, esFumador);
        this.chimenea = chimenea;
    }

    //-------------------  Metodos  ---------------------------
    public void IncrementaValorBase(){
        if (getCapacidad() > 5){
            setValorBaseNoche(getValorBaseNoche()*1.18);
        }else{
            System.out.println("No se incrementa el valor base");
        }
    }

    //-------------------  Getters y Setters  ---------------------------
    public boolean isChimenea() {
        return chimenea;
    }

    @Override
    public double valorACancelar() {
        return subtotal() - bonoDescuento();
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }
}
