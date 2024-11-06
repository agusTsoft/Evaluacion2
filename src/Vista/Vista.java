package Vista;

import Controlador.Validacion;
import Modelo.Cabagna;
import Modelo.DatosCliente;
import Modelo.Hotel;

import javax.swing.*;
import java.util.Scanner;
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
        System.out.println("-------------- Menu Principal ----------------");
        System.out.println("1. Nuevo Alojamiento");
        System.out.println("2. Mostrar datos de alojamientos existentes");
        System.out.println("3. Datos de un cliente");
        System.out.println("4. Total adicional");
        System.out.println("5. Total descontado");
        System.out.println("6. Cantidad de medios de alojamiento");
        System.out.println("7. Valor a cancelar determinado");
        System.out.println("8. Salir del sistema");
        System.out.println("X. Incrementar un valor base (no hace nada jaja - jaja)");


    }

    public void menuAlojamiento(){
        System.out.println("---------- Menu Alojamiento -----------");
        System.out.println("¿Donde se desea hospedar?");
        int opcion = validaInt("\n1. Hotel\n2. Cabagna\n3. Carpa \n---> ");
        switch (opcion){
            case 1:
                menuHotel();
            case 2:
                menuCabagna();
            case 3:
                menuCarpa();
        }
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
        System.out.println("\nHotel ingresado con EXITO\n");
    }

    public void menuCabagna(){
        //Datos del cliente
        System.out.println("-------------- Datos Cliente ----------------");
        int dni2 = validaDni("DNI: ");
        String nom2 = validaNombre("Nombre: ");

        //Daos del alojamiento
        System.out.println("-------------- Datos del Alojamiento ----------------");
        double valorNoche = validaDouble("Valor base por noche: ");
        String tipoTemporada = validaTemporada("Tipo de temporada: \n1. Baja\t2. Media\t3. Alta\n---> ");
        int cantNoches = validaInt("Cantidad de noches a hospedarse: ");
        int capacidad = validaInt("Capacidad maxima de la habitacion: ");
        boolean esFumador = validaTF("Es fumador? \n1. Si\t2. No");
        boolean conChimenea = validaTF("Es con chimenea? \n1. Si\t2. No");
        System.out.println("\nCabagna ingresada con EXITO\n");
    }

    public void menuCarpa(){
        //Datos del cliente
        System.out.println("-------------- Datos Cliente ----------------");
        int dni2 = validaDni("DNI: ");
        String nom2 = validaNombre("Nombre: ");

        //Daos del alojamiento
        System.out.println("-------------- Datos del Alojamiento ----------------");
        double valorNoche = validaDouble("Valor base por noche: ");
        String tipoTemporada = validaTemporada("Tipo de temporada: \n1. Baja\t2. Media\t3. Alta\n---> ");
        int cantNoches = validaInt("Cantidad de noches a hospedarse: ");
        int cantPersonas = validaInt("Capacidad maxima de personas de la carpa: ");
        System.out.println("\nCarpa ingresada con EXITO\n");

    }
}