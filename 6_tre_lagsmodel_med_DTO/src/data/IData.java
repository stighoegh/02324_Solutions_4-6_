package data;
import dto.IngDTO;
import java.util.List;
public interface IData {
    List<IngDTO> getAllIngredients();
    void createIngredient(int id, String name, int amount) throws NummerFindesAllerede;
    void createIngredient(IngDTO ing)throws NummerFindesAllerede;

    class NummerFindesAllerede extends Exception {
        int id;
        public NummerFindesAllerede(int id){
            super ("Id nr:" + id + " findes allerede");
        }
    }
}
