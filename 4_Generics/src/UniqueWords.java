import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class UniqueWords {

	public static void main(String[] args) {
		if ( args.length != 1 ) {
			System.err.println( "Brug:  java UniqueWords <fil>" );
			System.exit( 1 );
		}

		Scanner sc = null;
		
		Set set = new HashSet();
		
			
		try {

			sc = new Scanner(new File(args[0]));

		} catch ( FileNotFoundException e ) {
			System.err.println( e.getMessage() );
			System.exit( 1 );
		}	

		while (sc.hasNext()) {
			// Stringtokenizer med angivelse af delimiters
			StringTokenizer st = new StringTokenizer(sc.nextLine(), ",.-!?:;\" ");

			while ( st.hasMoreElements() )
				set.add(st.nextToken());
		}
		
		System.out.println( "Der er " + set.size() + " forskellige ord" );
		System.out.println( "Ord (ikke sorteret): " );
		for (Object ord : set)
			System.out.println(ord);
		
		System.out.println( "Der er " + set.size() + " forskellige ord" );
		for (Object ord : new TreeSet(set))
			System.out.println(ord);
		
		
	}

}
