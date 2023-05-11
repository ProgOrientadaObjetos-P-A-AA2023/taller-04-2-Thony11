
package problema04;

public class Banco {
    private String nombre;
    private int sucursales;

    public Banco() {
        nombre = "BanEcuador";
        sucursales = 25;
    }
    
    public Banco(String nom, int sucu) {
        nombre = nom;
        sucursales = sucu;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String q) {
        nombre = q;
    }

    public int obtenerSucursales() {
        return sucursales;
    }

    public void establecerSucursales(int q) {
        sucursales = q;
    }
    
    
}
