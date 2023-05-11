
package problema01;

public class Estudiante {
    
    private String nombre;
    private double calMateria01;
    private double calMateria02;
    private double calMateria03;
    private double promedio;
    private Universidad universidad;
    
    public Estudiante(){
        nombre = "Gabriel";
        calMateria01 = 7.5;
        calMateria02 = 6.7;
        calMateria03 = 9;
        universidad = new Universidad();
    }

    public Estudiante(String nom, double mat1, double mat2, double mat3, 
            Universidad uni) {
        nombre = nom;
        calMateria01 = mat1;
        calMateria02 = mat2;
        calMateria03 = mat3;
        universidad = uni;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String m) {
        nombre = m;
    }

    public double obtenerCalMateria01() {
        return calMateria01;
    }

    public void establecerCalMateria01(double m) {
        calMateria01 = m;
    }

    public double obtenerCalMateria02() {
        return calMateria02;
    }

    public void establecerCalMateria02(double m) {
        calMateria02 = m;
    }

    public double obtenerCalMateria03() {
        return calMateria03;
    }

    public void establecerCalMateria03(double m) {
        calMateria03 = m;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        promedio = (calMateria01 + calMateria02 + calMateria03)/3;
    }

    public Universidad obtenerUniversidad() {
        return universidad;
    }

    public void establecerUniversidad(Universidad m) {
        universidad = m;
    }
    
    

    @Override
    public String toString() {
        String m = String.format("\n---Estudiante: %s---\n"
                + "+ Universidad: %s con \ndirección: %s\n\n"
                + "Calificacion materia 01: %.2f\n"
                + "Calificacion materia 02: %.2f\n"
                + "Calificacion materia 03: %.2f\n"
                + "Promedio: %.2f\n",
                nombre,
                universidad.obtenerNombre(),
                universidad.obtenerDireccion(),
                calMateria01,
                calMateria02,
                calMateria03,
                promedio);
        
        return m;
    }
    
    
    
    
}