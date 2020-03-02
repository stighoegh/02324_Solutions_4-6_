package generiskInterface;
// opgaveformulering:
// https://docs.google.com/document/d/1M9XMgYBJukxyAIJB8L2eVDRNWwU6eKJMNPQS0TRyLhc/edit#heading=h.j6ihcpj3x3ah

import java.io.*;
import java.util.*;
import generiskInterface.IStak.StakEmptyException;

public class Main {

		public static IStak opret_stak(){
			return new LinkedStak();
		}

		public static void main(String[] args) throws IOException, StakEmptyException{
			// TODO Auto-generated method stub
			int valg = 0;
			Scanner scan = new Scanner(System.in);
			
			while (valg != 3){
			System.out.println( "MENU TEST STAK");
			System.out.println( "Test stak med array: 1");
			System.out.println( "Test stak med liste: 2");
			System.out.println( "STOP: 3");
						
			valg = scan.nextInt(); 
				 switch (valg) {
		            case 1:  {System.out.println("hvor mangeelementer?" );
		            			int str= scan.nextInt();
		            			IStak s = new ArrayStak(str);
		            			s.push("Dette");
		            			s.push(" er");
		            			s.push(" en");
		            			s.show();
		            			s.push(" mærkelig");
		            			s.push(" sætning");
		            			s.show();
		            			for (int i= 0; i < 5; i++) 
		            				System.out.println(s.pop());
		         			}
		                     break;
		            case 2:  {IStak s = opret_stak();
		            			s.push("Dette");
		            			s.push(" er");
		            			s.push(" en");
		            			s.show();
		            			s.push(" mærkelig");
		            			s.push(" sætning");
		            			s.show();
		            		            }
					         break;
		            case 3:  System.out.println("Bye");
		                     break;
		             default: System.out.println("Ugyldigt tal");
		             			break;
				 	}
				 }//while
			scan.close();
		} //main
}