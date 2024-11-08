package Vista;

import Modelo.DatosCliente;

import static Controlador.Controller.*;
import static Controlador.Validacion.*;


public class Vista {
    public static void main(String[] args) {
        Vista main = new Vista();
        main.menuPrincipal();
        //Hotel
        /*Hotel hotel = new Hotel(100.0, "Media", cliente1, 8, 4, true, true);
        System.out.println("------------- HOTEL -----------");
        System.out.println("Valor por Noche: " + hotel.getValorBaseNoche());
        System.out.println("Cantidad de noches: " + hotel.getCantNoches());
        System.out.println("Subtotal: " + hotel.subtotal());
        System.out.println("Adicional: " + hotel.adicional());
        System.out.println("Descuento: " + hotel.bonoDescuento());
        System.out.println("Valor FINAL: " + hotel.valorACancelar());

        //Cagabagna
        Cabagna cab = new Cabagna(300, "Baja", cliente1, 9, 6, true, true);
        System.out.println("\n------------- CABAGNA -----------");
        System.out.println("Valor por noche: " + cab.getValorBaseNoche());
        System.out.println("Cantidad de noches: " + cab.getCantNoches());
        System.out.println("Subtotal: " + cab.subtotal());
        System.out.println("Descuento: " + cab.bonoDescuento());
        System.out.println("Valor FINAL: " + cab.valorACancelar());
        */
    }

    public void menuPrincipal(){
        int opcion;
        do {
            System.out.println("-------------- Menu Principal ----------------");
            System.out.println("1. Nuevo Alojamiento");
            System.out.println("2. Mostrar datos de alojamientos existentes");
            System.out.println("3. Datos de un cliente");
            System.out.println("4. Total adicional");
            System.out.println("5. Total descontado");
            System.out.println("6. Cantidad de medios de alojamiento");
            System.out.println("7. Valor a cancelar determinado");
            System.out.println("8. Salir del sistema");
            opcion = validaInt("\nIngrese una opcion:\n---> ");
            switch (opcion){
                case 1:
                    menuAlojamiento();
                    break;

                case 2:
                    mostrarDatos();
                    break;

                case 3:
                    datosCliente();
                    break;

                case 4:
                    totalAdicional();
                    break;

                case 5:
                    totalDescontado();
                    break;

                case 6:
                    cantMedios();
                    break;

                case 7:
                    valorACancelar();
                    break;

                case 8:
                    System.out.println("\n\t\t Saliendo del sistema ..... ");
                    break;

                default:
                    System.out.println("Ingrese una opcion del menu ...");
                    break;
            }
        }while(opcion!=8);

    }

    //--------- Opcion 1 // Ingresar Alojamiento -------------------
    public void menuAlojamiento(){
        System.out.println("---------- Menu Alojamiento -----------");
        int opcion;
        do{
            System.out.println("¿Donde se desea hospedar?");
            opcion = validaInt("\n1. Hotel\n2. Cabagna\n3. Carpa \n4. Volver\n---> ");
            switch (opcion){
                case 1:
                    menuHotel();
                    break;

                case 2:
                    menuCabagna();
                    break;

                case 3:
                    menuCarpa();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Ingrese una opcion del menu ....");
            }
        }while(opcion != 4);

    }

    public void menuHotel(){
        //Datos del cliente
        System.out.println("-------------- Datos Cliente ----------------");
        int dni = validaDni("DNI: ");
        String nom = validaNombre("Nombre: ");

        //Daos del alojamiento
        System.out.println("-------------- Datos del Alojamiento ----------------");
        double valorNoche = validaDouble("Valor base por noche: ");
        String tipoTemporada = validaTemporada("Tipo de temporada: \n1. Baja\t2. Media\t3. Alta\n---> ");
        int cantNoches = validaInt("Cantidad de noches a hospedarse: ");
        int capacidad = validaInt("Capacidad maxima de la habitacion: ");
        boolean esFumador = validaTF("Es fumador? \n1. Si\t2. No");
        boolean conDesayuno = validaTF("Es con desayuno? \n1. Si\t2. No");

        ingresoHotel(valorNoche, tipoTemporada, dni, nom, cantNoches, capacidad, esFumador, conDesayuno);

    }

    public void menuCabagna(){
        //Datos del cliente
        System.out.println("-------------- Datos Cliente ----------------");
        int dni2 = validaDni("DNI: ");
        String nom2 = validaNombre("Nombre: ");

        //Datos del alojamiento
        System.out.println("-------------- Datos del Alojamiento ----------------");
        double valorNoche = validaDouble("Valor base por noche: ");
        String tipoTemporada = validaTemporada("Tipo de temporada: \n1. Baja\t2. Media\t3. Alta\n---> ");
        int cantNoches = validaInt("Cantidad de noches a hospedarse: ");
        int capacidad = validaInt("Capacidad maxima de la habitacion: ");
        boolean esFumador = validaTF("Es fumador? \n1. Si\t2. No");
        boolean conChimenea = validaTF("Es con chimenea? \n1. Si\t2. No");

        ingresoCabagna(valorNoche, tipoTemporada, dni2, nom2, cantNoches, capacidad, esFumador, conChimenea);
    }

    public void menuCarpa(){
        //Datos del cliente
        System.out.println("-------------- Datos Cliente ----------------");
        int dni3 = validaDni("DNI: ");
        String nom3 = validaNombre("Nombre: ");

        //Daos del alojamiento
        System.out.println("-------------- Datos del Alojamiento ----------------");
        double valorNoche = validaDouble("Valor base por noche: ");
        String tipoTemporada = validaTemporada("Tipo de temporada: \n1. Baja\t2. Media\t3. Alta\n---> ");
        int cantNoches = validaInt("Cantidad de noches a hospedarse: ");
        int cantPersonas = validaInt("Capacidad maxima de personas de la carpa: ");

        ingresoCarpa(dni3, nom3, valorNoche, tipoTemporada, cantNoches, cantPersonas);

    }

    //--------- Opcion 2 // Mostrar Datos -------------------
    public void mostrarDatos(){
        int opcion;
        do {
            System.out.println("----------- Medios de Alojamiento ------------");
            System.out.println("1. Hoteles\n2. Cabagnas\n3. Carpas\n4. Volver");
            opcion = validaInt("¿De que tipo de medio desea mostrar los datos?\n---> ");
            switch (opcion) {
                case 1:
                    System.out.println("----------- Mostrando Datos de los Hoteles -------------");
                    Datos(opcion);
                    break;

                case 2:
                    System.out.println("----------- Mostrando Datos de los Hoteles -------------");
                    Datos(opcion);
                    break;

                case 3:
                    System.out.println("----------- Mostrando Datos de los Hoteles -------------");
                    Datos(opcion);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Ingrese una opcion del menu...");
                    break;
            }
        }while (opcion != 4);
    }

    //--------- Opcion 3 // Datos de un cliente -------------------
    public void datosCliente(){
        System.out.println("----------- Datos de un cliente ------------");
        int dni = validaDni("Ingrese el dni del cliente: \n---> ");
        buscaClientes(dni);
    }

    //--------- Opcion 4 // Total adicional -------------------
    public void totalAdicional(){
        System.out.println("----------- Total adicional ------------");
        double acum = acumuladorAdicional();
        System.out.println("El valor total adicional a los medios de alojamiento es de: $" + acum);
    }

    //--------- Opcion 5 // Total descontado -------------------
    public void totalDescontado(){
        System.out.println("----------- Total descontado ------------");
        double acum = acumuladorDescuento();
        System.out.println("El valor total de descuento a los medios\nde alojamiento es de: $" + acum);
    }

    //--------- Opcion 6 // Cantidad de medios de alojamiento -------------------
    public void cantMedios(){
        System.out.println("----------- Cantidad de medios de alojamiento ------------");
        int opcion;
        do {
            System.out.println("1. Hoteles\n2. Cabagnas\n3. Carpas\n4. Volver");
            opcion = validaInt("¿De que tipo de medio desea saber la cantidad almacenada?\n---> ");
            switch (opcion) {
                case 1:
                    cantidad(opcion);
                    break;

                case 2:
                    cantidad(opcion);
                    break;

                case 3:
                    cantidad(opcion);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Ingrese una opcion del menu...");
                    break;
            }
        }while (opcion != 4);

    }

    //--------- Opcion 7 // Valor a cancelar determinado -------------------
    public void valorACancelar() {
        System.out.println("----------- Valor a cancelar determinado ------------");
        int dni = validaDni("Ingrese el dni del cliente de quien quiere saber el valor a cancelar: \n---> ");
        totalCancelar(dni);
    }

}

















