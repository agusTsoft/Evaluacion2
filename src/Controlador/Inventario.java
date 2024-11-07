package Controlador;

import Modelo.DatosCliente;
import Modelo.MedioDeAlojamiento;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventario {
    public static HashMap<Integer, MedioDeAlojamiento> BDD = new HashMap<>();
    public static ArrayList<MedioDeAlojamiento> Medios = new ArrayList<>();
    public static ArrayList<DatosCliente> Clientes = new ArrayList<>();

    public static void almacenaMedio(MedioDeAlojamiento medio){
        if (!BDD.isEmpty()){
            ArrayList<Integer> dnis = new ArrayList<>(BDD.keySet());
            if (!dnis.contains(medio.getDatosCliente().getDNI())){
                Medios.add(medio);
                Clientes.add(medio.getDatosCliente());
                BDD.put(medio.getDatosCliente().getDNI(), medio);
                System.out.println("\nCliente y Alojamiento registrados con exito ");
            }else{
                System.out.println("El cliente ya está registrado en otro alojamiento !!!\n");
            }
        }else{
            Medios.add(medio);
            BDD.put(medio.getDatosCliente().getDNI(), medio);
        }
    }
}
