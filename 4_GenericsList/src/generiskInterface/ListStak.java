package generiskInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

@SuppressWarnings("unused")
public class ListStak implements IStak {
	
	List<String> ar;
		
	public ListStak(){
		ar = new ArrayList<String>(); 			//0 sec, 60sec for 1.000.000 pop er langsom
		//ar = new Vector<String>(); 			//0 sec, 60sec for 1.000.000 pop er langsom 
		//ar = new LinkedList<String>(); 		//3 sec, 0 sec for 10.000.000

	}
	
	@Override
	public void push(String x) {
		ar.add(x);
		
	}

	@Override
	public String pop() throws StakEmptyException {
		if (ar.size()==0)
			throw new StakEmptyException("Der er ingen elementer");
		String res=ar.get(0);
		ar.remove(0);
		return res;
	}

	@Override
	public boolean empty() {
		if (ar.size()==0)
				return true;
		else
				return false;
	}

	@Override
	public boolean full() {
		return false;
	}

	@Override
	public void show() {
		for (String p : ar)
			System.out.println(p + " ");
		System.out.println("*");
	}
}
