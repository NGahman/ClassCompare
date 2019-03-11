	/**
	Nicholas Gahman
	2/6/19
	Kendall Martin
	*/

	public class Note implements Comparable<Note>
	{
	   private int value;
	   private String length;
	   
	   //Defines the class as a quarter note with a value of 0 (A4).
	   public Note()
	   {
	      this.length = "quarter";
	      this.value = 0;
	   }
	   
	   /**
	   @param Any of the following Strings: "sixteenth", "eighth", "quarter", "half", and "whole".
	   Sets the length of the class to the length of the parameter.
	   */
	   public void setlength(String length)
	   {
	      this.length = length;
	   }
	   
	   /**
	   @param Any integer between -49 and 39, inclusive.
	   Sets the value of the class to the value of the parameter.
	   */
	   public void setvalue(int value)
	   {
	      this.value = value;
	   }
	   
	   /**
	   @return String
	   Gets the length of the class.
	   */
	   public String getlength()
	   {
	      return this.length;
	   }
	   
	   /**
	   @return int
	   Gets the value of the class.
	   */
	   public int getvalue()
	   {
	      return this.value;
	   }
	   
	   /**
	   @return int
	   Gets the Hertz value of the class.
	   */
	   public int getHertz()
	   {
	      return (int)(440*(Math.pow(2, (this.value/12))));
	   }
	   
	   /**
	   @return An int between 0 and 11 inclusive.
	   Takes the value of the class, and adds/subtracts 12 from it until the value is between 0 and 11 inclusive.
	   Then the function returns that value.
	   */
	   private int FindValue()
	   {
	      int value = this.value;
	      do
	      {
	         if (value >= 12)
	         {
	            value -= 12;
	         }
	         else if (value < 0)
	         {
	            value += 12;
	         }
	      }
	      while (value >= 12 || value < 0);
	      return value;
	   }
	   
	   /**
	   @return String
	   Using the result from FindValue(), the function returns one of the 12 keys on the keyboard, with A being 0 and G#/Ab being 11.
	   */
	   public String getLetter()
	   {
	      switch (FindValue())
	      {
	         case 0:
	         {
	            return "A";
	         }
	         case 1:
	         {
	            return "A#/Bb";
	         }
	         case 2:
	         {
	            return "B";
	         }
	         case 3:
	         {
	            return "C";
	         }
	         case 4:
	         {
	            return "C#/Db";
	         }
	         case 5:
	         {
	            return "D";
	         }
	         case 6:
	         {
	            return "D#/Eb";
	         }
	         case 7:
	         {
	            return "E";
	         }
	         case 8:
	         {
	            return "F";
	         }
	         case 9:
	         {
	            return "F#/Gb";
	         }
	         case 10:
	         {
	            return "G";
	         }
	         case 11:
	         {
	            return "G#/Ab";
	         }
	         default:
	         {
	            return "Error!  This should not happen.";
	         } 
	      }
	   }
	   
	   /**
	   @return Either "white" or "black".
	   Using the result from FindValue(), the function determines whether the value is a white key or a black key.
	   */
	   public String getWhiteOrBlack()
	   {
	      switch (FindValue())
	      {
	         case 0:
	         {
	            return "White";
	         }
	         case 1:
	         {
	            return "Black";
	         }
	         case 2:
	         {
	            return "White";
	         }
	         case 3:
	         {
	            return "White";
	         }
	         case 4:
	         {
	            return "Black";
	         }
	         case 5:
	         {
	            return "White";
	         }
	         case 6:
	         {
	            return "Black";
	         }
	         case 7:
	         {
	            return "White";
	         }
	         case 8:
	         {
	            return "White";
	         }
	         case 9:
	         {
	            return "Black";
	         }
	         case 10:
	         {
	            return "White";
	         }
	         case 11:
	         {
	            return "Black";
	         }
	         default:
	         {
	            return "Error!  This should not happen.";
	         } 
	      }
	   }
	   
	   /**
	   @return An int between 0 and 7 inclusive.
	   Takes the value of the class, and adds/subtracts 12 from it until the value is between 0 and 11 inclusive.
	   Every time it adds 12, it adds 1 to a counter.  Every time it subtracts 12, it subtracts 1.  The counter starts at 4.
	   Then the function returns the counter.
	   */
	   public int findOctave()
	   {
	      int value = this.value;
	      int counter = 4;
	      do
	      {
	         if (value >= 12)
	         {
	            value -= 12;
	            counter += 1;
	         }
	         else if (value < 0)
	         {
	            value += 12;
	            counter -=1;
	         }
	      }
	      while (value >= 12 || value < 0);
	      return counter;
	   }
	   
	   @Override
	   /**
	   @return String
	   If the class itself is printed, convert the result to a usable format.
	   */
	   public String toString()
	   {
	      return this.length + " " + this.value + " " + getHertz();
	   } 
	   
	   /**
	    * Converts the length notation into a form that the computer understands.
	    * @param s A string that equals either "whole", "half", "quarter" "eighth" or "sixteenth".
	    * @return An integer between -2 and 2 inclusive.
	    */
	   
	   public int lengthToInteger(String s)
	   {
		   if (s.equals("whole"))
		   {
			   return 2;
		   }
		   else if (s.equals("half"))
		   {
			   return 1;
		   }
		   else if (s.equals("quarter"))
		   {
			   return 0;
		   }
		   else if (s.equals("eighth"))
		   {
			   return -1;
		   }
		   else
		   {
			   return -2;
		   }
	   }
	   
	   /**
	    * Compares the class to another Note class through first length then frequency.
	    * @param Another Note class.
	    * @return Either 1, 0, or -1.
	    */
	   
	   public int compareTo(Note otherNote)
	   {
		   int value1, value2, value3;
		   value1 = lengthToInteger(otherNote.getlength());
		   value2 = lengthToInteger(this.length);
		   
		   value3 = -1*(Integer.valueOf(value1).compareTo(value2));
		   if (value3 == 0)
		   {
			   return -1*(Integer.valueOf(otherNote.getHertz()).compareTo(getHertz()));
		   }
		   return value3;
	   }
	}
