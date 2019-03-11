import java.util.*;
public class QuadraticDriver
{
	public static void main(String[] args) 
	{
		//Defines classes
		Quadratic quad1 = new Quadratic(3.0,2.0,1.0);
		Quadratic quad2 = new Quadratic(3.0,2.0,1.0);
		Quadratic quad3 = new Quadratic(1.0,2.0,3.0);
		Quadratic quad4 = new Quadratic(2.0,9.0,8.0);
		Quadratic quad5 = new Quadratic(5.0,10.0,12.0);
		
		//Compares each class
		System.out.println(quad1.compareTo(quad2));
		System.out.println(quad2.compareTo(quad3));
		System.out.println(quad3.compareTo(quad4));
		System.out.println(quad4.compareTo(quad5));
		System.out.println(quad5.compareTo(quad1));
		
		//Creates Arraylist and adds each class to the Arraylist
		ArrayList<Quadratic> quads = new ArrayList<Quadratic>();
		quads.add(quad1);
		quads.add(quad2);
		quads.add(quad3);
		quads.add(quad4);
		quads.add(quad5);
		
		//Sorts the Arraylist, then prints the result
		Collections.sort(quads);
		System.out.println(quads);

	}

}
