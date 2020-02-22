import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Car implements Comparable<Car> {
	String make, model;
	int    year, hp;

	public Car() {
	}
	
	Car( String mk, String mdl, int yr, int power ) {
		make  = mk; model = mdl; year = yr; hp = power;
	}

	public int compareTo( Car otherCar ) { 
		if( this.make.compareTo( otherCar.make ) == 0 ) {
			if( this.model.compareTo( otherCar.model ) == 0 ) {
				return this.year - otherCar.year;
			}
			return this.model.compareTo( otherCar.model );
		}
		return this.make.compareTo( otherCar.make );
	}

	public boolean equals( Object other ) {
		Car otherCar = (Car)other;
		return this.make.equals( otherCar.make ) &&
		this.model.equals( otherCar.model ) &&
		this.year == otherCar.year;
	}
	public int hashCode() {
		return make.hashCode() + model.hashCode() ;
	}
	public String toString() {
		return year + " " + make + " " + model;
	}
	public class CompareByYear implements Comparator<Car> {
		public int compare( Car carOne, Car carTwo ) {
			return carOne.year - carTwo.year;
		}

	}
	
	public static void main(String[] args) {
		Set<Car> carset = new HashSet<Car>();

		carset.add( new Car( "Ford",    "Thunderbird", 1988, 195 ) );
		carset.add( new Car( "VW",      "Passat",      2001, 170 ) );
		carset.add( new Car( "Pontiac", "Grand Prix",  2005, 200 ) );

		// få en iterator
		Iterator<Car> iter = carset.iterator();
		
		// iterér over elementer i carset
		while( iter.hasNext() ) {
			System.out.println( iter.next() );
		}
		System.out.println();
		
		// opret en arraylist baseret på et set
		List<Car> carlist1 = new ArrayList<Car>(carset);
		
		// kopier carlist1 til carlist2
		List<Car> carlist2 = new ArrayList<Car>();
		carlist2.addAll(carlist1);
		
		
		// sortér carlist1 - brug compareTo
		Collections.sort(carlist1);
		for (Car a : carlist1)
			System.out.println(a);
		
		System.out.println();
		
		// sortér carlist2 - brug compare
		//	Collections.sort(carlist2, new Car().new CompareByYear());
		
		// sortér carlist2 -  brug af annonym inner class	
		Collections.sort(carlist2, new Comparator<Car>() {
			
			public int compare( Car carOne, Car carTwo ) {
				return carOne.year - carTwo.year;
			}
		});

		for (Car a : carlist2)
			System.out.println(a);
	}

}
