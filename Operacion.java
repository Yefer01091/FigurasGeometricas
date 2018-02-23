
package ClasesYObjetos;

import java.util.Scanner;


public class Operacion {
    
    double perimetroCir,areaCir;
    double perimetroCua,areaCua;
    double perimetroTri,areaTri;
    
    public void circulo(){
        Scanner leer = new Scanner(System.in);
        double pi = 3.14;
        double radio;
       
        
        
        System.out.println("Ingrese el radio: ");
        radio = leer.nextDouble();
        
        perimetroCir = 2*radio*pi;
        areaCir = pi*Math.pow(radio,2);

        System.out.println("Perimetro del circulo: "+perimetroCir);
        System.out.println("Area del circulo: "+areaCir);
    }
    
    public void triangulo(){
        Scanner triangulo = new Scanner(System.in);
        double base, altura;
        double a=0,b=0,c=0;
        
        System.out.println("lado a: ");
        a = triangulo.nextDouble();
        
        System.out.println("lado b: ");
        b = triangulo.nextDouble();
        
        System.out.println("lado c: ");
        c = triangulo.nextDouble();
        
        
        System.out.println("Ingresar base: ");
        base = triangulo.nextDouble();
        
        System.out.println("Ingresar altura: ");
        altura = triangulo.nextDouble();
        
        perimetroTri = a+b+c;
        areaTri = base*altura/2;
        
        System.out.println("Perimetro del triangulo: "+perimetroTri);
        System.out.println("Area del triangulo: "+areaTri);
    }
    
    public void cuadrado(){
        Scanner cuadrado = new Scanner(System.in);
        double lado;
        
        System.out.println("Digite la longitud de un lado: ");
        lado = cuadrado.nextDouble();
        
        perimetroCua = lado*4;
        areaCua = Math.pow(lado, 2);
        
        System.out.println("Perimetro del Cuadrado: "+perimetroCua);
        System.out.println("Area del cuadrado: "+areaCua);
    }    
}
