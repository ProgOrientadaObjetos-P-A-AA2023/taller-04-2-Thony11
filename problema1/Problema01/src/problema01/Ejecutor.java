package problema01;

public class Ejecutor {

    public static void main(String[] args) {
        
        Universidad universidad01 = 
                new Universidad("Universidad Tecnica Particular de Loja",
                        "Calle Paris.");
        
        Estudiante estudiante01 = new Estudiante();
        Estudiante estudiante02 = new Estudiante("Anthony", 9, 8.5,
                8, universidad01);
        
        estudiante01.calcularPromedio();
        estudiante02.calcularPromedio();
        
        System.out.printf("%s\n%s\n", estudiante01, estudiante02);
    }
    
}