
package Ejemplo1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner s =  new Scanner(System.in);
        
        System.out.println("El area de un cuadrado");
        Cuadrado c = new Cuadrado();
        System.out.println("Ingresar el lado: ");
        c.setLado1(s.nextDouble());
        c.calcularArea();
        System.out.println("El area del cuadrado es: " + c.getArea());
        
        System.out.println("\nArea de un Resctangulo");
        Rectangulo r = new Rectangulo();
        System.out.println("Ingrese la base: ");
        r.setLado1(s.nextDouble());
        System.out.println("Ingrese la altura");
        r.setLado2(s.nextDouble());
        r.calcularArea();
        System.out.println("El area del Rectangulo es: " + r.getArea());
        
        System.out.println("El area de un triangulo");
        Triangulo t = new Triangulo();
        System.out.println("Ingrese lado 1: ");
        t.setLado1(s.nextDouble());
        System.out.println("Ingrese lado 2: ");
        t.setLado2(s.nextDouble());
        System.out.println("Ingrese lado 3: ");
        t.setLado3(s.nextDouble());
        t.calcularArea();
        System.out.println("El area del triangulo es: " + t.getArea());
        
        
        System.out.println("***************************************************");
        System.out.println("                Metodo de polimorfismo             ");
        System.out.println("***************************************************");
        
        System.out.println("Ingresar la base");
        t.setLado1(s.nextDouble());
        System.out.println("Ingresar la altura");
        double h = s.nextDouble();
        t.calcularArea(h);
        t.calcularArea();
        System.out.println("El area del triangulo conociendo su base y altura: " +t.getArea());
        
        
        System.out.println("Ingresa lado 1");
        t.setLado1(s.nextDouble());
        System.out.println("Ingresa lado 2");
        t.setLado2(s.nextDouble());
        System.out.println("Ingrese el angulo");
        int a = s.nextInt();
        t.calcularArea(a);
        t.calcularArea();
        System.out.println("El area del triangulo conociendo el angulo: " + t.getArea());
        
        
    }
    
}
