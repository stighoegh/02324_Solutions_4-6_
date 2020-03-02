package generiskInterface;


public class LinkedStak2 implements IStak{
	private Stakelement start;

	private class Stakelement {
		Stakelement next;
		String data;

		Stakelement (String s, Stakelement e){
			data = s;
			next = e;
		}
	}

	public LinkedStak2(){
		start = null;
	}
		
	public void push (String s) {
		Stakelement temp = new Stakelement (s, null);
		Stakelement aktuel = start;
		if (start==null){ 
			start=temp;
			return;
		}	
		else
		{
			while (aktuel.next!=null)
				aktuel=aktuel.next;
			aktuel.next=temp;
			return;
		}	
	}

	public String pop(){
		//if (empty()) return null; 
		Stakelement aktuel = start;
			while (aktuel.next.next!=null)
				aktuel=aktuel.next;
			aktuel.next=null;
		return aktuel.data;	
	}

	public boolean empty() {
		return start == null;
	}

	public boolean full(){
		return false;
	}

	public void show() {
		for (Stakelement p = start; p !=null; p = p.next)
			System.out.println (p.data + " ");
		System.out.println ("*");	
	}
}






