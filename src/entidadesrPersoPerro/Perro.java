
package entidadesrPersoPerro;
public class Perro {
    private String raza;
    private String nombre;
    private String color;
    private Integer edad;

    public Perro() {
    }

    public Perro(String raza, String nombre, String color, Integer edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  " Nombre: " + nombre + " La Raza es: " + raza + " De Color: " + color + " De Edad: " + edad + "Años";
    }
    
}
