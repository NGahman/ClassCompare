/**
Nicholas Gahman
2/16/19
Kendall Martin
*/

public class Quadratic implements Comparable<Quadratic>
{
   private double a, b, c;
   
   /**
   Constructs the class with coefficients of 1, 2, and 1, resulting in x^2+2x+1.
   */
   public Quadratic()
   {
      this.a = 1.0;
      this.b = 2.0;
      this.c = 1.0;
   }
   
   /**
   Constructs the class with coefficients equals to the variables.
   @param Three doubles, one for each coefficient.  They can be any real number.
   */
   public Quadratic(double a, double b, double c)
   {
      this.a = a;
      this.b = b;
      this.c = c;
   }
   
   /**
   Returns the coefficient a.
   @return The coefficient a.
   */
   public double getA()
   {
      return this.a;
   }
   
   /**
   Returns the coefficient b.
   @return The coefficient b.
   */
   public double getB()
   {
      return this.b;
   }
   
   /**
   Returns the coefficient c.
   @return The coefficient c.
   */
   public double getC()
   {
      return this.c;
   }
   
   /**
   Sets the coefficient a to the parameter.
   @param A single double.  It can be any real number.
   */
   public void setA(double a)
   {
      this.a = a;
   }
   
   /**
   Sets the coefficient b to the parameter.
   @param A single double.  It can be any real number.
   */
   public void setB(double b)
   {
      this.b = b;
   }
   
   /**
   Sets the coefficient c to the parameter.
   @param A single double.  It can be any real number.
   */
   public void setC(double c)
   {
      this.c = c;
   }
   
   /**
   Gets the discriminant, then returns whether the discriminant is positive, negative, or zero.
   @return Whether the discriminant is positive, negative, or zero.
   */
   public double getDiscriminant()
   {
      return Math.pow(b,2)-(4*(a*c));   
   }
   /**
   Gets the discriminant, then returns the amount of real and complex roots.
   @return The amount of real and complex roots.
   */
   public int getRealOrComplexRoots()
   {
      if (Math.pow(b,2)-(4*(a*c)) < 0)
      {
         return 0;
      }
      else if (Math.pow(b,2)-(4*(a*c)) == 0)
      {
         return 1;
      }
      else
      {
         return 2;
      }
   }
   
   /**
   Gets the derivative of the quadratic function, then returns the value of the derivative if x was the parameter.
   @param A single double.  Can be any real number.
   @return The value of the derivative if x was the parameter, as well as x.
   */
   public double getDerivativeValue(double x)
   {
      return ((x*(2*a))+b);
   }
   
   /**
   If there are any real roots, returns them.  Otherwise, returns that there are no real roots in the function.
   @return The real roots, if there are any.
   */
   public String[] getRealRoots()
   {
      double d = Math.pow(b,2)-(4*(a*c));
      if (d >= 0)
      {
         double e = ((-b)-Math.sqrt(d))/(2*a);
         double f = ((-b)+Math.sqrt(d))/(2*a);
         return new String[] {Double.toString(e), Double.toString(f)};
      }
      else
      {
         return new String[] {"N/A", "N/A"};
      }
      
   }
   @Override
   /**
   Compares the class to another Quadratic class.  If the class's A is greater than the other Quadratic class's A, it returns 1.  If the As are equal, return 0.
   If the class's A is lesser than the other Quadratic class's A, it returns -1.
   @param Another Quadratic class.
   @return Either -1, 0, or 1.
   */
   public int compareTo(Quadratic otherQuadratic)
   {
	   return -1*(Double.valueOf(Math.abs(otherQuadratic.getA())).compareTo(Math.abs(this.a)));
   }
   
   /**
   @return String
   If the class itself is printed, convert the result to a usable format.
   */
   
   public String toString()
   {
	   return ("\na: " + this.a + "\n b: " + this.b + "\n c: " + this.c + "\n");
   }
}