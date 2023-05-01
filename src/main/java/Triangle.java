/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Triangle extends TwoDShape {

    public Triangle(int x, int y, int base, int h) {
        super(x, y, base, h);
    }

    @Override
    public String getName() {
        return "Triangle";
    }

   
   @Override
    public int getArea() {
        int area = (int) (0.5 * getDimension1() * getDimension2());
        return area;
    }
}