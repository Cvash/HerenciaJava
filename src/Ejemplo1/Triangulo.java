
package Ejemplo1;

public class Triangulo extends Rectangulo{
    
    private double lado3;

    
    
    @Override
    public void calcularArea(){
        
        double s;
        s = (lado1 + lado2 + lado3)/2;
        
        area = Math.sqrt( s*(s-lado1)*(s-lado2)*(s-lado3) );
        
    }
    /* Polimorfismo */
    
    public void calcularArea( double h ) {
        
        area = (lado1*h)/2;
        
    }
    
    public void calcularArea( int a ) {
        
        area = (double)(1/2)*lado1*lado2*Math.sin( a );
        
    }
    

    /**
     * @return the lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    
    
    
}
