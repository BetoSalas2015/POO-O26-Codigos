
/**
 * Write a description of class Factura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Vector;

public class Factura
{
    // instance variables - replace the example below with your own
      private String empresa;
      private String cliente;
      private static int num = 1;
      private int folio;
      private Vector articulos;
      
      // Constructores
      public Factura(String nombreCliente) {
        this.empresa = new String("Papelería Pony");
        this.cliente = new String(nombreCliente);
        this.folio = this.num++;
        this.articulos = new Vector(10);
      }
      
      // Métodos
      public int getNumeroArticulos() {
          return articulos.size();
      }
      
      public void agregaArticulo(Articulo nuevoArticulo) {
          articulos.add(nuevoArticulo);
      }

      public void setArticulo(int index, Articulo articulo) {
          articulos.set(index, articulo);
      }
      
      public Object getArticulo(int index) {
          return articulos.get(index);
      }
      
      public double calculaTotalArticulos() {
          Articulo recorre;
          double sum = 0.0;
          for(int index = 0; index < articulos.size(); index++) {
              recorre = (Articulo) getArticulo(index);
              sum += recorre.importe();           // BOOOOMMMM!!!!!
          }
          return sum;
      }
}








