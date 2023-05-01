/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Sphere extends ThreeDShape

{


public Sphere( int x, int y, int radius )

{

super( x, y, radius, radius, radius );

} 


public int getArea()

{

int area=(int) (4*Math.PI*getDimension1()*getDimension1());

return area;

}


public int getVolume()

{

int vol=(int)( ((double)4/3)*Math.PI*getDimension1()*getDimension1()*getDimension1());

return vol;

}


public String getName()

{

return "Sphere";

}

}