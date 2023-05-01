

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public abstract class TwoDShape extends Shape{
    private int dimension1;
    private int dimension2;
    public TwoDShape(int x, int y,int a, int b) {
        super(x, y);
        dimension1  = a;
        dimension2 = b;
    }

    public int getDimension1() {
        return dimension1;
    }

    public void setDimension1(int dimension1) {
        this.dimension1 = dimension1;
    }

    public int getDimension2() {
        return dimension2;
    }

    public void setDimension2(int dimension2) {
        this.dimension2 = dimension2;
    }
   public abstract int getArea();
}
