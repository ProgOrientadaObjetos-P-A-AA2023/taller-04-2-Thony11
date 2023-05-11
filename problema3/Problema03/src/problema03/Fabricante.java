
package problema03;

public class Fabricante {
    private String nombre;
    private String ciudad;

    public Fabricante() {
        nombre = "Chevrolet";
        ciudad = "Japon";
    }

    
    public Fabricante(String nom, String ciu) {
        nombre = nom;
        ciudad = ciu;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String g) {
        nombre = g;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void setCiudad(String g) {
        ciudad = g;
    }
    
    
    
    
}
