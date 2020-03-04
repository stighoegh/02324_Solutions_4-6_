package funk;
import data.IData;
import dto.IngDTO;
import java.util.List;

public interface IFunk {
    List<IngDTO> getAllIngredients();
    void createIngredient(int id, String name, int amount) throws IData.NummerFindesAllerede, MaengdeForStor;
    void createIngredient(IngDTO ing) throws IData.NummerFindesAllerede, MaengdeForStor;

    public class MaengdeForStor extends Exception {
        IngDTO ing;
        public MaengdeForStor(IngDTO ing){
            super ("Mængde er større end " + ing.getAmount() + " g");
        }


    }



}
