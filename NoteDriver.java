import java.util.*;
public class NoteDriver 
{
	public static void main(String[] args) 
	{
		//Creates classes
		Note note1 = new Note();
		Note note2 = new Note();
		Note note3 = new Note();
		Note note4 = new Note();
		Note note5 = new Note();
		Note note6 = new Note();
		Note note7 = new Note();
		
		//Sets the classes to different lengths and values.
		note3.setlength("half");
		note4.setlength("eighth");
		note6.setvalue(40);
		note7.setlength("whole");
		note7.setvalue(-40);
		
		//Compares each of the note classes to a different note class.
		System.out.println(note1.compareTo(note2));
		System.out.println(note2.compareTo(note3));
		System.out.println(note3.compareTo(note4));
		System.out.println(note4.compareTo(note5));
		System.out.println(note5.compareTo(note6));
		System.out.println(note6.compareTo(note7));
		System.out.println(note7.compareTo(note1));
		
		//Creates Arraylist, then adds each class to the Arraylist.
		ArrayList<Note> notes = new ArrayList<Note>();
		notes.add(note1);
		notes.add(note2);
		notes.add(note3);
		notes.add(note4);
		notes.add(note5);
		notes.add(note6);
		notes.add(note7);
		
		//Sorts the note classes, then prints the result.
		Collections.sort(notes);
		System.out.println(notes);
	}
}
