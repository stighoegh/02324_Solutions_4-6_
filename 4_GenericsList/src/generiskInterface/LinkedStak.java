package generiskInterface;

public class LinkedStak implements IStak {

	private StakEle start;   
	

	private class StakEle {
		StakEle next;
		String data;

		StakEle(String s, StakEle e) {
			data = s;
			next = e;
		}
	}

	public LinkedStak() {
		start = null;
	}

	public void push(String s) {
		StakEle temp; 
		temp = new StakEle(s, start);
		start = temp;
	}

	public String pop() {
		if (empty()) return null;
		String s = start.data;
		start = start.next;
		return s;
	}

	public boolean empty() {
		return start == null;
	}

	public boolean full() {
		return false;
	}

	public void show() {
		for (StakEle p = start; p != null; p = p.next)
			System.out.println(p.data + " ");
		System.out.println("*");
	}
}


// laver liste hvor det nye element sættes ind først i listen
// if (empty()) return null; hvad kunne man også gøre her
