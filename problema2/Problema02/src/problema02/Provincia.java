
package problema02;

public class Provincia {
    
    private String nombre;
    private int nroHabitantes;

    public Provincia() {
        nombre = "Zamora";
        nroHabitantes = 150000;
    }

    
    public Provincia(String nom, int nHabi) {
        nombre = nom;
        nroHabitantes = nHabi;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String s) {
        nombre = s;
    }

    public int obtenerNroHabitantes() {
        return nroHabitantes;
    }

    public void establecerNroHabitantes(int s) {
        nroHabitantes = s;
    }
    
    
    
    
}
