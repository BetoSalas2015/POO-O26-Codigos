
/**
 * Write a description of class Articulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Articulo
{
    // instance variables - replace the example below with your own
    private int cantidad;
    private double precio;
    private String descripcion; 
    
    // Cosntructores
    public Articulo(int cantidad, String descripcion, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = new String(descripcion);
    }
    
    // metodos generales
    public double importe() {
        return precio * cantidad;
    }
}






