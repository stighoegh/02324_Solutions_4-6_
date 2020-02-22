import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Name implements Comparable<Name> {

	private String first;
	private String last;


	public Name( String firstName, String lastName ) {
		first = firstName;
		last = lastName;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}


	public boolean equals( Name o ) {
		boolean retval = false;

		// check for samme objekt
		if (this == o) return true;

		// check felter
		if (o !=null && o instanceof Name ) {
			Name n = ( Name )o;
			retval = n.getFirst().equals( first ) && n.getLast().equals( last );
		}

		return retval;
	}

	public int hashCode() {
		return first.hashCode() + last.hashCode();
	}

	public String toString() {
		return first + " " + last;
	}
	public int compareTo( Name o )  {
		int retval;

		if (this == o) return 0;

		retval = last.compareTo( o.getLast() );

		if ( retval == 0 )
			retval = first.compareTo( o.getFirst() );

		return retval;
	}



	public static void main(String[] args) {
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name("Hans", "Hansen"));
		names.add(new Name("Peter", "Mogensen"));
		names.add(new Name("hans", "Andersen"));
		names.add(new Name("Hans", "Hansen"));

		// brug Names equal metode
		if ((names.get(0)).equals(names.get(3)))
			System.out.println(names.get(0) + " er det samme som " + names.get(3));
		
		// brug compareTo defineret i Name
		Collections.sort(names);
		System.out.println(names);
		
		
	}
}
