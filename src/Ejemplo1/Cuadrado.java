
package Ejemplo1;

public class Cuadrado {
    
    protected double lado1;
    protected double area;
    
    public void calcularArea() {
        
        area = Math.pow( lado1, 2 );
        
    }

    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
    
    
    
}
