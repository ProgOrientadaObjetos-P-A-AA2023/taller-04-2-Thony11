
package problema04;

public class Cliente {
    private String nombres;
    private String apellidos;
    private String cedula;

    public Cliente() {
        nombres = "Pablo Andres";
        apellidos = "Escobar Pineda";
        cedula = "1193841728";
    }
    
    public Cliente(String nomb, String apell, String ced) {
        nombres = nomb;
        apellidos = apell;
        cedula = ced;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerNombres(String h) {
        nombres = h;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public void establecerApellidos(String h) {
        apellidos = h;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String h) {
       cedula = h;
    }
    
    
    
    
}
