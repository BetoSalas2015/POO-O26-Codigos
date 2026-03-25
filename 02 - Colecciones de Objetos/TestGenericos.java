
/**
 * Write a description of class TestGenericos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestGenericos
{
    // instance variables - replace the example below with your own
    public static < E > void imprimeArreglo(E[] arregloEntrada) {
        for(E elemento : arregloEntrada) {
            System.out.print(elemento + ", ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Double[] arrDouble = { 3.2, 2.3, 5.2, 7.4 };
        imprimeArreglo(arrDouble);
        Integer[] arrInt = { 1,2,3,4,5,6 };
        imprimeArreglo(arrInt);
        Character[] arrChar = { 'a', 'b', 'c', 'd' };
        imprimeArreglo(arrChar);
    }
    
    
}







