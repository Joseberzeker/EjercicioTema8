/*
* Nombre: Jose Luis Ahumada Navarro
* Ejercicios Tema # 8
* Curso: Introducción a la programación
* OpenBootcamp - 2022
* */

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(24);
        persona.setNombre("Jose");
        persona.setTelefono(123456789);

        var nombre = persona.getNombre();
        var edad = persona.getEdad();
        var telefono = persona.getTelefono();

        System.out.println("Hola, mi nombre es "+ nombre + ", Tengo " + edad +" años" +" y mi numero de telefono es: "+ telefono);
    }
}

class Persona{

    private int edad;
    private String nombre;
    private int telefono;

    //Setters
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    //Getters

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }
}