
package Controlador;
import Vista.GUI;
import Modelo.Alumno;

public class ControladorAlumno {

    private GUI vista;
    private Alumno modelo;

    public ControladorAlumno(GUI vista, Alumno modelo) {
        this.vista = vista;
        this.modelo = modelo;
        inicializarVista();
    }

    public void inicializarVista() {
        vista.setVisible(true);
        // Aquí puedes inicializar cualquier valor en la vista desde el modelo
    }

    public void actualizarModelo() {
        modelo.setNombre(vista.getNombreCampo());  // Método que debes crear en GUI para obtener el campo del nombre
        modelo.setApellido(vista.getApellidoCampo());
        modelo.setCodigo(vista.getCodigoCampo());
        modelo.setEdad(Integer.parseInt(vista.getEdadCampo()));
        modelo.setDNI(vista.getDNICampo());
        modelo.setCiclo(vista.getCicloCampo());
    }

    public void actualizarVista() {
        vista.setNombreCampo(modelo.getNombre());
        vista.setApellidoCampo(modelo.getApellido());
        vista.setCodigoCampo(modelo.getCodigo());
        vista.setEdadCampo(String.valueOf(modelo.getEdad()));
        vista.setDNICampo(modelo.getDNI());
        vista.setCicloCampo(modelo.getCiclo());
    }
}