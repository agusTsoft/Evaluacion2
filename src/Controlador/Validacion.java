package Controlador;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Validacion {
    public static Scanner scan = new Scanner(System.in);

    public static int validaInt(String msj){
        int valor;
        while(true){
            try{
                System.out.println(msj);
                valor = Integer.parseInt(scan.nextLine());
                return valor;
            }catch (Exception e) {
                System.out.println("Ingrese un valor ENTERO!!");
            }
        }
    }

    public static double validaDouble(String msj){
        double valor;
        while(true){
            try{
                System.out.println(msj);
                valor = Double.parseDouble(scan.nextLine());
                return valor;
            }catch (Exception e) {
                System.out.println("Ingrese un valor NUMERICO!!");
            }
        }
    }

    public static String validaTemporada(String msj){
        int valor;
        while(true){
            valor = validaInt(msj);
            switch (valor){
                case 1:
                    return "Baja";
                case 2:
                    return "Media";
                case 3:
                    return "Alta";
                default:
                    System.out.println("Opcion NO válida");

            }
        }
    }

    public static int validaDni(String msj){
        String valor;
        while(true) {
            valor=String.valueOf(validaInt(msj));
            if (valor.length()==8){
                return Integer.parseInt(valor);
            }else{
                System.out.println("Ingrese DNI valido (8 digitos)");
            }
        }
    }

    public static String validaNombre(String msj){
        String valor;
        while (true) {
            System.out.println(msj);
            valor = scan.next();
            boolean esAlfabetico = true;

            for (int i = 0; i < valor.length(); i++) {
                if (!Character.isLetter(valor.charAt(i))) {
                    esAlfabetico = false;
                }
            }

            if (esAlfabetico) {
                return valor;
            } else {
                System.out.println("El nombre debe contener sólo caracteres alfabéticos");
            }
        }
    }

    public static boolean validaTF(String msj){
        int valor;
        while(true){
            valor = validaInt(msj);
            switch (valor){
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    System.out.println("Ingrese un numero de opcion valido");
            }

        }
    }

}
