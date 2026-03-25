import java.awt.*;

public class Calculadora extends Frame {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Button btnMas, btnMenos, btnMult, btnDiv, btnIgual, btnPunto, btnC;
    private TextField txtDisplay;
    private Panel pnlTeclado, pnlDisplay;
    private double numero1, numero2, resultado;
    private char operacion;
    private boolean operando, punto;
    private String displayNum, sign;

    public Calculadora() {
        super("Calculadora");

        // Creación de Objetos
        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btnMas = new Button("+");
        btnMenos = new Button("-");
        btnMult = new Button("*");
        btnDiv = new Button("/");
        btnIgual = new Button("=");
        btnPunto = new Button(".");
        btnC = new Button("C");

        txtDisplay = new TextField("0");

        pnlDisplay = new Panel();
        pnlTeclado = new Panel();

        //  Organizar los Paneles
        //  Panel Teclado
        pnlTeclado.setLayout( new GridLayout(4, 4) );
        pnlTeclado.add(btn7);
        pnlTeclado.add(btn8);
        pnlTeclado.add(btn9);
        pnlTeclado.add(btnDiv);
        pnlTeclado.add(btn4);
        pnlTeclado.add(btn5);
        pnlTeclado.add(btn6);
        pnlTeclado.add(btnMult);
        pnlTeclado.add(btn1);
        pnlTeclado.add(btn2);
        pnlTeclado.add(btn3);
        pnlTeclado.add(btnMenos);
        pnlTeclado.add(btnIgual);
        pnlTeclado.add(btn0);
        pnlTeclado.add(btnPunto);
        pnlTeclado.add(btnMas);

        // Panel Display
        pnlDisplay.setLayout( new BorderLayout() );
        pnlDisplay.add(btnC, "East");
        pnlDisplay.add(txtDisplay, "Center");

        //  Configuramos el Frame
        add(pnlDisplay, "North");          // add del Frame
        add(pnlTeclado, "Center");

        // Inicialización de estados
        operando = punto = true;
        numero1 = numero2 = 0.0;
    }

    //  Sección de Gestión de eventos
    public boolean handleEvent(Event e) {
        if (e.id ==  Event.WINDOW_DESTROY) {        // Lo que ocurrió fue un Cierre de ventana?
            hide();                                     // Oculto la ventana
            dispose();                                  // La remuevo de memoria
            return true;                                    // Aviso que porcesé el evento
        }
        return super.handleEvent(e);                // Cualquier otro evento es atendido por la clase Frame
    }

    public boolean action(Event e, Object o) {
        if ( e.target instanceof Button) {
            if (e.target == btnC ) {
                txtDisplay.setText("0");            //  Inicializamos el display 
                punto = operando = true;            // Inicializamos los estados de la claculadora
                numero1 = numero2 = 0.0;            //  iniciamos los operandos de la cuenta
            } else {
                if ( e.target == btnMas || e.target == btnMenos || e.target == btnMult || e.target == btnDiv) {
                    Button btnTemp = (Button) e.target;
                    sign = new String( btnTemp.getLabel() );
                    operacion = sign.charAt(0);         //  Extraigo el primer caracter
                    numero1 = Double.parseDouble( txtDisplay.getText() );
                    punto = true;               // Espero punto decimal
                    operando = false;           // Pasamosd a capturar el segundo operando
                    txtDisplay.setText("0");
                } else {
                   if (e.target == btnPunto) {
                        if (punto) {
                            displayNum = new String( txtDisplay.getText() );  // extraigo el numero del display
                            displayNum = displayNum + ".";          //  Agregoi el punto decimal al número
                            txtDisplay.setText(displayNum);         //  Regreso el numerno con punto al display
                            punto = false;
                        }
                   } else {
                        if (e.target == btnIgual) {
                            numero2 = Double.parseDouble( txtDisplay.getText() );
                            switch (operacion) {
                                case '+': resultado = numero1 + numero2; break;  
                                case '-': resultado = numero1 - numero2; break;  
                                case '*': resultado = numero1 * numero2; break;  
                                case '/': resultado = numero1 / numero2; break;  
                            }
                            txtDisplay.setText( String.valueOf(resultado) );
                            operando = true;
                        } else {
                            displayNum = new String( txtDisplay.getText() );
                            if ( displayNum.equals("0") ) {
                                displayNum = "";
                            }
                            Button btnTemp = ( Button ) e.target;   // Capturo el boton presionado
                            displayNum += btnTemp.getLabel();       // Concateno el numero de la tecla presionada
                            txtDisplay.setText(displayNum);
                        }
                   } 
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.resize(300, 350);
        calc.show();
    }
}