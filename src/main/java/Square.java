/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sukhm
 */
public class Square extends TwoDShape{
    public Square(int x, int y, int side)
    {
        super(x,y,side,side);
       
    }
    public int getArea()
{
    int area = getDimension1()*getDimension1();

return area; 
}
    public String getName()

{

return "Square";
}
}
