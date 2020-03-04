package cont;
import data.Data;
        import data.IData;
        import dto.IngDTO;
        import funk.Funk;
        import funk.IFunk;
        import java.util.List;
public class TestFunk {
    public static void main(String[] args) {
        IData d = new Data();
        IFunk f = new Funk(d);

        for (IngDTO s : f.getAllIngredients()) {
            System.out.println(s);
        }

        try {
            f.createIngredient(6, "øl", 222);
        } catch (IData.NummerFindesAllerede e) {
            System.out.println(e.getMessage());
        } catch(IFunk.MaengdeForStor e) {
            System.out.println(e.getMessage());
        }

        try{
            f.createIngredient(new IngDTO(7, "vand", 300));
        }catch (IData.NummerFindesAllerede e) {
            System.out.println(e.getMessage());
        }catch (IFunk.MaengdeForStor e){
            System.out.println(e.getMessage());
        }

        for (IngDTO s : d.getAllIngredients()) {
            System.out.println(s);
        }
    }
}
