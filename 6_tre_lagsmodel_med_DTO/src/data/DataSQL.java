package data;

import java.util.ArrayList;
import java.util.List;
import dto.IngDTO;
import java.sql.*;

public class DataSQL implements IData {
	Connection conn;
	private String portnr = "3306"; //## fit to server
	private String databaseName = "ingredients";//## fit to server
	private String tableName = "ingr";//## fit to server
	private String user = "root"; //## fit to personal user profile
	private String password = ""; //## fit to personal user profile
	private String url = "jdbc:mysql://localhost:" + portnr + "/" + databaseName;
	public DataSQL() {
		System.out.println("Connecting database...");
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<IngDTO> getAllIngredients() {
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from "+tableName);
			ArrayList<IngDTO> ingredientsList = new ArrayList<IngDTO>();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int amount = rs.getInt("amount");
				ingredientsList.add(new IngDTO(id, name, amount));
			}
			return ingredientsList;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void createIngredient(int id, String name, int amount) throws NummerFindesAllerede {
		// create a Statement from the connection
		Statement statement = null;
		try {
			statement = conn.createStatement();
			statement.executeUpdate("INSERT INTO "+ tableName  + " VALUES  ("+id+", '"+name+"',"+amount+")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void createIngredient(IngDTO ing) throws NummerFindesAllerede {
        createIngredient(ing.getId(),ing.getName(),ing.getAmount());
	}
}
