
package servicio;

import entidadesrPersoPerro.Perro;
import entidadesrPersoPerro.Persona;
import java.util.ArrayList;
import java.util.Scanner;


public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona datosPersona(){
        Persona p1 = new Persona();
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());
         System.out.println("Ingrese su apellido");
        p1.setApellido(leer.next());
        System.out.println("Ingrese su DNI");
        p1.setDni(leer.nextInt());
        return p1;
    }
    public Perro datosPerro(){
        Perro m1 = new Perro();
        System.out.println("Ingrese el nombre del perro");
        m1.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro");
        m1.setRaza(leer.next());
       
        System.out.println("Ingrese el color del perro");
        m1.setColor(leer.next());
        System.out.println("Ingrese la edad del perro");
        m1.setEdad(leer.nextInt());
        return m1;
    }
    public void mostrarPersonas(ArrayList<Persona>per){
        for (Persona aux : per) {
            System.out.println(aux);
        }
    }
    public void mostrarPerros(ArrayList<Perro>animal){
        for (Perro aux : animal) {
            System.out.println(aux);
        }
    }
}
