
package Modelo;

public class Alumno {
    String Nombre;
    String Apellido;
    String Codigo;
    int Edad;
    String DNI;
    String Ciclo;

    public Alumno(String Nombre, String Apellido, String Codigo, int Edad, String DNI, String Ciclo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Codigo = Codigo;
        this.Edad = Edad;
        this.DNI = DNI;
        this.Ciclo = Ciclo;
    }

    public Alumno() {
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo = Ciclo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Codigo=" + Codigo + ", Edad=" + Edad + ", DNI=" + DNI + ", Ciclo=" + Ciclo + '}';
    }   
}