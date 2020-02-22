import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

class BankAccount {
	private String name;
	private double balance;
	public BankAccount(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}

	public String toString() {

		return name + " " + balance;
	}
}

public class MapEks {

	public static void main(String[] args) {

		Map<String, BankAccount> tm = new TreeMap<String, BankAccount>();
		tm.put("M", new BankAccount("Michel", 111.11));
		tm.put("G", new BankAccount("Georgie", 222.22));
		tm.put("S", new BankAccount("Sam", 333.33));
		tm.put("P", new BankAccount("Pei", 444.44));
		tm.put("Z", new BankAccount("Zac", 555.55));
		tm.put("Z", new BankAccount("Zac", 555.55)); // dublicate

		// returner nøglerne i Map  
		// i TreeMap implementeringen er nøgler sorteret
		Set<String> keys = tm.keySet();


		// returner værdier i Map
		Collection<BankAccount> accountCollection = tm.values();

		// returner en iterator 
		Iterator<BankAccount> itr = accountCollection.iterator();

		// find sum af indestående
		double allTheMoney = 0.0;
		while (itr.hasNext()) {
			allTheMoney += itr.next().getBalance();
		}

		System.out.println("total indeståender: " + allTheMoney);
		
		// The mappings
		Collection<Entry<String, BankAccount>> mapping = tm.entrySet();

		Iterator<Entry<String, BankAccount>> itr2 =  mapping.iterator();

		while (itr2.hasNext()) {
			System.out.print("<" +itr2.next().toString()
					+ ">  ");
		}
	}
}
