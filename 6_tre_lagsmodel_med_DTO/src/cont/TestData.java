package cont;

import data.Data;
import data.DataToDisk;
import data.DataSQL;
import data.IData;
import dto.IngDTO;
import java.util.List;

public class TestData {
	public static void main(String[] args) {
		IData d;
		boolean writeToDisk = false;
		boolean writeToSQL = true;
		if (writeToDisk) {
			d = new DataToDisk();
			System.out.println("Using Disk method");
		} else if (writeToSQL) {
			d = new DataSQL();
			System.out.println("Using SQL method");
		} else {
			d = new Data();
			System.out.println("Using Data method");
		}
		
		for (IngDTO s : d.getAllIngredients()) {
			System.out.println(s);
		}
		try {
			d.createIngredient(14, "Ã¸l", 222);
		} catch (IData.NummerFindesAllerede e) {
			System.out.println(e.getMessage());
		}
		try {
			d.createIngredient(new IngDTO(15, "vand", 300));
		} catch (IData.NummerFindesAllerede e) {
			System.out.println(e.getMessage());
		}

		for (IngDTO s : d.getAllIngredients()) {
			System.out.println(s);
		}
	}
}

//        List<IngDTO> list = d.getAllIngredients();
//        IngDTO[] itemsArray = new IngDTO[list.size()];
//        itemsArray = list.toArray(IngDTO a);
//        System.out.println(itemsArray.toString());
