import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person {
	private String navn;
	private int alder;


	public Person(String navn, int alder) {
		super();
		this.navn = navn;
		this.alder = alder;
	}

	public String toString() {
		return navn + " " + alder;
	}
	
	public static void main(String[] args) {
		List personer = new ArrayList();

		personer.add(new Person("Stine", 24));
		personer.add(new Person("Dorthe", 35));
		personer.add(new Person("Tina", 39));
		personer.add(new Person("Peter", 42));
		personer.add(new Person("Lars", 28));

		// explicit cast til Person
		Person p1 = (Person) personer.get(1); 
		
		// fjern person
		personer.remove(p1);
		
		// fjern person med index
		personer.remove(2);
		
		// find størrelse
		System.out.println("Antal elementer : " + personer.size());
		
		// udskriv elementer (brug af toString)
		System.out.println("personer : " + personer);

		// udskriv elementer med iterator
		Iterator itr = personer.iterator();
	    while (itr.hasNext()) {
	      System.out.println(itr.next());
	    }
	
		// udskriv elementer med for each løkke
		for (Object o : personer)
			System.out.println(o);
	}
}
