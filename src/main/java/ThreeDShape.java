/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sukhm
 */
public abstract class ThreeDShape extends Shape{
    private int dimension1;
    private int dimension2;
    private int dimension3;

    public ThreeDShape(int x, int y, int Dimension1 , int Dimension2 , int Dimension3) {
        super(x, y);
        dimension1 = Dimension1;
        dimension2 =Dimension2;
        dimension3= Dimension3;
                
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

    public int getDimension3() {
        return dimension3;
    }

    public void setDimension3(int dimension3) {
        this.dimension3 = dimension3;
    }
    public abstract int getArea();

public abstract int getVolume();

}
    

