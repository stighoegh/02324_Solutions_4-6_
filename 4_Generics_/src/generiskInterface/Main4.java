package generiskInterface;

import java.io.*;
import java.util.*;
import generiskInterface.IStak.StakEmptyException;

public class Main4 {
		public static void main(String[] args) throws IOException, StakEmptyException{
			IStak s = new ListStak();
			int antalGennemloeb = 1000000;
			
			System.out.println("Klasse som testes = " + ListStak.class);
			System.out.println("Antal gennemløb = " + antalGennemloeb);
			System.out.println("");
			
			System.out.print("Tid før push = ");
			System.out.println(new Date());
			for (int i = 0; i < antalGennemloeb; i++)
				s.push("Dette");
			
			System.out.print("Tid før pop = ");
			System.out.println(new Date());

			for (int i = 0; i < antalGennemloeb; i++)
				s.pop();
			
			System.out.print("Tid efter pop = ");
			System.out.println(new Date());
		}
}
