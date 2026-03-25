
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto< E >
{
    // instance variables - replace the example below with your own
    private E x;
    private E y;
    
    public Punto(E x, E y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX(E x) {
        this.x = x;
    }
    
    public void setY(E y) {
        this.y = y;
    }
    
    public E getX() {
        return x;
    }
    
    public E getY() {
        return y;
    }
}









