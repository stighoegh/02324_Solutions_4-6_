package funk;

import data.IData;
import dto.IngDTO;

import java.util.List;

public class Funk implements IFunk {
    private IData data;
    public Funk(IData data){
        this.data = data;
    }
    public List<IngDTO> getAllIngredients(){
        return data.getAllIngredients();
    }
    public void createIngredient(int id, String name, int amount) throws IData.NummerFindesAllerede, IFunk.MaengdeForStor{
        if (amount>1000)
            throw new MaengdeForStor(new IngDTO (id, name, amount));
        data.createIngredient(id, name, amount);
    }
    public void createIngredient(IngDTO ing) throws IData.NummerFindesAllerede, IFunk.MaengdeForStor {
        if (ing.getAmount()>1000)
            throw new MaengdeForStor(ing);
        data.createIngredient(ing);
    }
}
