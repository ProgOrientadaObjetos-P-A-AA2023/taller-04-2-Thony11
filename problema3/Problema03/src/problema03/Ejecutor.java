
package problema03;

public class Ejecutor {

    public static void main(String[] args) {
        
        Fabricante fab = new Fabricante("Kia", "Sportage");
        
        Automotor auto01 = new Automotor();
        Automotor auto02 = new Automotor("76564k11a",
                2000, 39500.2, fab);
        
        auto01.calcularValorMatricula();
        auto02.calcularValorMatricula();
        
        System.out.printf("%s\n%s\n", auto01, auto02);
    }
    
}