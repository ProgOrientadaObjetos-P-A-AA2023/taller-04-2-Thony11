
package problema04;

public class Ejecutor {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Anthony Gabriel", "Celi Villalta", 
                "1105575821");
        Banco banco = new Banco("Banco Pichincha", 11);
        
        Cheque cheque01 = new Cheque();
        Cheque cheque02 = new Cheque(cliente, banco, 293415.00);
        
        cheque01.calcularComision();
        cheque02.calcularComision();
        
        System.out.printf("%s\n%s\n", cheque01, cheque02);
    }
    
}