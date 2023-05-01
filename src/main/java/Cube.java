/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sukhm
 */
public class Cube extends ThreeDShape

{


public Cube( int x, int y, int side )

{

super( x, y, side, side, side );

} 

public String getName()

{

return "Cube";

}


public int getArea()

{

int area=6*getDimension1()*getDimension1();
return area;

}


public int getVolume()

{

int vol=getDimension1()*getDimension1()*getDimension1();

return vol;

}

}