package cont;
import data.Data;
import data.IData;
import dto.IngDTO;
import java.util.List;
public class TestData {
    public static void main(String[] args) {
        IData d = new Data();
        for (IngDTO s : d.getAllIngredients()) {
            System.out.println(s);
        }
        try{
            d.createIngredient(3, "øl", 222);
        }catch (IData.NummerFindesAllerede e){
            System.out.println(e.getMessage());
        }
        try{
            d.createIngredient(new IngDTO(4, "vand", 300));
        }catch (IData.NummerFindesAllerede e){
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
