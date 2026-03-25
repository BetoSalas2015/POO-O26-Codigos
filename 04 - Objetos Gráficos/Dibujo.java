 import java.awt.*;             // Para usar Java 1.0
 import java.awt.geom.*;        // Para usar Java 2D

 public class Dibujo extends Frame {

    public Dibujo() {
        super("Dibujo");
    }

    public boolean handleEvent( Event event ) {
        if( event.id == Event.WINDOW_DESTROY) {
            hide();                         // Deprecado: Oculta la ventana
            dispose();                      // Libera recursos
            return true;                    //  Procesamos el evento
        }
        return super.handleEvent(event);    
    }

    public void paint(Graphics g) {         // Los metodos de dubujo se programan en paint
        Graphics2D g2d = (Graphics2D) g;

        g2d.translate(getWidth() / 2, getHeight() / 2 );

        g2d.setBackground(Color.PINK);
        g2d.clearRect(0, 0, getWidth(), getHeight() );
        
        Line2D linea = new Line2D.Float(50, 50, 150, 150);
        g2d.draw(linea);
        g2d.draw( new Line2D.Float(150, 150, 90, 10));

        g2d.setColor(Color.BLUE);
        g2d.draw( new Rectangle2D.Float(100, 100,  90, 40) );
        g2d.fill( new Rectangle2D.Float(150, 150,  90, 40) );

        g2d.setPaint( new GradientPaint(50, 50, Color.YELLOW, 100,100, Color.BLUE, true) );

        g2d.fill( new Ellipse2D.Float( 50, 50, 50, 100)); 

        /*Color primario = new Color(0xe6,0x93,0x00);
        int h = 100;
        int w = 100;
        Font font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 18);
        g.setFont(font);
        g.setColor( Color.red);
        g.drawString("Saludos Programas!!!!!", 100, 100);
        g.setColor(primario);
        g.drawLine(50, 50, 100, 150);
        g.drawRect(90, 110, 100, 70);
        g.fillRect(140, 160, h, w);
        g.setColor(Color.magenta);
        g.fillRoundRect(190, 190, 70, 45, 15, 85);
        g.fillOval(250, 200, 90, 90);
        g.setColor(Color.blue);
        g.fillArc(90, 200, 90, 45, 90,180);
        int[] xpoints = { 40, 90, 200 };
        int[] ypoints = { 120, 190, 250 };
        g.setColor(Color.yellow);
        g.fillPolygon(xpoints, ypoints, 3);*/
        
    }   


    public static void main(String[] args) {
        Dibujo dibujo = new Dibujo();       // Creamos objeto en memoria
        dibujo.resize(350, 350);            // Deprcado: Dimensionar la ventana
        dibujo.show();                      // Deprecado: Mostrar en pantall
    }
 }