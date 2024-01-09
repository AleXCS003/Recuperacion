import java.util.Scanner;

 public class Deportista {
    private String nombre;
    private int edad;
    private boolean sancionesRecientes;

    public Deportista(String nombre, int edad, boolean sancionesRecientes) {
        this.nombre = nombre;
        this.edad = edad;
        this.sancionesRecientes = sancionesRecientes;
    }
 public void setNombre(String nombre ){
        this.nombre=nombre;
 }
 public  String getNombre(){
        return nombre;
 }
 public void getedad(int edad){
        this.edad=edad;
 }
 public int getEdad(){
        return edad;
 }
 public void setSancionesRecientes(Boolean sancionesRecientes){
        this.sancionesRecientes=sancionesRecientes;
 }
 public boolean getSancionesRecientes(){
        return sancionesRecientes;
 }
    public void validarMayoriaEdad() {
        try {
            if (!esMayorEdad()) {
                throw new RuntimeException("El participante debe ser mayor de edad.");
            }

             if(sancionesRecientes) {
                throw new RuntimeException("El participante no puede tener sanciones recientes.");
            }

            System.out.println("Registro aceptado para " + nombre);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: ");
        }
    }

    private boolean esMayorEdad() {
        return edad >= 18;
    }

    private boolean pasoExamenMedico() {

        return true;
    }
     public void ExamenesRealizados(){

         System.out.println("el jugador "+getNombre()+ "realizo los respectivos examenes medicos");
     }
}

class Atleta extends Deportista {
    private String tipoDisciplina;

    public Atleta(String nombre, int edad, boolean sancionesRecientes, String tipoDisciplina) {
        super(nombre, edad, sancionesRecientes);
        this.tipoDisciplina = tipoDisciplina;
    }

    public void evaluarAptitud() {
        System.out.println(getNombre() + " evaluado en " + tipoDisciplina);
    }

}


class Jugador extends Deportista {
    private String posicion;

    public Jugador(String nombre, int edad, boolean sancionesRecientes, String posicion) {
        super(nombre, edad, sancionesRecientes);
        this.posicion = posicion;
    }

    public void evaluarAptitud() {
        System.out.println(getNombre() + " evaluado en la posición de " + posicion);
    }

}

