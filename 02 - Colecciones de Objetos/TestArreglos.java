
/**
 * Write a description of class TestArreglos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestArreglos
{
   // tipo nombre[]  <- Define el manejador a arreglo
   int arreglo1[], arreglo4;
   int []arreglo2, arreglo5 = new int[5];
   int[] arreglo3, arreglo6 = { 0,1,2,3,4,5,6,7,8,9};
   int[][] matriz = new int[3][3];
   int[][] matriz3;
   int [][] matriz2 = { {1,2,3}, {4}, {5,6,7,8}, {9,0} };
   
   public TestArreglos() {
       arreglo1 = new int[5];   //  Creamos el arreglo
       arreglo2 = arreglo1;
       
       arreglo3 = new int[200];
       
       for(int i = 0; i < arreglo3.length; i++) {
            arreglo3[i] = i;
        }
        
        int suma = 0;
        //  For...each
        for(int elemento : arreglo3) {
            suma += elemento;
        }
           
        matriz[0][0] = 0;
       arreglo1[3] = 50;
       arreglo2[3] = 100;
       
       matriz3 = new int[4][0];
       matriz3[0] = new int[3];
       matriz3[1] = new int[1];
       matriz3[2] = new int[4];
       matriz3[3] = new int[2]; 
       
       float x = 0.0f;
       
       metodo(arreglo1);
       
       for(int i = 0; i < matriz.length; i++)
           for(int j = 0; j < matriz[i].length; j++)
               matriz[i][j] = j;
       
    }
    

    public void metodo(int arr[]) {
        arr[1] = 1;
        
    }
 
}







