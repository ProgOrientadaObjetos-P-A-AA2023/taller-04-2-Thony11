
package problema01;

public class Universidad {
    
    private String nombre;
    private String direccion;

    public Universidad() {
        nombre = "Uiversidad Nacional";
        direccion = "Calle Avenidad Universitaria.";
    }

    public Universidad(String nom, String dirc) {
        nombre = nom;
        direccion = dirc;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String d) {
        nombre = d;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void establecerDireccion(String d) {
        direccion = d;
    }
    
    
    
}
