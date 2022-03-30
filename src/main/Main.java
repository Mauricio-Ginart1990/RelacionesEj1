package main;

import entidadesrPersoPerro.Perro;
import entidadesrPersoPerro.Persona;
import java.util.ArrayList;

import java.util.Scanner;
import servicio.Servicio;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio S1 = new Servicio();
        ArrayList<Persona> per = new ArrayList();
        ArrayList<Perro> animal = new ArrayList();
        System.out.println("Ingrese los datos de las dos personas dispuestas a adoptar");
//        String res = "";
//        String resp = "";
//        do {         
//            per.add(S1.datosPersona());
//            System.out.println("Desea Ingresar mas persona SI/NO");
//            res=leer.next();
//        } while (res.equalsIgnoreCase("si"));
//
//         do {            
//            animal.add(S1.datosPerro());
//             System.out.println("Desea agragar otro perro");
//             resp=leer.next();
//        } while (resp.equalsIgnoreCase("si"));

        for (int i = 0; i < 2; i++) {
            per.add(S1.datosPersona());
        }
        for (int i = 0; i < 2; i++) {
            animal.add(S1.datosPerro());
        }
        System.out.println("==========================");
        System.out.println("Las personas para adoptar son :");
        S1.mostrarPersonas(per);
        System.out.println("==========================");
        System.out.println("Las mascotas para adopcion son :");
        S1.mostrarPerros(animal);
        System.out.println("==========================");

        for (Persona aux : per) {

            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() + " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : animal) {

                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            String elejir = leer.next();

            int ban = 0;
            for (int i = 0; i < animal.size(); i++) {
                if (elejir.equalsIgnoreCase(animal.get(i).getNombre())) {
                    aux.setPerro(animal.get(i));
                    ban++;
                    animal.remove(i);
                }
            }
            if (ban == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }

        System.out.println("==========================");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : per) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " " + aux.getDni() + " a adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza() + " de colo " + aux.getPerro().getColor() + " y de edad " + aux.getPerro().getEdad());
            }
        }
    }
}
