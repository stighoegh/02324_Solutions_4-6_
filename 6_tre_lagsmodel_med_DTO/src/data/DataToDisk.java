package data;
import dto.IngDTO;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class DataToDisk implements IData {
    private List<IngDTO> ingredientsList;

    public DataToDisk() {
        ingredientsList = new ArrayList<IngDTO>();
        File tempFile = new File("IngDTO.dat");
        if (tempFile.exists()) {
            ingredientsList=readFromDisk();
        }
        else {
            ingredientsList.add(new IngDTO(1, "flormelis", 60));
            ingredientsList.add(new IngDTO(2, "mel", 240));
            ingredientsList.add(new IngDTO(3, "smør", 185));
            writeToDisk(ingredientsList);
        }
    }

    @Override
    public List<IngDTO> getAllIngredients() {
        return ingredientsList;
    }
    public void createIngredient(int id, String name, int amount) throws NummerFindesAllerede {
        for (IngDTO s : ingredientsList)
            if (s.getId() == id)
                throw new NummerFindesAllerede(id);
        ingredientsList.add(new IngDTO(id, name, amount));
        writeToDisk(ingredientsList);
    }
    public void createIngredient(IngDTO ing) throws NummerFindesAllerede {
        for (IngDTO s : ingredientsList)
            if (s.getId() == ing.getId())
                throw new NummerFindesAllerede(s.getId());
        ingredientsList.add(ing);
        writeToDisk(ingredientsList);
    }
        private static void writeToDisk(List<IngDTO> ingredientsList1){
        try {
            FileOutputStream fos = new FileOutputStream("IngDTO.dat");
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(ingredientsList1);
            outputStream.flush();
            outputStream.close();
            fos.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
    private static List<IngDTO> readFromDisk(){
        List<IngDTO> ingredientsList = null;
        try {
            ObjectInputStream temp
                    = new ObjectInputStream(new FileInputStream("IngDTO.dat"));
            ingredientsList = (List<IngDTO>) temp.readObject();
            temp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ingredientsList;
    }

}

























