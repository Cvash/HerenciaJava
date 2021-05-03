
package Ejemplo1;

public class Rectangulo extends Cuadrado{
    
    protected double lado2;

    @Override
    public void calcularArea() {
        
        area = lado1 * lado2;
        
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    
    
}
