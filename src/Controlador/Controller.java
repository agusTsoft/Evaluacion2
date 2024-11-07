package Controlador;

import Modelo.*;

import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

import static Controlador.Inventario.*;

public class Controller {

    public static void ingresoHotel(double valorNoche, String tipoTemporada, int dni, String nombre, int cantNoches, int capacidad, boolean esFumador, boolean conDesayuno){
        DatosCliente cliente1 = new DatosCliente(dni, nombre);
        Hotel hotel1 = new Hotel(valorNoche, tipoTemporada, cliente1, cantNoches, capacidad, esFumador, conDesayuno);
        almacenaMedio(hotel1);
    }

    public static void ingresoCabagna(double valorNoche, String tipoTemporada, int dni, String nombre, int cantNoches, int capacidad, boolean esFumador, boolean conChimenea){
        DatosCliente cliente1 = new DatosCliente(dni, nombre);
        Cabagna Cabagna1 = new Cabagna(valorNoche, tipoTemporada, cliente1, cantNoches, capacidad, esFumador, conChimenea);
        almacenaMedio(Cabagna1);
    }

    public static void ingresoCarpa(int dni, String nombre, double valorNoche, String tipoTemporada, int cantNoches, int cantPersonas){
        DatosCliente cliente1 = new DatosCliente(dni, nombre);
        Carpa carpa = new Carpa(valorNoche, tipoTemporada, cliente1, cantNoches, cantPersonas);
        almacenaMedio(carpa);
    }

    public static void cantidad(Integer opcion){
        int cont = 0;
        if (!Medios.isEmpty()){

            switch (opcion){
                case 1:
                    for (MedioDeAlojamiento medio : Medios){
                        if (medio instanceof Hotel){
                            cont += 1;
                        }
                    }
                    if(cont == 0){
                        System.out.println("No se regsitraron Hoteles");
                    }else {
                        System.out.println("En total se encontraron " + cont + " Hoteles registrados");
                    }
                    break;

                case 2:
                    for (MedioDeAlojamiento medio : Medios){
                        if (medio instanceof Cabagna){
                            cont += 1;
                        }
                    }
                    if(cont == 0){
                        System.out.println("No se regsitraron Cabagnas");
                    }else {
                        System.out.println("En total se encontraron " + cont + " Cabagnas registradas");
                    }
                    break;

                case 3:
                    for (MedioDeAlojamiento medio : Medios){
                        if (medio instanceof Carpa){
                            cont += 1;
                        }
                    }
                    if(cont == 0){
                        System.out.println("No se regsitraron Carpas");
                    }else {
                        System.out.println("En total se encontraron " + cont + " Carpas registradas");
                    }
                    break;

                default:
                    System.out.println();
                    break;
            }
            }else{
                System.out.println("No se registraron medios de alojamiento");
            }
    }

    public static void Datos(Integer opcion){
        ArrayList<MedioDeAlojamiento> lista = new ArrayList<>();
        if (!Medios.isEmpty()){
            switch (opcion){
                case 1:
                    for (MedioDeAlojamiento medio : Medios){
                        if(medio instanceof Hotel){
                            lista.add(medio);
                        }
                    }
                    for (MedioDeAlojamiento i : lista){
                        System.out.println("----- Datos del cliente -----");
                        System.out.println("Dni: " + i.getDatosCliente().getDNI());
                        System.out.println("Nombre: " + i.getDatosCliente().getNombre());
                        System.out.println("\n----- Datos del Hotel -----");
                        System.out.println("Valor Por Noche: $" + i.getValorBaseNoche());
                        System.out.println("Cantidad de nocehes: " + i.getCantNoches());
                        System.out.println("Tipo de temporada: " + i.getTipoTemporada());
                        System.out.println("Capacidad: " + ((Hotel) i).getCapacidad());
                        System.out.println("Es Fumador: " + ((Hotel) i).isEsFumador());
                        System.out.println("Es con desayuno: " + ((Hotel) i).isConDesayuno() + "\n");

                    }
                    break;

                case 2:
                    for (MedioDeAlojamiento medio : Medios){
                        if(medio instanceof Cabagna){
                            lista.add(medio);
                        }
                    }
                    for (MedioDeAlojamiento i : lista){
                        System.out.println("----- Datos del cliente -----");
                        System.out.println("Dni: " + i.getDatosCliente().getDNI());
                        System.out.println("Nombre: " + i.getDatosCliente().getNombre());
                        System.out.println("\n----- Datos del Hotel -----");
                        System.out.println("Valor Por Noche: $" + i.getValorBaseNoche());
                        System.out.println("Cantidad de nocehes: " + i.getCantNoches());
                        System.out.println("Tipo de temporada: " + i.getTipoTemporada());
                        System.out.println("Capacidad: " + ((Cabagna) i).getCapacidad());
                        System.out.println("Es Fumador: " + ((Cabagna) i).isEsFumador());
                        System.out.println("Es con Chimenea: " + ((Cabagna) i).isChimenea() + "\n");

                    }
                    break;

                case 3:
                    for (MedioDeAlojamiento medio : Medios){
                        if(medio instanceof Carpa){
                            lista.add(medio);
                        }
                    }
                    for (MedioDeAlojamiento i : lista){
                        System.out.println("----- Datos del cliente -----");
                        System.out.println("Dni: " + i.getDatosCliente().getDNI());
                        System.out.println("Nombre: " + i.getDatosCliente().getNombre());
                        System.out.println("\n----- Datos del Hotel -----");
                        System.out.println("Valor Por Noche: $" + i.getValorBaseNoche());
                        System.out.println("Cantidad de nocehes: " + i.getCantNoches());
                        System.out.println("Tipo de temporada: " + i.getTipoTemporada());
                        System.out.println("Cantidad de personas: " + ((Carpa) i).getCantPersonas());
                    }
                    break;

                default:
                    break;
            }
        }else{
            System.out.println("No se encontraron medios de alojamiento");
        }
    }

    public static void buscaClientes(Integer dni){
        if (!Clientes.isEmpty()){
            ArrayList<Integer> dnis = new ArrayList<>(BDD.keySet());
            ArrayList<MedioDeAlojamiento> alojamientos = new ArrayList<>(BDD.values());
            if (dnis.contains(dni)){
                int pos = dnis.indexOf(dni);

                System.out.println("----------- Datos del cliente ---------");
                System.out.println("Nombre: " + alojamientos.get(pos).getDatosCliente().getNombre());

                System.out.println("----------- Datos del Alojamiento asociado ---------");
                System.out.println("Valor por noche: $" + alojamientos.get(pos).getValorBaseNoche());
                System.out.println("Temporada: " + alojamientos.get(pos).getTipoTemporada());
                System.out.println("Cantidad de noches: " + alojamientos.get(pos).getCantNoches());

                if (alojamientos.get(pos) instanceof Hotel){
                    System.out.println("Capacidad: " + ((Hotel) alojamientos.get(pos)).getCapacidad());
                    System.out.println("Es fumador: " + ((Hotel) alojamientos.get(pos)).isEsFumador());
                    System.out.println("Es con desayuno: " + ((Hotel) alojamientos.get(pos)).isConDesayuno());
                    System.out.println("---------- EL ALOJAMIENTO ASOCIADO ES UN HOTEL ----------");

                }
                if (alojamientos.get(pos) instanceof Cabagna){
                    System.out.println("Capacidad: " + ((Cabagna) alojamientos.get(pos)).getCapacidad());
                    System.out.println("Es fumador: " + ((Cabagna) alojamientos.get(pos)).isEsFumador());
                    System.out.println("Es con chimenea: " + ((Cabagna) alojamientos.get(pos)).isChimenea());
                    System.out.println("---------- EL ALOJAMIENTO ASOCIADO ES UNA CABAGNA ----------");
                }
                if (alojamientos.get(pos) instanceof Carpa){
                    System.out.println("Cantidad de personas: " + ((Carpa) alojamientos.get(pos)).getCantPersonas());
                    System.out.println("---------- EL ALOJAMIENTO ASOCIADO ES UNA CARPA ----------");

                }
            }
            else{
                System.out.println("El cliente ingresado no esta registrado");
            }

        }else{
            System.out.println("No hay clientes registrados ...");
        }
    }

    public static double acumuladorAdicional(){
        if (!Medios.isEmpty()){
            double acum = 0;
            ArrayList<Hotel> hoteles = new ArrayList<>();
            for (MedioDeAlojamiento i : Medios){
                if (i instanceof Hotel){
                    hoteles.add((Hotel) i);
                }
            }
            for (Hotel j : hoteles){
                acum += j.adicional();
            }
            return acum;
        }else {
            System.out.println("No hay clientes registrados");
            return 0;
        }
    }

    public static double acumuladorDescuento(){
        if (!Medios.isEmpty()){
            double acum = 0;
            for (MedioDeAlojamiento j : Medios){
                acum += j.bonoDescuento();
            }
            return acum;
        }else {
            System.out.println("No hay clientes registrados");
            return 0;
        }
    }

    public static void totalCancelar(Integer dni){
        if (!Clientes.isEmpty()){
            ArrayList<Integer> dnis = new ArrayList<>(BDD.keySet());
            if (dnis.contains(dni)){
                MedioDeAlojamiento aux = BDD.get(dni);
                System.out.println("--------- Informacion del pago ---------");
                System.out.println("Cantidad de noches: " + aux.getCantNoches());
                System.out.println("Valor por noche: $" + aux.getValorBaseNoche());
                if (aux instanceof Hotel){
                    System.out.println("Adicional: $" + ((Hotel) aux).adicional());
                }
                System.out.println("Descuento: $" + aux.bonoDescuento());
                System.out.println("Valor a cancelar total: " + aux.valorACancelar());
            }
        }else{
            System.out.println("No hay clientes registrados");
        }
    }
}

















