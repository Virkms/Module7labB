/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sukhm
 */
public class Circle extends TwoDShape{
public Circle(int x, int y, int radius)
{
    super(x, y,radius,radius);
    
}

public String getName(){
    return "Circle";
}

   public int getArea(){
       int area=(int) (Math.PI*getDimension1()*getDimension1());

return area;
   }
    
    
}
