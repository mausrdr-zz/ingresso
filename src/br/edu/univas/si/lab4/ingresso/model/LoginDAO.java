/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * @author mauro
 *
 */
public class LoginDAO extends ConnectDB {
	
	public boolean getLogin(String login, String senha) {
		String sql = "SELECT * FROM usuarios WHERE usuario LIKE '" + login +"' AND senha LIKE '" + senha + "';";
		boolean verif = false;
		
		Statement statement;
		try {
			statement = getStatement();
			
			ResultSet result = statement.executeQuery(sql);
			verif = result.next();	
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			return verif;
		}
		return verif;
	}
}
