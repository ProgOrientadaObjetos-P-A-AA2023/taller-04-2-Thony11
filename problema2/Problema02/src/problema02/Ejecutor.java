
package problema02;

public class Ejecutor {

    public static void main(String[] args) {
        
        Provincia provincia01 = new Provincia("Loja", 4500000);
        
        Maestro maestro01 = new Maestro();
        Maestro maestro02 = new Maestro("Roberto", "Sanchez",
                360.60, "1102219984", provincia01);
        
        maestro01.calcularSueldoTotal();
        maestro02.calcularSueldoTotal();
        
        System.out.printf("%s\n%s\n", maestro01, maestro02);
    }
    
}