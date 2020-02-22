import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;


public class CountWords {

	public static void main(String[] args) {
		if ( args.length != 1 ) {
			System.err.println( "Brug:  java CountWords <fil>" );
			System.exit( 1 );
		}

		Scanner sc = null;

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		try {

			sc = new Scanner(new File(args[0]));

		} catch ( FileNotFoundException e ) {
			System.err.println( e.getMessage() );
			System.exit( 1 );
		}	

		while (sc.hasNext()) {
			// Stringtokenizer med angivelse af delimiters
			StringTokenizer st = new StringTokenizer(sc.nextLine(), ",.-!?:;\" ");

			while ( st.hasMoreElements() ) {
				String word = st.nextToken();

				Integer freq = map.get( word );

				if ( freq == null )
					freq = new Integer(1);
				else
					freq = new Integer( freq.intValue() + 1 );

				map.put( word, freq );

			}
		}

		System.out.println( "Der er " + map.size() + " forskellige ord" );
		System.out.println( "==================== Ord (ikke sorteret)========================== " );
		for (String ord : map.keySet()) 
			System.out.println(ord);

		TreeMap<String, Integer> ts = new TreeMap(map);
		System.out.println();
		System.out.println( "==================== Ord (sorteret)=============================== " );
		for (String ord : ts.keySet())
			System.out.println(ord);

	}
}


