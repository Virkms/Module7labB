/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sukhm
 */
public class ShapeTest {
    public static void main(String[] args) {
        
    

Shape shapes[] = new Shape[ 6 ];

shapes[ 0 ] = new Circle( 10, 90, 5 );

shapes[ 1 ] = new Square( 50, 45, 25 );

shapes[ 2 ] = new Sphere( 12, 24, 4 );

shapes[ 3 ] = new Cube( 9, 9, 9 );
shapes[4] = new Triangle(80 ,20,10,15);
shapes [5] = new Tetrahedron(10,20,30);



for ( Shape currentShape : shapes )

{

System.out.printf( "%s: %s",currentShape.getName(), currentShape );

if ( currentShape instanceof TwoDShape twoDShape )

{


System.out.printf( "%s's area is %s\n",

currentShape.getName(), twoDShape.getArea() );

}
    // end if

if ( currentShape instanceof ThreeDShape threeDShape )

{


System.out.printf( "%s's area is %s\n",

currentShape.getName(), threeDShape.getArea() );

System.out.printf( "%s's volume is %s\n",

currentShape.getName(),

threeDShape.getVolume() );

}

System.out.println();

} 
    }
}
