
/**
 * Write a description of class TestGenericos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestGenericos
{
    // instance variables - replace the example below with your own
    
    public static void imprimeArreglo(Double[] arregloEntrada) {
        for(Double elemento: arregloEntrada) {
            System.out.print(elemento + ", ");
        }
    }
    
    public static void main(String[] args) {
        Double[] arrDouble = { 3.2, 2.3, 5.2, 7.4 };
        imprimeArreglo(arrDouble);
        
 
    }
    
    
}







