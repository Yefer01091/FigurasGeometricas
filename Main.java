
package ClasesYObjetos;

import java.util.Scanner;

public class Main {
    
    public static void main(String [] args){
        
        Main main = new Main();
        main.menu();
        
    }
    
    public void menu(){
        Scanner leer = new Scanner(System.in);
        Operacion operacion = new Operacion();
        while(true){
            System.out.print("PROGRAMA CALCULO AREAS Y PERIMETROS \n"
                    + "1.Circulo\n"
                    + "2.Triangulo\n"
                    + "3.Cuadrado\n"
                    + "4.Salir\n"
                    + "opcion: ");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:operacion.circulo();
                break;
                case 2:operacion.triangulo();
                break;
                case 3:operacion.cuadrado();
                break;    
            }
        }  
    } 
}
