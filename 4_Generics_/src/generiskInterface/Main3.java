package generiskInterface;
import generiskInterface.IStak.StakEmptyException;

public class Main3 {

	public static void main(String[] args) throws StakEmptyException 
		{

		IStak s = new ListStak();
		try{
		s.pop();
		}
		catch (StakEmptyException e){
			System.out.println(e);
			System.out.println("Vi fortsætter");
		}
	
		
		
		s.push("Dette");
		s.push(" er");
		s.push(" en");
		s.show();
		s.push(" mærkelig");
		s.push(" sætning");
		s.show();
		for (int i= 0; i < 5; i++) 
			System.out.println(s.pop());
		
		
//		Stak s = new LinkedStak2();
//		s.push("Dette");
//		s.push(" er");
//		s.push(" en");
//		s.show();
//		s.push(" mærkelig");
//		s.push(" sætning");
//		s.show(); // denne er implementeret forkert
//		
//		for (int i= 0; i < 5; i++) 
//			System.out.println(s.pop());

	}

}
